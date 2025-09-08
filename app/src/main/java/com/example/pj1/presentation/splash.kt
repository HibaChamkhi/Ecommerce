package com.example.pj1.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pj1.R
import com.example.pj1.ui.theme.Pj1Theme
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavController) {
    Pj1Theme {
        LaunchedEffect(key1 = true) {
            delay(2000L)
            navController.navigate(Screen.OnBoardingScreen.route)
        }

        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .background(Color.White)
                ) {
                    Image(
                        painterResource(R.drawable.splash),
                        contentDescription = "Content description for visually impaired",
                        modifier = Modifier
                            .width(303.dp)
                            .height(303.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pj1Theme {
        Splash(navController = rememberNavController())
    }
}