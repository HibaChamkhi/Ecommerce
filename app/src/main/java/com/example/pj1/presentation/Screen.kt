package com.example.pj1.presentation

sealed class Screen(val route: String) {
    object  SplashScreen : Screen("splash_screen")
    object  OnBoardingScreen : Screen("OnBoarding_screen")
}