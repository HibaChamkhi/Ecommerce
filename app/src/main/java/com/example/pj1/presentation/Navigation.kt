package com.example.pj1.presentation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pj1.presentation.Screen.OnBoardingScreen
import com.example.pj1.presentation.authentication.Authentication

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
            OnBoarding(navController = navController)
        }
        composable(route = Screen.AuthenticationScreen.route){
            Authentication(navController = navController)
        }
        composable(route = Screen.HomeScreen.route) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: ""
            Home(name = name)
        }
    }
}

