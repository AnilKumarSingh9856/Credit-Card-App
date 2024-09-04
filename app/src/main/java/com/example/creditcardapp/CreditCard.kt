package com.example.creditcardapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreditCard(cardInfo: CreditCardInfo){

    Card(modifier = Modifier
        .height(200.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(10.dp)
    ) {

        Box {

            Image(
                painter = painterResource(id = cardInfo.backgroundImage),
                contentDescription = "Card Background",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Box (modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
            ){
               Image(
                   painter = painterResource(id = cardInfo.companyImage),
                   contentDescription = "Company Image",
                   modifier = Modifier
                       .width(90.dp)
                       .align(Alignment.TopEnd)
               )
               Column(modifier = Modifier
                   .align(Alignment.BottomStart)
               ) {
                   Text(
                       text = cardInfo.cardNumber,
                       fontSize = 18.sp,
                       letterSpacing = 1.2.sp
                   )
                   Text(
                       text = cardInfo.cardNumber,
                       fontSize = 18.sp,
                       letterSpacing = 1.1.sp
                   )
               }
            }
        }
    }
}