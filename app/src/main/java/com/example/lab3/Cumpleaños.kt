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

class Cumpleaños : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    cumple()
                }
            }
        }
    }
}

@Composable
fun cumple (){
    Column {
        val imgc1 = R.drawable.c1
        val imgc1p = painterResource(id = imgc1)

        Image(
            painter = imgc1p,
            contentDescription = "Cumpleaños 1"
        )
        val imgc2 = R.drawable.c2
        val imgc2p = painterResource(id = imgc2)

        Image(
            painter = imgc2p,
            contentDescription = "Cumpleaños 2"
        )
        val imgc3 = R.drawable.c3
        val imgc3p = painterResource(id = imgc3)

        Image(
            painter = imgc3p,
            contentDescription = "Cumpleaños 3"
        )

        val imgc4 = R.drawable.c4
        val imgc4p = painterResource(id = imgc4)

        Image(
            painter = imgc4p,
            contentDescription = "Cumpleaños 4"
        )

        val imgc5 = R.drawable.c5
        val imgc5p = painterResource(id = imgc5)

        Image(
            painter = imgc5p,
            contentDescription = "Cumpleaños 5"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Lab3Theme {

    }
}