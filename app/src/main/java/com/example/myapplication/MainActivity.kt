package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.w3c.dom.Text

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

    Column(modifier = Modifier.fillMaxSize(), Arrangement.Top, Alignment.CenterHorizontally) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )

        androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.img),contentDescription = "Image description")

        OutlinedTextField(value = "", onValueChange = {}, label = { Text("имя") }, colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color(103, 80, 164),
            focusedBorderColor = Color(103, 80, 164),
            focusedLabelColor = Color(103, 80, 164),
            unfocusedLabelColor = Color(103, 80, 164)))

        Spacer(modifier = Modifier.height(16.dp))

        TextField(value = "", onValueChange = {}, label = { Text("имя") }, colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color(103, 80, 164),
            focusedBorderColor = Color(103, 80, 164),
            unfocusedContainerColor = Color(103, 80, 164),
            focusedContainerColor = Color(103, 80, 164),
            focusedLabelColor = Color(0, 0, 0),
            unfocusedLabelColor = Color(0, 0, 0)))
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}