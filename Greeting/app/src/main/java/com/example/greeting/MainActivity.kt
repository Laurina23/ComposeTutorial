package com.example.greeting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.greeting.ui.theme.GreetingTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val DarkBlue = Color(0xFF0D47A1)
val LightBlue = Color(0xFF42A5F5)
val White = Color(0xFFFFFFFF)
val LightGray = Color(0xFFF5F5F5)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                            .background(LightGray),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Hello Android!",
                            style = TextStyle(
                                color = DarkBlue,
                                fontSize = 45.sp,
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth()
                                .background(White)
                                .padding(16.dp)
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                                .background(White)
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "Column and Row Layouts",
                                style = TextStyle(
                                    color = DarkBlue,
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "with Jetpack Compose",
                                    style = TextStyle(
                                        color = LightBlue,
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                                .background(White),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = " Box Layout",
                                    style = TextStyle(
                                        color = DarkBlue,
                                        fontSize = 36.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                )

                            }
                        }
                    }
                }
            }
        }
    }
}
