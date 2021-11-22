package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.ui.conversation
import com.example.compose.ui.theme.ComposeTheme
import com.example.compose.ui.titleBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                mainContent(this)
            }
        }
    }
}

@Composable
fun mainContent(activity: ComponentActivity){
    Column {
        titleBar("这里是标题",activity)
        conversation(SampleData.conversationSample)
    }
}

