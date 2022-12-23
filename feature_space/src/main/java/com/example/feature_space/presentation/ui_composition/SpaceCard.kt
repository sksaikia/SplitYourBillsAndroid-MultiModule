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
import com.example.design.PopChip
import com.example.design.PopLabel
import com.example.design.PopText

@Composable
fun SpaceCard(
    spaceName: String,
    date: String,
    otherUserCount: Int,
    amount: Int,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .padding(8.dp),
        elevation = 12.dp
    ) {
        Box(
            modifier = Modifier
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
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PopText(modifier = Modifier.weight(0.6f), text = spaceName, fontWeight = FontWeight.ExtraBold, fontSize = 14.sp, shouldSetMaxLines = true)
                    PopLabel(modifier = Modifier.weight(0.4f), text =  date)
                }
                Spacer(modifier = Modifier.height(10.dp))
                PopChip(date)
                Spacer(modifier = Modifier.height(10.dp))
                PopText(
                    text = "+ ₹ $amount",
                    fontSize = 14.sp,
                    fontColor = Color.Green,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
