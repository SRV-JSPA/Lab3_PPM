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

class Graduacion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    graduacion()
                }
            }
        }
    }
}

@Composable
fun graduacion (){
    Column {
        val imgg1 = R.drawable.g1
        val imgg1p = painterResource(id = imgg1)

        Image(
            painter = imgg1p,
            contentDescription = "Graduacion 1"
        )

        val imgg2 = R.drawable.g2
        val imgg2p = painterResource(id = imgg2)

        Image(
            painter = imgg2p,
            contentDescription = "Graduacion 2"
        )

        val imgg3 = R.drawable.g3
        val imgg3p = painterResource(id = imgg3)

        Image(
            painter = imgg3p,
            contentDescription = "Graduacion 3"
        )

        val imgg4 = R.drawable.g4
        val imgg4p = painterResource(id = imgg4)

        Image(
            painter = imgg4p,
            contentDescription = "Graduacion 4"
        )

        val imgg5 = R.drawable.g5
        val imgg5p = painterResource(id = imgg5)

        Image(
            painter = imgg5p,
            contentDescription = "Graduacion 5"
        )
    }
}