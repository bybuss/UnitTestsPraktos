package bob.colbaskin.unittesting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import bob.colbaskin.unittesting.ui.theme.UnitTestingTheme
import androidx.compose.material3.Surface
import bob.colbaskin.unittesting.presentation.GameScreen
import bob.colbaskin.unittesting.presentation.GameViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitTestingTheme {
                val viewModel: GameViewModel = GameViewModel()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    GameScreen(viewModel)
                }
            }
        }
    }
}
