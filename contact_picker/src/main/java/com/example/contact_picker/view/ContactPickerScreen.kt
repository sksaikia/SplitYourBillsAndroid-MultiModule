package com.example.contact_picker.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.design.UnifyText
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.contact_picker.entity.Contact
import com.example.design.UnifyText

@Composable
fun ContactPickerScreen(
    navigateTo : (String) -> Unit,
 //   spaceViewModel: SpaceViewModel = hiltViewModel()
) {
    var items by remember {
        mutableStateOf(
            (1..20).map {
                Contact(
                    name = "Name :  $it"
                )
            }
        )
    }

    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        items(items.size) { i ->
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        items = items.mapIndexed { j, item ->
                            if (i == j) {
                                item.copy(isSelected = !item.isSelected)
                            } else
                                item
                        }
                    }
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                UnifyText(text = items[i].name ?: "")
                if (items[i].isSelected) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "",
                        tint = Color.Green,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }
    }
}
