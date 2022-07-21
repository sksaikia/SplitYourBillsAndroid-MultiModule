import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.design.UnifyButton
import com.example.design.UnifyEditText
import com.example.design.UnifyText

@Composable
fun LoginScreen(navController: NavHostController, name : String?) {
    Column( verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        UnifyText(text = "Split Your Bills", fontSize = 36.sp)
        Spacer(modifier = Modifier.height(10.dp))
        UnifyText(text = "Login", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(30.dp))
        UnifyEditText(headerText = "Phone No.")
        Spacer(modifier = Modifier.height(20.dp))
        UnifyEditText(headerText = "Password")
        Spacer(modifier = Modifier.height(50.dp))
        UnifyButton(buttonText = "Login")
        Log.d("Fatal", "LoginScreen: $name")
    }
}