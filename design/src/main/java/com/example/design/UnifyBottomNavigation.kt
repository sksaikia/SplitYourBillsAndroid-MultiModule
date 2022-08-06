package com.example.design

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.navigation.NavigationItem

@Composable
fun UnifyBottomNavigation(navController : NavController, items : List<NavigationItem>) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(painterResource(id = item.icon), contentDescription = item.title )
                },
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