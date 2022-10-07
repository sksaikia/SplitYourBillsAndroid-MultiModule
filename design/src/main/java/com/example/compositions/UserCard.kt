package com.example.compositions

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText

@Composable
fun UserCard(
    name: String = "",
    phoneNo: String = "",
    modifier: Modifier = Modifier,
    shouldShowContributionAmount: Boolean = false,
    amount: Int = 0
) {
    Row(
        modifier = modifier.padding(horizontal = 20.dp).fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        UnifyText(
            modifier = Modifier
                .padding(8.dp)
                .drawBehind {
                    drawCircle(
                        color = getRandomColor(),
                        radius = 60f
                    )
                },
            text = getShortName(name).uppercase(),
            fontColor = Color.White
        )
        Spacer(modifier = modifier.width(20.dp))
        UnifyText(text = name)
        Spacer(modifier = modifier.width(100.dp))
        if (shouldShowContributionAmount) {
            UnifyText(text = amount.toString(), fontWeight = FontWeight.Bold)
        }
    }
}


