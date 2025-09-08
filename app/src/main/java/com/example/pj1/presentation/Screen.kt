package com.example.pj1.presentation

sealed class Screen(val route: String) {
    object  SplashScreen : Screen("splash_screen")
    object  OnBoardingScreen : Screen("OnBoarding_screen")
    object  AuthenticationScreen : Screen("authentication_screen")
    object  ProductDetailsScreen  : Screen("product_details_screen")
    object  HomeScreen : Screen("home_screen/{name}") {
        fun createRoute(name: String) = "home_screen/$name"
    }
}