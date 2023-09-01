package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lab3.ui.theme.Lab3Theme

class menu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {
                // A surface container using the 'background' color from the theme

            }
        }
    }
}

@Composable
fun menu(navController:NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {

    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                navController.navigate(route = Screens.Boda.ruta)
                      },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Boda")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(route = Screens.Amor.ruta)
                      },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Amor")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(route = Screens.Grad.ruta)
                      },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Graduación")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(route = Screens.Cumple.ruta)
                      },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cumpleaños")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    Lab3Theme {

    }
}