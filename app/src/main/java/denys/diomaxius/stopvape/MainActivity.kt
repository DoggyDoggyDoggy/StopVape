package denys.diomaxius.stopvape

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import denys.diomaxius.stopvape.ui.screens.home.Home
import denys.diomaxius.stopvape.ui.theme.StopVapeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StopVapeTheme {
                Home()
            }
        }
    }
}
