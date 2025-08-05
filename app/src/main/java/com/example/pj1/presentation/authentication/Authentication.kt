package com.example.pj1.presentation.authentication

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
import androidx.compose.material3.OutlinedTextField
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
import com.example.pj1.R
import com.example.pj1.ui.theme.Pj1Theme

@Composable
fun Authentication() {
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
                        .padding(vertical = 35.dp, horizontal = 16.dp)
                ) {
                    Text(
                        "What is your firstname?",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(bottom = 10.dp)
                    )

                    OutlinedTextField(
                        value = "",
                        onValueChange = {

                        },
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                        Text("Enter your name.. ")
                        },

                    )

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

                        },
                        modifier = Modifier.align(Alignment.Center),
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color.White
                        )
                    ) {
                        Text("Start Ordering")
                    }
                }
            }
        }
    }
}

//@Composable
//fun GrayFilledOutlinedTextField() {
//    var text by remember { mutableStateOf("") }
//
//    OutlinedTextField(
//        value = text,
//        onValueChange = { text = it },
//        modifier = Modifier.fillMaxWidth(),
//        placeholder = {
//            Text(
//                text = "Enter text here",
//                color = Color.White
//            )
//        },
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            containerColor = Color.Gray,
//            textColor = Color.White,
//            placeholderColor = Color.White,
//            focusedBorderColor = Color.LightGray,
//            unfocusedBorderColor = Color.DarkGray
//        )
//    )
//}
@Preview(showBackground = true)
@Composable
fun AuthenticationPreview() {
    Pj1Theme {
        Authentication()
    }
}