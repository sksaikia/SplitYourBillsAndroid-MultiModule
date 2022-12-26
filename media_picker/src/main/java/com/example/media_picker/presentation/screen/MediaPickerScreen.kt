package com.example.media_picker.presentation.screen

import android.Manifest
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.size.Scale
import com.example.common.R
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
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
    )

    val imageList = viewModel.listState

    var checkedIndex by remember {
        mutableStateOf(0)
    }

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

    if (permissionState.allPermissionsGranted) {
        viewModel.queryImageStorage(LocalContext.current.contentResolver)
        Column(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imageList.listImage?.get(checkedIndex))
                    .crossfade(true)
                    .scale(Scale.FIT)
                    .build(),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )

            Divider(modifier = Modifier.fillMaxWidth().height(5.dp), color = Color.DarkGray)

            Row(modifier = Modifier.fillMaxWidth().height(60.dp).padding(10.dp), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                PopText(text = "All Images", fontSize = 18.sp)
                val displayIcon: Painter = painterResource(
                    id = com.example.media_picker.R.drawable.ic_photo_camera
                )
                Image(painter = displayIcon, contentDescription = "")
            }

            Divider(modifier = Modifier.fillMaxWidth().height(5.dp), color = Color.DarkGray)


            LazyVerticalGrid(modifier = Modifier.fillMaxWidth(), columns = GridCells.Fixed(2)) {
                items(imageList.listImage?.size ?: 0) { i ->

                    ConstraintLayout {
                        val (image, selector) = createRefs()

                        AsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(imageList.listImage?.get(i))
                                .crossfade(true)
                                .scale(Scale.FIT)
                                .build(),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                                .constrainAs(image) {
                                    top.linkTo(parent.top)
                                    bottom.linkTo(parent.bottom)
                                    start.linkTo(parent.start)
                                    end.linkTo(parent.end)
                                }
                                .clickable {
                                    checkedIndex = i
                                }
                        )
                        Checkbox(
                            checked = checkedIndex == i,
                            onCheckedChange = {
                                checkedIndex = i
                            },
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp)
                                .constrainAs(selector) {
                                    top.linkTo(parent.top)
                                    end.linkTo(parent.end)
                                }

                        )
                    }
                }
            }
        }
    } else {
        permissionState.permissions.forEach { perm ->
            when (perm.permission) {
                Manifest.permission.READ_EXTERNAL_STORAGE -> {
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
