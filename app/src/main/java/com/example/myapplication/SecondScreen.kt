package com.example.myapplication

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.keepScreenOn
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SecondScreen(viewModel: MainViewModel, onEditButtonClick: () -> Unit) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Профиль", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 22.sp)

        Text("Имя: ${viewModel.uiState.nameTextField}", modifier = Modifier)
        Text("Номер телефона: ${viewModel.uiState.phoneTextField}", modifier = Modifier)
        Text("Пол: ${if (viewModel.uiState.switchState) "M" else "Ж"}", modifier = Modifier)
        Text("Город: ${viewModel.uiState.town}", modifier = Modifier)
        Text("Страна: ${viewModel.uiState.country}", modifier = Modifier)
        Text("Возраст: ${viewModel.uiState.age}", modifier = Modifier)

        Button(onClick = onEditButtonClick) {
            Text("Редактировать")


        }

    }





}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview(){
    SecondScreen(viewModel(), onEditButtonClick = {})
}