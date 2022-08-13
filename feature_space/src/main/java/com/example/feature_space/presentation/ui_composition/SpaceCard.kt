package com.example.feature_space.presentation.ui_composition

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.UnifyChip
import com.example.design.UnifyLabel
import com.example.design.UnifyText


@Composable
fun SpaceCard(
    spaceName : String ,
    date : String,
    otherUserCount : Int,
    amount : Int
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 12.dp
    ) {
        Box(modifier = Modifier
            .padding(
                start = 16.dp,
                top = 8.dp,
                end = 8.dp,
                bottom = 8.dp
            )
        ) {

            Column(modifier = Modifier.fillMaxSize()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    UnifyText(spaceName, fontWeight = FontWeight.ExtraBold, fontSize = 14.sp)
                    UnifyLabel(date)
                }
                Spacer(modifier = Modifier.height(10.dp))
                UnifyChip(date)
                Spacer(modifier = Modifier.height(10.dp))
                UnifyText(text = "+ ₹ ${amount}",
                    fontSize = 14.sp,
                    fontColor = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


