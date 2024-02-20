package com.alvarols01.appjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.alvarols01.appjetpackcompose.ui.screens.detail.DetailScreen
import com.alvarols01.appjetpackcompose.ui.screens.main.MediaList

@Composable
fun NavGraph(startDestination: String = "mediaList") {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(route = "mediaList") {
            MediaList(navController)
        }
        composable(
            route = "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            DetailScreen(id = backStackEntry.arguments?.getInt("id")!!)
        }
    }
}
