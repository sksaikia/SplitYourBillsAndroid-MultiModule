import android.annotation.SuppressLint
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
import com.example.authentication.presentation.viewModel.registration.RegistrationEvent
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText
import com.example.navigation.NavigationItem
import kotlinx.coroutines.flow.collectLatest

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RegistrationScreen(
    navigateTo : (String) -> Unit,
    authenticationViewModel: AuthenticationViewModel = hiltViewModel()
) {
    var userName by remember{ mutableStateOf("")}
    var phoneNo by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val scaffoldState = rememberScaffoldState()

    LaunchedEffect(key1 = true) {
        authenticationViewModel.registrationEventFlow.collectLatest { event ->
            when(event) {
                is RegistrationEvent.NavigateToHome -> {
                    navigateTo(NavigationItem.SpacesScreen.route)
                }
                is RegistrationEvent.ShowErrorToast -> {
                    scaffoldState.snackbarHostState.showSnackbar(
                        message = event.errorMessage
                    )
                }
            }
        }
    }

    Scaffold(scaffoldState = scaffoldState) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            UnifyText(text = "Split Your Bills", fontSize = 36.sp)
            Spacer(modifier = Modifier.height(10.dp))
            UnifyText(text = "Registration", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(30.dp))
            UnifyEditText(headerText = "Name", onValueChanged = {
                userName = it
            })
            Spacer(modifier = Modifier.height(20.dp))
            UnifyEditText(headerText = "Phone No.", onValueChanged = {
                phoneNo = it
            })
            Spacer(modifier = Modifier.height(20.dp))
            UnifyEditText(headerText = "Password", onValueChanged = {
                password = it
            })
            Spacer(modifier = Modifier.height(50.dp))
            UnifyButton(buttonText = "Register", {
                authenticationViewModel.onRegistrationEvent(
                    RegistrationEvent.OnUserRegistrationClick(
                        userName,
                        phoneNo,
                        password
                    )
                )
            })
        }
    }
}