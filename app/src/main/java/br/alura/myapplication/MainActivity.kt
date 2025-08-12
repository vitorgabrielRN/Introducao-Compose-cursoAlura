package br.alura.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.alura.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Teste(modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }
}

@Composable
fun Teste(modifier: Modifier = Modifier) {
    Column {
        Text(
            text = ("sera se está funcionando"),
            modifier = Modifier.padding(
                horizontal = 40.dp,
                vertical = 20.dp
            ),
        )
    }
}


@Preview
@Composable
private fun Teste() {
    Teste()
}