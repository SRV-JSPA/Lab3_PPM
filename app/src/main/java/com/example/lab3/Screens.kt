package com.example.lab3

const val USUARIO_ARGUMENT_KEY1 = "username"
const val USUARIO_ARGUMENT_KEY2 = "password"
sealed class Screens(val ruta:String){

    object Home: Screens(ruta = "sign_in")
    object LogIn: Screens(ruta = "log_in/{$USUARIO_ARGUMENT_KEY1}/{$USUARIO_ARGUMENT_KEY2}"){
        fun passUserAndPassword(
            user:String,
            password:String
        ):String{
            return "log_in/$user/$password"
        }
    }

    object Boda: Screens(ruta = "boda")
}
