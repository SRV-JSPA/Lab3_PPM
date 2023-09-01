package com.example.lab3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab3.ui.theme.Lab3Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class lab3APP : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            Lab3Theme {


            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Isesion(navController:NavController, usuario:String, password:String) {
    var pantallalog by remember { mutableStateOf(0) }

    // Agregar variables para almacenar datos de usuario y contraseña
    var savedUsername = usuario
    var savedPassword = password

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }

    Surface(

        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Iniciar sesión",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = usernameInput,
            onValueChange = { usernameInput = it },
            label = { Text(text = "Usuario") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(text = "Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Button(
            onClick = {

                // Verificar usuario y contraseña
                if (usernameInput == savedUsername && passwordInput == savedPassword) {
                    pantallalog = 1
                    // Iniciar sesión exitosamente
                    showError = false
                } else {
                    // Mostrar error si no coinciden
                    showError = true
                }


            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Iniciar sesión")
        }


        if (showError) {
            Text(
                text = "Usuario o contraseña incorrecta",
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(top = 8.dp)
            )
        }


    }


    when (pantallalog) {
        1 -> menu { selectedMenuItem ->

            when (selectedMenuItem) {
                1 -> {pantallalog = 3}
                2 -> {}

            }
        }
        2 -> println("a")
            //crearUsuario()
            /**{ newUsername, newPassword ->
            savedUsername = newUsername
            savedPassword = newPassword
            pantallalog = 0
        }**/


    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab3Theme {
        Isesion(
            navController = rememberNavController(),
                "Usuario","Contraseña"
            )
    }
}