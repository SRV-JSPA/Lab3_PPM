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

class Amor : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    amor()
                }
            }
        }
    }
}

@Composable
fun amor (){
    Column {
        val imga1 = R.drawable.a1
        val imga1p = painterResource(id = imga1)

        Image(
            painter = imga1p,
            contentDescription = "Amor 1"
        )

        val imga2 = R.drawable.a2
        val imga2p = painterResource(id = imga2)

        Image(
            painter = imga2p,
            contentDescription = "Amor 2"
        )

        val imga3 = R.drawable.a3
        val imga3p = painterResource(id = imga3)

        Image(
            painter = imga3p,
            contentDescription = "Amor 3"
        )

        val imga4 = R.drawable.a4
        val imga4p = painterResource(id = imga4)

        Image(
            painter = imga4p,
            contentDescription = "Amor 4"
        )

        val imga5 = R.drawable.a5
        val imga5p = painterResource(id = imga5)

        Image(
            painter = imga5p,
            contentDescription = "Amor 5"
        )
    }
}

