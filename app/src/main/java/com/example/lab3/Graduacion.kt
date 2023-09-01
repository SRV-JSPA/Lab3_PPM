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

class Graduacion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var navController: NavHostController
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                navController = rememberNavController()
                setupNavGraph(navController = navController)
            }
        }
    }
}

@Composable
fun graduacion (navController: NavController){
    Column {
        val imgg1 = R.drawable.g1
        val imgg1p = painterResource(id = imgg1)


        Cimagen(
            painter = imgg1p,
            contentDescription = "grad 1",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgg2 = R.drawable.g2
        val imgg2p = painterResource(id = imgg2)

        Cimagen(
            painter = imgg2p,
            contentDescription = "grad 2",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgg3 = R.drawable.g3
        val imgg3p = painterResource(id = imgg3)

        Cimagen(
            painter = imgg3p,
            contentDescription = "grad 3",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )
        val imgg4 = R.drawable.g4
        val imgg4p = painterResource(id = imgg4)

        Cimagen(
            painter = imgg4p,
            contentDescription = "grad 4",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgg5 = R.drawable.g5
        val imgg5p = painterResource(id = imgg5)

        Cimagen(
            painter = imgg5p,
            contentDescription = "grad 5",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )
    }
}