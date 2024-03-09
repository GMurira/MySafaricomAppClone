package com.example.mysafaricomappclone.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mysafaricomappclone.ui.theme.MySafaricomAppCloneTheme

@Composable
fun SafApp(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Text(text = "The better option")
    }
}
@Preview(showBackground = true)
@Composable
fun SafAppPreview(){
    MySafaricomAppCloneTheme {
        SafApp()
    }
}