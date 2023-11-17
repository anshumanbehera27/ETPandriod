package com.example.etpexam

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginPage(
    navController: NavController
){

    Column(modifier = Modifier ,
          horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        val username = remember { mutableStateOf(TextFieldValue()) }
        val password = remember {
            mutableStateOf(TextFieldValue()) }

       Text(text = "Login" , style =  TextStyle(fontSize = 40.sp , fontFamily = FontFamily.Monospace))

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "Username")} ,
            value = username.value,
            onValueChange = {username.value = it})
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            label = { Text(text = "password")} ,
            value = password.value,
            onValueChange = {password.value = it})

        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                      navController.navigate(Home.route)

        },
             shape =  RoundedCornerShape(50.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
            ) {
            Text(text = "Login")

        }
        Spacer(modifier = Modifier.height(20.dp))
        ClickableText(text = AnnotatedString("fogotPassword"),
            onClick = {},
            style = TextStyle(fontSize = 14.sp , fontFamily = FontFamily.Default),

        )

    }
}