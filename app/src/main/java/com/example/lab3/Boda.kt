package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab3.ui.theme.Lab3Theme

class Boda : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    boda()
                }
            }
        }
    }
}

@Composable
fun boda() {
    Column {
        val imgb1 = R.drawable.b1
        val imgb1p = painterResource(id = imgb1)

        Image(
            painter = imgb1p,
            contentDescription = "Boda 1"
        )

        val imgb2 = R.drawable.b2
        val imgb2p = painterResource(id = imgb2)

        Image(
            painter = imgb2p,
            contentDescription = "Boda 2"
        )

        val imgb3 = R.drawable.b3
        val imgb3p = painterResource(id = imgb3)

        Image(
            painter = imgb3p,
            contentDescription = "Boda 3"
        )

        val imgb4 = R.drawable.b4
        val imgb4p = painterResource(id = imgb4)

        Image(
            painter = imgb4p,
            contentDescription = "Boda 4"
        )

        val imgb5 = R.drawable.b5
        val imgb5p = painterResource(id = imgb5)

        Image(
            painter = imgb5p,
            contentDescription = "Boda 5"
        )
    }
}
