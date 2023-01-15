package com.androidproject.jetpackcomposelearningphase1

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidproject.jetpackcomposelearningphase1.ui.theme.JetpackComposeLearningPhase1Theme

class BuisinessCartActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLearningPhase1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun BuisinessCard() {
    Column(Modifier.background(Color(0xFF191970))) {
        val image = painterResource(id = R.drawable.android_logo)
        Column(
            modifier = Modifier
                .weight(2F)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally)
            )
            Text(
                text = "Suhail P A",
                fontSize = 26.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                color = Color.White
            )
            Text(
                text = "Android Developer",
                fontSize = 18.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally),
                color = Color.White
            )
        }
        Column(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Divider(color = Color.Gray, thickness = 1.dp)
            val phoneImage = painterResource(id = R.drawable.ic_baseline_call_24)
            ContactInfoRow(image = phoneImage, text = "+919526288263")
            Divider(color = Color.Gray, thickness = 1.dp)
            val mailImage = painterResource(id = R.drawable.ic_baseline_mail_24)
            ContactInfoRow(image = mailImage, text = "Suhailabbas23@gmail.com")
            Divider(color = Color.Gray, thickness = 1.dp)
            val portFolio = painterResource(id = R.drawable.ic_baseline_person_24)
            ContactInfoRow(image = portFolio, text = "Suhail- Dev")
        }

    }

}

@Composable
fun ContactInfoRow(image: Painter, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {
        Image(painter = image, contentDescription = "null", modifier = Modifier.weight(1F))
        Text(text = text, modifier = Modifier.weight(2F), color = Color.White)
    }
}

@Preview(
    showBackground = true, showSystemUi = true
)
@Composable
fun DefaultPreview4() {
    JetpackComposeLearningPhase1Theme {
        BuisinessCard()
    }
}