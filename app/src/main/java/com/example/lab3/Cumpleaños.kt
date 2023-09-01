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

class Cumpleaños : ComponentActivity() {
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
fun cumple (navController: NavController){
    Column {
        val imgc1 = R.drawable.c1
        val imgc1p = painterResource(id = imgc1)

        Cimagen(
            painter = imgc1p,
            contentDescription = "cumple 1",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )
        val imgc2 = R.drawable.c2
        val imgc2p = painterResource(id = imgc2)


        Cimagen(
            painter = imgc2p,
            contentDescription = "cumple 2",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgc3 = R.drawable.c3
        val imgc3p = painterResource(id = imgc3)


        Cimagen(
            painter = imgc3p,
            contentDescription = "cumple 3",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgc4 = R.drawable.c4
        val imgc4p = painterResource(id = imgc4)


        Cimagen(
            painter = imgc4p,
            contentDescription = "cumple 4",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )

        val imgc5 = R.drawable.c5
        val imgc5p = painterResource(id = imgc5)


        Cimagen(
            painter = imgc5p,
            contentDescription = "cumple 5",
            onClick = {
                navController.navigate(route = Screens.EditCartas.ruta)
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Lab3Theme {

    }
}