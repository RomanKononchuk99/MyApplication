package com.example.myapplication

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.keepScreenOn
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ThirdScreen(modifier: Modifier = Modifier,onSaveButtonClick: () -> Unit = {}, viewModel: MainViewModel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        Arrangement.Top,
        Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello",
            modifier = modifier
        )

        Image(
            modifier = modifier.size(200.dp),
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Image description"
        )

        OutlinedTextField(
            modifier = modifier.fillMaxWidth(),
            value = viewModel.uiState.nameTextField,
            onValueChange = viewModel::onNameChanged,
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
            value = viewModel.uiState.phoneTextField,
            onValueChange = viewModel::onPhoneChanged ,
            label = { Text("Телефон") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(103, 80, 164),
                focusedBorderColor = Color(103, 80, 164),
                unfocusedContainerColor = Color(187, 134, 252),
                focusedContainerColor = Color(187, 134, 252),
                focusedLabelColor = Color(0, 0, 0),
                unfocusedLabelColor = Color(0, 0, 0)
            )
        )

        Column(Modifier
            .selectableGroup()
            .fillMaxWidth(), verticalArrangement = Arrangement.Top,Alignment.Start)
        {
            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = viewModel.uiState.radioButton,
                    onClick = { viewModel.onRadioChanged() }
                )
                Text("М")
            }

            Row(verticalAlignment = Alignment.CenterVertically) {
                RadioButton(
                    selected = !viewModel.uiState.radioButton,
                    onClick = { viewModel.onRadioChanged() }
                )
                Text("Ж")
            }

        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Text("Получать уведомления")
            Switch(
                checked = viewModel.uiState.switchState,
                onCheckedChange = {viewModel.onSwitchChanged()}
            )
        }

        Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = viewModel.uiState.checkedState, onCheckedChange = {viewModel.onCheckBoxChanged()}, modifier = modifier, enabled = viewModel.uiState.switchState)
                Text("Об авторизации на устройстве")
            }

            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = viewModel.uiState.checkedTwo, onCheckedChange = {viewModel.onCheckBox2Changed()}, modifier = modifier, enabled = viewModel.uiState.switchState)
                Text("О навинках и предложениях")
            }


        }

        Column() {
            Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text("Баллы")
                Text("44")
            }

            LinearProgressIndicator(
                progress = { 0.44F },
                modifier = Modifier.fillMaxWidth(),
                color = ProgressIndicatorDefaults.linearColor,
                trackColor = ProgressIndicatorDefaults.linearTrackColor,
                strokeCap = ProgressIndicatorDefaults.LinearStrokeCap,
            )

        }

        Row() {

            Button(
                onClick = onSaveButtonClick,
                enabled = true,
                shape = ButtonDefaults.shape,
                colors = ButtonDefaults.buttonColors()
            ) { Text("Сохранить") }
        }






    }





}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview(){
    ThirdScreen(viewModel = viewModel())
}