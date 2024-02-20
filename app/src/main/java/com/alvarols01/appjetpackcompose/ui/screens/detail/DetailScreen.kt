package com.alvarols01.appjetpackcompose.ui.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import com.alvarols01.appjetpackcompose.ui.screens.common.Imagen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.alvarols01.appjetpackcompose.model.getMedia


//CREO QUE TENGO QUE USAR RETROFIT PARA COGER LOS DATOS DE LA API DE POKEMON O BIEN HACERLO EN UNA BDD LOCAL.
@Composable
fun DetailScreen(id: Int) {

    val item = getMedia().first { it.id == id }

    Scaffold(topBar = {
        TopAppBar {
            Text(text = item.title)
        }
    }) { padding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(padding),
            contentAlignment = Alignment.Center) {

            Imagen(item = item, modifier = Modifier
                .size(200.dp)
                .align(Alignment.Center))
        }
    }
}

