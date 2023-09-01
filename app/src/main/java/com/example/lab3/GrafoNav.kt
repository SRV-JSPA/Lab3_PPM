package com.example.lab3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


    @Composable
    fun setupNavGraph(
        navController: NavHostController
    ) {
     NavHost(
         navController = navController,
         startDestination = Screens.Home.ruta
     )   {
        composable(
            route = Screens.Home.ruta
        ){
            lab3APP()
        }
         composable(
             route = Screens.SignIn.ruta
         ){
             Amor()
         }
     }
    }
