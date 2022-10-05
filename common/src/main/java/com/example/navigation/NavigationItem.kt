package com.example.navigation

import androidx.compose.runtime.Composable
import com.example.common.R


sealed class NavigationItem(
    val route : String,
    val title : String,
    val icon : Int = R.drawable.ic_home,
    val navBack : String = ""
) {
    object AuthenticationSelectionScreen : NavigationItem(
        route = "authentication_selection_screen",
        title = "Authentication Selection"
    )

    object LoginScreen : NavigationItem(
        "login_screen",
        title = "Login"
    )

    object RegistrationScreen : NavigationItem(
        "registration_screen",
        title = "Registration"
    )

    object HomeScreen : NavigationItem(
        "home_screen",
        title = "Home",
        icon = R.drawable.ic_home
    )

    object SpacesScreen : NavigationItem(
        route = "spaces_screen",
        title = "Spaces",
        icon = R.drawable.ic_space
    )

    object SpendAnalyzerScreen : NavigationItem(
        route = "spend_analyzer_screen",
        title = "Spend Analyzer",
        icon = R.drawable.ic_spent_analyzer
    )

    object TransactionScreen : NavigationItem(
        route = "transaction_screen",
        title = "TXN",
        icon = R.drawable.ic_transaction
    )

    object ProfileScreen : NavigationItem(
        route = "profile_screen",
        title = "Profile",
        icon = R.drawable.ic_user
    )

    object CreateNewSpaceScreen : NavigationItem(
        route = "create_space_screen",
        title = "Create new Space"
    )

    object ShareSpaceScreen : NavigationItem(
        route = "share_space_screen",
        title = "Share Space"
    )

    object SpaceDetailsScreen : NavigationItem(
        route = "space_details_screen",
        title = "Space Details"
    )

    object ContactPickerScreen : NavigationItem(
        route = "contact_picker_screen",
        title = "Contact Picker"
    )

    object ManualBillSplitScreen : NavigationItem(
        route = "manual_bill_split",
        title = "Manual Bill Split"
    )

    object CreateNewTransactionScreen : NavigationItem(
        route = "create_new_txn",
        title = "Create New Transaction"
    )

    fun withArgs(vararg args : String) : String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}