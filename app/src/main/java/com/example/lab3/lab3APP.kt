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
import androidx.compose.ui.res.painterResource

class lab3APP : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab3Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Isesion()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun crearUsuario(onUserCreated: (String, String) -> Unit) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Crear Usuario",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Ingrese el usuario") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Ingrese la contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Button(
            onClick = {
                // Llamar a la función proporcionada para guardar los datos
                onUserCreated(username, password)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Crear Usuario")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Isesion() {
    var pantallalog by remember { mutableStateOf(0) }

    // Agregar variables para almacenar datos de usuario y contraseña
    var savedUsername by remember { mutableStateOf("") }
    var savedPassword by remember { mutableStateOf("") }

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }



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
                    // Iniciar sesión exitosamente
                    showError = false
                } else {
                    // Mostrar error si no coinciden
                    showError = true
                }

                pantallalog = 1
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Iniciar sesión")
        }

        Button(
            onClick = {
                pantallalog = 2
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Crear Usuario")
        }

        if (showError) {
            Text(
                text = "Usuario o contraseña incorrecta",
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier.padding(top = 8.dp)
            )
        }

        when (pantallalog) {
            1 -> menu { selectedMenuItem ->

                when (selectedMenuItem) {
                    1 -> {pantallalog =3}
                    2 -> {}

                }
            }
                2 -> crearUsuario { newUsername, newPassword ->
                savedUsername = newUsername
                savedPassword = newPassword
                pantallalog = 0
            }

            3 -> boda()
        }
    }
}

@Composable
fun menu(onMenuItemClick: (Int) -> Unit){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { onMenuItemClick(1) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Boda")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onMenuItemClick(2) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Amor")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onMenuItemClick(2) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Graduación")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { onMenuItemClick(2) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Cumpleaños")
        }


    }
}

@Composable
fun boda (){
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



@Composable
fun amor (){
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

@Composable
fun graduacion (){
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab3Theme {
        Isesion()
    }
}