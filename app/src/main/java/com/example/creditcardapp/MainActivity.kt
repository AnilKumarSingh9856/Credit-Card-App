package com.example.creditcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.creditcardapp.ui.theme.CreditCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreditCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   DisplayCards()
                }
            }
        }
    }
}

@Composable
fun DisplayCards(){
    val cards = listOf(
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        ),
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        ),
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        ),
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        ),
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        ),
        CreditCardInfo("1111 2222 3333 4444",
            "Anil Kumar Singh",
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
        )
    )
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(18.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ){
        items(cards){
            card -> CreditCard(cardInfo = card)
        }
    }
}