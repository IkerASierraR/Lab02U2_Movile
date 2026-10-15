package com.example.deviceretrofitsierra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.deviceretrofitsierra.data.Device
import com.example.deviceretrofitsierra.data.Spec
import com.example.deviceretrofitsierra.ui.theme.DeviceRetrofitSierraTheme
import com.example.deviceretrofitsierra.view.MainView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DeviceRetrofitSierraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainView(modifier = Modifier.padding(innerPadding),
                        listOf(Device(1,
                            "Google Pixel 6 Pro",
                            Spec("While", "158Gb", "Celphone")
                        ), Device(2,
                            "iPgone 17 Pro",
                            null)
                        )
                        )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DeviceRetrofitSierraTheme {
        Greeting("Android")
    }
}