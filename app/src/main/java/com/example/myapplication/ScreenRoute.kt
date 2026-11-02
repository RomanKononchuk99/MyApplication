package com.example.myapplication

sealed class ScreenRoute(val route: String){
    object FirstRoute: ScreenRoute("first")
    object SecondRoute: ScreenRoute("second")

    object ThirdRoute: ScreenRoute("second")


}