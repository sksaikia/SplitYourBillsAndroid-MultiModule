package com.example.media_picker.presentation.screen

import android.Manifest
import android.content.ContentResolver
import android.content.ContentUris
import android.net.Uri
import android.provider.MediaStore
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.design.PopText
import com.example.media_picker.presentation.MediaPickerViewModel
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.rememberMultiplePermissionsState

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun MediaPickerScreen(
    navigateTo: (String) -> Unit,
    viewModel: MediaPickerViewModel = hiltViewModel()
) {
    val permissionState = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.READ_EXTERNAL_STORAGE,
        )
    )

    val imageList = viewModel.listState

    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect(
        key1 = lifecycleOwner,
        effect = {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_START) {
                    permissionState.launchMultiplePermissionRequest()
                }
            }
            lifecycleOwner.lifecycle.addObserver(observer)

            onDispose {
                lifecycleOwner.lifecycle.removeObserver(observer)
            }
        }
    )

//    hideErrorText()
    if (permissionState.allPermissionsGranted) {
        //  contactsViewModel.fetchContactList(LocalContext.current.contentResolver)
        //    getImagePath(LocalContext.current.contentResolver)
    }

    if (permissionState.allPermissionsGranted) {
        viewModel.queryImageStorage(LocalContext.current.contentResolver)

        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(imageList.listImage?.size ?: 0) { i ->
                AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                    .data(imageList.listImage?.get(i))
                    .crossfade(true)
                    .build(), contentDescription = "" )
            }
        }
    } else {
        permissionState.permissions.forEach { perm ->
            when (perm.permission) {
                Manifest.permission.READ_CONTACTS -> {
                    when {
                        perm.hasPermission -> {
                            Column(modifier = Modifier.fillMaxWidth()) {
                                PopText(text = "Permission Given YES ")
                            }
                        }
                        perm.shouldShowRationale -> {
                            Column(modifier = Modifier.fillMaxWidth()) {
                                PopText(text = "Permission is need to access the contact List ")
                            }
                        }
                        !perm.hasPermission && !perm.shouldShowRationale -> {
                            Column(modifier = Modifier.fillMaxWidth()) {
                                PopText(text = "Permission was permanenty denied , Set it from Settings ")
                            }
                        }
                    }
                }
            }
        }
    }
}

private val imagePaths: ArrayList<Uri>? = null
private fun queryImageStorage(contentResolver: ContentResolver) {
    val imageProjection = arrayOf(
        MediaStore.Images.Media.DISPLAY_NAME,
        MediaStore.Images.Media.SIZE,
        MediaStore.Images.Media.DATE_TAKEN,
        MediaStore.Images.Media._ID
    )

    val imageSortOrder = "${MediaStore.Images.Media.DATE_TAKEN} DESC"

    val cursor = contentResolver.query(
        MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
        imageProjection,
        null,
        null,
        imageSortOrder
    )

    cursor.use {
        it?.let {
            val idColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
            val nameColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media.DISPLAY_NAME)
            val sizeColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media.SIZE)
            val dateColumn = it.getColumnIndexOrThrow(MediaStore.Images.Media.DATE_TAKEN)

            while (it.moveToNext()) {
                val id = it.getLong(idColumn)
                val name = it.getString(nameColumn)
                val size = it.getString(sizeColumn)
                val date = it.getString(dateColumn)
                Log.d("FATAL", "queryImageStorage $name")
                val contentUri = ContentUris.withAppendedId(
                    MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    id
                )
                imagePaths?.add(contentUri)
                Log.d("FATAL", "queryImageStorage: $contentUri")
                // add the URI to the list
                // generate the thumbnail
                //     val thumbnail = contentResolver.loadThumbnail(contentUri, Size(480, 480), null)
            }
        } ?: kotlin.run {
            Log.e("TAG", "Cursor is null!")
        }
    }
}

// Cursor cursor = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, columns, null, null, orderBy);
//
// // below line is to get total number of images
// int count = cursor.getCount();
//
// // on below line we are running a loop to add
// // the image file path in our array list.
// for (int i = 0; i < count; i++) {
//
//    // on below line we are moving our cursor position
//    cursor.moveToPosition(i);
//
//    // on below line we are getting image file path
//    int dataColumnIndex = cursor.getColumnIndex(MediaStore.Images.Media.DATA);
//
//    // after that we are getting the image file path
//    // and adding that path in our array list.
//    imagePaths.add(cursor.getString(dataColumnIndex));
// }
// imageRVAdapter.notifyDataSetChanged();
