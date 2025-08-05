package com.example.pj1.presentation.productDetails

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.pj1.presentation.Product
import com.example.pj1.ui.theme.Pj1Theme

@Composable
fun ProductDetails(
    //navController: NavController ,
    product: Product
) {
    Pj1Theme {
        Scaffold { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFFFA451))
            ) {
                Column (
                    modifier = Modifier.padding(innerPadding)
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(product.imageUrl)
                                    .crossfade(true)
                                    .build()
                            ),
                            contentDescription = null,
                            modifier = Modifier
                                .width(303.dp)
                                .height(303.dp)
                        )
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                            .background(
                                Color.White,
                                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
                            )

                    ) {
                        Column(
                            modifier = Modifier
                                .padding(vertical = 35.dp, horizontal = 16.dp)
                        ) {
                            Text(
                                product.name,
                                fontWeight = FontWeight.Bold,
                                fontSize = 32.sp,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )

                            Row(verticalAlignment = Alignment.CenterVertically ,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .padding(vertical = 10.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(32.dp)
                                            .clip(CircleShape)
                                            .clickable { }
                                            .border(BorderStroke(1.dp, Color.Black), CircleShape),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(text = "-", fontSize = 32.sp, color = Color.Black,
                                            modifier = Modifier
                                            .wrapContentSize(Alignment.Center))
                                    }

                                    Text(
                                        "1",
                                        fontWeight = FontWeight.W500,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(10.dp)
                                    )

                                    Box(
                                        modifier = Modifier
                                            .size(32.dp)
                                            .clip(CircleShape)
                                            .background(
                                                color = Color(0xFFFFF2E7),
                                                shape = RoundedCornerShape(50.dp)
                                            )
                                            .clickable { },
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(text = "+", fontSize = 32.sp, color = Color(0xFFFFA451), textAlign = TextAlign.Center)
                                    }

                                }

                                Text(product.price.toString() + "$", fontWeight = FontWeight.W500, fontSize = 24.sp)

                            }

                            HorizontalDivider(
                                modifier = Modifier.padding(vertical = 8.dp),
                                thickness = 1.dp,
                                color = Color(0xFFF3F3F3)
                            )


                            Column(modifier = Modifier
                                .padding(vertical = 10.dp)) {
                                Text(
                                    text = "One Pack Contains:",
                                    fontWeight = FontWeight.W500,
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    modifier = Modifier.drawBehind {
                                        drawLine(
                                            color = Color(0xFFFFA451),
                                            strokeWidth = 5f,
                                            start = Offset(0f, size.height),
                                            end = Offset(size.width, size.height)
                                        )
                                    }
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(product.ingredient, fontWeight = FontWeight.W300, fontSize = 16.sp)

                            }

                            HorizontalDivider(
                                modifier = Modifier.padding(vertical = 8.dp),
                                thickness = 1.dp,
                                color = Color(0xFFF3F3F3)
                            )

                            Text(
                                text = product.description,
                                fontWeight = FontWeight.W300,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(vertical = 10.dp)
                            )

                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(32.dp)
                                        .clip(CircleShape)
                                        .background(
                                            color = Color(0xFFFFA451),
                                            shape = RoundedCornerShape(50.dp)
                                        )
                                        .clickable { },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(text = "+", fontSize = 20.sp, color = Color.White)
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
                                        Text("Add to basket")
                                    }
                                }
                            }
                        }
                    }

                }
            }

        }
    }

}

@Preview(showBackground = true)
@Composable
fun ProductDetailsPreview() {
    val sampleProduct = Product(
        name = "Delicious Juice",
        description = "A refreshing blend of fruits.",
        imageUrl = "https://via.placeholder.com/300",
        ingredient = "Apple, Orange, Mango",
        id = 1,
        price = 200
    )

    Pj1Theme {
        ProductDetails(product = sampleProduct)
    }
}
