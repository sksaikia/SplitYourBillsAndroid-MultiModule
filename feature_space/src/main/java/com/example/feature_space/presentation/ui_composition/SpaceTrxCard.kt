package com.example.feature_space.presentation.ui_composition

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.PopText

@Composable
fun SpaceTrxCard(
    headerText: String,
    icon: Int = 0,
    amount: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 12.dp
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                PopText(text = headerText, fontSize = 12.sp, fontWeight = FontWeight.Thin)
                Image(painterResource(id = icon), contentDescription = "")
            }
            Spacer(modifier = Modifier.height(5.dp))
            PopText(text = "₹ $amount", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}
