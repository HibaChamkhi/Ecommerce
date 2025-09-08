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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.pj1.R
import com.example.pj1.ui.theme.Pj1Theme

@Composable
fun OnBoarding(navController: NavController) {
    Pj1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.6f)
                        .background(Color(0xFFFFA451))
                ) {
                    Image(
                        painterResource(R.drawable.group_61),
                        contentDescription = "Content description for visually impaired",
                        modifier = Modifier
                            .width(303.dp)   // Fixed width
                            .height(303.dp)
                            .align(Alignment.Center)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(vertical = 35.dp, horizontal = 16.dp )
                ) {
                    Text("Get The Freshest Fruit Salad Combo" , fontWeight = FontWeight.Bold ,  fontSize = 20.sp , modifier = Modifier.padding(bottom = 10.dp) )
                    Text("We deliver the best and freshest fruit salad in town. Order for a combo today!!!" , fontWeight = FontWeight.W300 ,  fontSize = 16.sp )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 20.dp, horizontal = 16.dp)
                        .background(
                            color = Color(0xFFFFA451),
                            shape = RoundedCornerShape(12.dp)
                        )
                ) {
                    TextButton(
                        onClick = {
                            navController.navigate(Screen.AuthenticationScreen.route)
                        },
                        modifier = Modifier.align(Alignment.Center),
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color.White
                        )
                    ) {
                        Text("Let’s Continue")
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun OnBoardingPreview() {
    Pj1Theme {
        OnBoarding(navController = rememberNavController())
    }
}