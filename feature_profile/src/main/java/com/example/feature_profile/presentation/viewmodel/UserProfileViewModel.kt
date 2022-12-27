package com.example.feature_profile.presentation.viewmodel

import android.content.ContentResolver
import android.database.Cursor
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.feature_profile.domain.usecase.GetProfileInfoUseCase
import com.example.feature_profile.domain.usecase.UploadProfilePicUseCase
import com.example.feature_profile.presentation.viewmodel.state.ProfilePicUploadState
import com.example.feature_profile.presentation.viewmodel.state.UserProfileState
import com.example.session.SessionManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.asRequestBody
import java.io.File
import javax.inject.Inject


@HiltViewModel
class UserProfileViewModel @Inject constructor(
    private val getProfileInfoUseCase: GetProfileInfoUseCase,
    private val uploadProfilePicUseCase: UploadProfilePicUseCase,
) : ViewModel() {

    var userProfileInfo by mutableStateOf(UserProfileState())
    var profilePicUpload by mutableStateOf(ProfilePicUploadState())

    fun getProfileDetail() {
        viewModelScope.launch {
            getProfileInfoUseCase.invoke()
                .collectLatest { result ->
                    when (result) {
                        is com.example.network.Result.Success -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = false,
                                response = result.data
                            )
                        }
                        is com.example.network.Result.Error -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = false,
                                response = null
                            )
                        }
                        is com.example.network.Result.Loading -> {
                            userProfileInfo = userProfileInfo.copy(
                                isLoading = true
                            )
                        }
                    }
                }
        }
    }

    fun uploadProfilePic(imageUri: String) {
        val file = File(imageUri)
        val requestFile: RequestBody = file.asRequestBody(MultipartBody.FORM)
        val body = MultipartBody.Part.createFormData("file", file.name, requestFile)
        viewModelScope.launch {
            uploadProfilePicUseCase.invoke(body).collectLatest { result ->
                when(result) {
                    is com.example.network.Result.Success -> {
                        profilePicUpload = profilePicUpload.copy(
                            response = result.data,
                            isLoading = false
                        )
                    }
                    is com.example.network.Result.Error -> {
                        profilePicUpload = profilePicUpload.copy(
                            response = result.data,
                            isLoading = false
                        )
                    }
                    is com.example.network.Result.Loading -> {
                        profilePicUpload = profilePicUpload.copy(
                            response = null,
                            isLoading = true
                        )
                    }
                }
            }

        }
    }

     fun getRealPathFromURI(contentURI: Uri, contentResolver: ContentResolver): String? {
        val result: String?
        val cursor: Cursor? = contentResolver.query(contentURI, null, null, null, null)
        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.path
        } else {
            cursor.moveToFirst()
            val idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA)
            result = cursor.getString(idx)
            cursor.close()
        }
        return result
    }



}
