package com.example.feature_profile

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.compositions.UserEditableCard
import com.example.design.UnifyButton

@Composable
fun ProfileScreen(navigateTo: (String) -> Unit) {
    LazyColumn() {
        item {
            UnifyButton(buttonText = "Eren", onClickButton = {
                Log.d("EREN", "ProfileScreen: a")
            })
        }
        items(10) { i ->
           UserEditableCard("ABC $i")
        }
    }
}
