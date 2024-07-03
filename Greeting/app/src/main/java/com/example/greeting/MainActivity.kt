package com.example.greeting

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import com.example.greeting.ui.theme.GreetingTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
        Log.d(TAG, "onCreate Called")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

}
val Blue = Color(0xFF0047AB)
val LightBlue = Color(0xFFADD8E6)
val Periwinkle = Color(0xFFCCCCFF)
@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val gradientColors = listOf(Blue, LightBlue, Periwinkle)
    Text(text = "Jetpack Compose",
        style = TextStyle(
            brush = Brush.linearGradient(
                colors = gradientColors
            )
        ),
        fontSize = 60.sp,
        fontWeight = FontWeight.Normal,
        modifier = modifier
            .background(Color(0xFF121212))
            .padding(28.dp)
            .fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingTheme {
        Greeting()
    }
}