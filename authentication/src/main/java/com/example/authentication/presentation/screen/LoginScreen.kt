import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.authentication.presentation.viewModel.AuthenticationViewModel
import com.example.authentication.presentation.viewModel.login.LoginEvent
import com.example.design.PopButton
import com.example.design.PopEditText
import com.example.design.PopText
import com.example.navigation.NavigationItem
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginScreen(
    navigateTo: (String) -> Unit,
    authenticationViewModel: AuthenticationViewModel = hiltViewModel(),
    name: String?
) {
    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        authenticationViewModel.loginEventFlow.collectLatest { event ->
            when (event) {
                is LoginEvent.NavigateToHome -> {
                    navigateTo(NavigationItem.SpacesScreen.route)
                }
                is LoginEvent.ShowErrorToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
            }
        }
    }

    var state = authenticationViewModel.loginState
    var phoneNo by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Scaffold(scaffoldState = scaffoldState) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PopText(text = "Split Your Bills", fontSize = 36.sp)
            Spacer(modifier = Modifier.height(10.dp))
            PopText(text = "Login", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(30.dp))
            PopEditText(headerText = "Phone No.", onValueChanged = {
                phoneNo = it
            })
            Spacer(modifier = Modifier.height(20.dp))
            PopEditText(headerText = "Password", onValueChanged = {
                password = it
            })
            Spacer(modifier = Modifier.height(50.dp))
            PopButton(buttonText = "Login", {
                Log.d("FATAL", "LoginScreen: $phoneNo , $password")
                authenticationViewModel.onLoginEvent(LoginEvent.OnUserLoginClick(phoneNo, password))
            })
        }
    }
}
