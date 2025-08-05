package com.example.pj1.presentation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ){
        composable(route = Screen.SplashScreen.route){
            Splash(navController = navController)
        }
        composable(route = Screen.OnBoardingScreen.route){
            WelcomeScreen()
        }
    }
}