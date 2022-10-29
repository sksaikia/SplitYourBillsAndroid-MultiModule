package com.example.design

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.navigation.NavigationItem

@Composable
fun UnifyBottomNavigation(navController : NavController, items : List<NavigationItem>) {
    Column {
        Divider(thickness = 1.dp,color = Color.Black.copy(0.4f))
        BottomNavigation(
            backgroundColor = Color.White,
            elevation = 10.dp,
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route

            items.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            tint = Color.Black,
                            contentDescription = item.title,
                            modifier = Modifier
                                .width(20.dp)
                                .height(20.dp)
                        )
                    },
                    label = { UnifyText(text = item.title, fontColor = Color.Black) },
                    selected = currentRoute == item.route,
                    onClick = {
                        navController.navigate(item.route)
                    },
                    selectedContentColor = Color.Black,
                    unselectedContentColor = Color.Black.copy(0.4f)
                )
            }

        }
    }


}