package com.example.design

import android.util.Log
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ErenYeager(string : String){
    Text(
        text  = "From Design $string",
        color = Color.Green
    )
}

@Composable
fun SouravSaikia() {
    Text(
        text = "SkS"
    )
}

fun SKS() {
    Log.d("FATAL", "SKS: ")
}