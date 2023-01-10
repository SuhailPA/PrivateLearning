package com.androidproject.jetpackcomposelearningphase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidproject.jetpackcomposelearningphase1.ui.theme.JetpackComposeLearningPhase1Theme
import java.sql.Struct

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLearningPhase1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage(
                        "Happy Birthday Suhail", "Vajro"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingWithWishes(wishes: String, from: String) {
    Column(content = {
        Text(
            text = wishes,
            fontSize = 26.sp, modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(10.dp)
        )
        Text(
            text = from,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
                .padding(15.dp)
        )
    })
}

@Composable
fun BirthdayGreetingWithImage(wishes: String, from: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box {
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        GreetingWithWishes(wishes = wishes, from = from)
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun BirthdayGreetingCard() {
    BirthdayGreetingWithImage(wishes = "Test Wishes", "Suhail")
}