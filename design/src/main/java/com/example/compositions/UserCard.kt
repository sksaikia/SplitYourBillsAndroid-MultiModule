package com.example.compositions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.design.PopText

@Composable
fun UserCard(
    name: String = "",
    phoneNo: String = "",
    modifier: Modifier = Modifier,
    shouldShowContributionAmount: Boolean = false,
    amount: Int = 0
) {
    val color by remember {
        mutableStateOf(getRandomColor())
    }

    Row(
        modifier = modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        PopText(
            modifier = Modifier
                .padding(8.dp)
                .drawBehind {
                    drawCircle(
                        color = color,
                        radius = 60f
                    )
                },
            text = getShortName(name).uppercase(),
            fontColor = Color.White
        )
        Spacer(modifier = modifier.width(20.dp))
        PopText(text = name)
        Spacer(modifier = modifier.width(100.dp))
        if (shouldShowContributionAmount) {
            PopText(text = "₹ $amount", fontWeight = FontWeight.Bold, shouldSetMaxLines = true)
        }
    }
}


