package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val nameTextField = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        Arrangement.Top,
        Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

        Image(
            modifier = modifier.size(200.dp),
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Image description"
        )

        OutlinedTextField(
            modifier = modifier.fillMaxWidth(),
            value = nameTextField.value,
            onValueChange = { nameTextField.value = it },
            label = { Text("имя") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(103, 80, 164),
                focusedBorderColor = Color(103, 80, 164),
                focusedLabelColor = Color(103, 80, 164),
                unfocusedLabelColor = Color(103, 80, 164)
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            modifier = modifier.fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = { Text("имя") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(103, 80, 164),
                focusedBorderColor = Color(103, 80, 164),
                unfocusedContainerColor = Color(103, 80, 164),
                focusedContainerColor = Color(103, 80, 164),
                focusedLabelColor = Color(0, 0, 0),
                unfocusedLabelColor = Color(0, 0, 0)
            )
        )
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}