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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.androidproject.jetpackcomposelearningphase1.ui.theme.JetpackComposeLearningPhase1Theme

class TaskCompleted_Task : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLearningPhase1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskCompleted()
                }
            }
        }
    }
}


@Composable
fun TaskCompleted() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxHeight().wrapContentHeight(Alignment.CenterVertically)){
        Image(
            painter = image, contentDescription = "Mark for task completed",
        )
        Text(
            text = stringResource(id = R.string.taskComple),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(id = R.string.taskCompleted2),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    JetpackComposeLearningPhase1Theme {
        TaskCompleted()
    }
}