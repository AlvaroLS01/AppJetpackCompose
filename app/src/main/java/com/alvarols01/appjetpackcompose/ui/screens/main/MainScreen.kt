package com.alvarols01.appjetpackcompose.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = { MainAppBar(onSearchClicked = { /* Implementa la lógica de búsqueda aquí */ }) }
    ) { paddingValues ->
        MediaList(navController = navController, modifier = Modifier.padding(paddingValues))
    }
}
