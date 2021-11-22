package com.example.compose.ui

import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.compose.R

@Composable
fun titleBar(title: String, activity: ComponentActivity) {

    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(R.drawable.ic_title_back),
            contentDescription = "",
            modifier = Modifier.size(20.dp)
                .clickable {
                    activity.finish()
                }
        )
        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}