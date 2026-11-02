package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    val viewModel: MainViewModel = viewModel()

    NavHost(navController = navController, startDestination = ScreenRoute.FirstRoute.route){
        composable(ScreenRoute.FirstRoute.route) {
            FirstScreen(onSaveButtonClick = {navController.navigate(ScreenRoute.SecondRoute.route)}, viewModel = viewModel)
        }
        composable(ScreenRoute.SecondRoute.route) {
            SecondScreen(onEditButtonClick = {navController.navigate(ScreenRoute.ThirdRoute.route)}, viewModel = viewModel)
        }
        composable(ScreenRoute.ThirdRoute.route){
            ThirdScreen(viewModel = viewModel)
        }
    }
}

