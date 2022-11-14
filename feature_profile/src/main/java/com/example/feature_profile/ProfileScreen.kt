package com.example.feature_profile

import android.util.Log
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.compositions.ShimmerAnimation
import com.example.compositions.UserEditableCard
import com.example.design.UnifyButton
import java.lang.reflect.Modifier

@Composable
fun ProfileScreen(navigateTo: (String) -> Unit) {
    LazyColumn {

        items(10) { i ->
            UserEditableCard("ABC $i")
        }
    }
}
