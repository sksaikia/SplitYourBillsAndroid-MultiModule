package com.example.feature_space.presentation.ui_composition

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.design.UnifyText

@Composable
fun TotalBalanceCard(
    amount: String = "0",
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .padding(12.dp)
            .fillMaxWidth(),
        elevation = 12.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            UnifyText(text = "Total Balance", fontSize = 12.sp, fontWeight = FontWeight.Thin)
            Spacer(modifier = Modifier.height(5.dp))
            UnifyText(text = amount, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        }
    }
}
