package com.demate.l300positivopoc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.demate.l300positivopoc.ui.theme.L300PositivoPocTheme
import com.demate.l300positivopoc.viewmodel.ViewModelPositivo

class MainActivity : ComponentActivity() {
    private val viewModelPositivo: ViewModelPositivo = ViewModelPositivo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            L300PositivoPocTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppContent(
                        name = "L300",
                        modifier = Modifier.padding(innerPadding),
                        viewModelPositivo = viewModelPositivo
                    )
                }
            }
        }
    }
}

@Composable
fun AppContent(name: String, modifier: Modifier = Modifier, viewModelPositivo: ViewModelPositivo) {
    val context = LocalContext.current
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello $name!", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            viewModelPositivo.handleInit(context)
        }) {
            Text("Init Context")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    L300PositivoPocTheme {
        AppContent("L300", viewModelPositivo = ViewModelPositivo())
    }
}