package com.gq.m.c.l

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
import com.gq.m.c.l.ui.M3LightDarkColorPreviewScreen
import com.gq.m.c.l.ui.theme.AndroidMaterial3ColorListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidMaterial3ColorListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    M3LightDarkColorPreviewScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}