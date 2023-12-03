package com.dev.thoughtctl.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dev.thoughtctl.MyApp

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            (application as MyApp).appComponent.inject(this)
            MessageCard(name = "Hello Moto")
        }
    }

    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name!")
    }
    
    @Preview
    @Composable
    fun PreviewMessageCard() {
        MessageCard("Android")
    }
}