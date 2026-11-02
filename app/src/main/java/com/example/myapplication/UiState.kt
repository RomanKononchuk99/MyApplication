package com.example.myapplication

data class UiState(
    var nameTextField: String = "",
    var phoneTextField: String = "",
    var radioButton: Boolean = true,
    var switchState: Boolean = false,
    var checkedState: Boolean = false,
    var checkedTwo: Boolean = true,
    var town: String = "",
    var country: String = "",
    var age: Int = 0

)
