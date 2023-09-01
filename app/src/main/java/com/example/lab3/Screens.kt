package com.example.lab3

sealed class Screens(val ruta:String){
    object Home: Screens(ruta = "log_in")
    object SignIn: Screens(ruta = "sign_in")
}
