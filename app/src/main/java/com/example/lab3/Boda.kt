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
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.lab3.ui.theme.Lab3Theme

class Boda : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {

            }
        }
    }
}

@Composable
fun boda(navController: NavController) {
    Column {
        val imgb1 = R.drawable.b1
        val imgb1p = painterResource(id = imgb1)

        Cimagen(
            painter = imgb1p,
            contentDescription = "boda 1",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgb2 = R.drawable.b2
        val imgb2p = painterResource(id = imgb2)

        Cimagen(
            painter = imgb2p,
            contentDescription = "boda 2",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgb3 = R.drawable.b3
        val imgb3p = painterResource(id = imgb3)

        Cimagen(
            painter = imgb3p,
            contentDescription = "boda 3",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgb4 = R.drawable.b4
        val imgb4p = painterResource(id = imgb4)

        Cimagen(
            painter = imgb4p,
            contentDescription = "boda 4",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgb5 = R.drawable.b5
        val imgb5p = painterResource(id = imgb5)

        Cimagen(
            painter = imgb5p,
            contentDescription = "boda 5",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )
    }
}
