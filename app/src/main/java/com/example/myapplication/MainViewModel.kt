package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var uiState by mutableStateOf(UiState())

    fun onSwitchChanged(){
        uiState = uiState.copy(switchState = !uiState.switchState)
    }

    fun onNameChanged(newValue: String){
        uiState = uiState.copy(nameTextField = newValue)
    }
    fun onPhoneChanged(newValue: String){
        uiState = uiState.copy(phoneTextField = newValue)
    }
    fun onRadioChanged(){
        uiState = uiState.copy(radioButton = !uiState.radioButton)
    }

    fun onCheckBoxChanged(){
        uiState = uiState.copy(checkedState = !uiState.checkedState)
    }
    fun onCheckBox2Changed(){
        uiState = uiState.copy(checkedTwo = !uiState.checkedTwo)
    }

    fun onAgeChanged(newValue: Int){
        uiState = uiState.copy(age = newValue)
    }

    fun onCountryChanged(newValue: String){
        uiState = uiState.copy(country = newValue)
    }

    fun onTownChanged(newValue: String){
        uiState = uiState.copy(town = newValue)
    }



}