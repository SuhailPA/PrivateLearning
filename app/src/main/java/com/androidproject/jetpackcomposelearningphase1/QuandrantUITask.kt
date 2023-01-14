package com.androidproject.jetpackcomposelearningphase1


import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.androidproject.jetpackcomposelearningphase1.ui.theme.JetpackComposeLearningPhase1Theme

class QuandrantUITask : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLearningPhase1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    FourQuandrant()
                }
            }
        }
    }
}

@Composable
fun FourQuandrant() {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.weight(1F)) {
            EachQuandrantUI(color = Color.Red, modifier = Modifier.weight(1F))
            EachQuandrantUI(color = Color.Blue, modifier = Modifier.weight(1F))
        }
        Row(Modifier.weight(1F)) {
            EachQuandrantUI(color = Color.Green, modifier = Modifier.weight(1F))
            EachQuandrantUI(color = Color.Yellow, modifier = Modifier.weight(1F))
        }
    }
}

@Composable
fun EachQuandrantUI(color: Color, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = color),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "test1")
        Text(text = "test2")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview3() {
    JetpackComposeLearningPhase1Theme {
        FourQuandrant()
    }
}