package com.alvarols01.appjetpackcompose.ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource

import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.navigation.NavHostController
import com.alvarols01.appjetpackcompose.R
import com.alvarols01.appjetpackcompose.model.MediaItem
import com.alvarols01.appjetpackcompose.model.getMedia
import com.alvarols01.appjetpackcompose.ui.screens.common.Imagen

@Composable
fun MediaList(navController: NavHostController, modifier: Modifier = Modifier) {
    val mediaItems = getMedia()
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
        columns = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_width)),
        modifier = modifier
    ) {
        items(mediaItems.size) { index ->
            MediaListItem(mediaItems[index], navController, Modifier.padding(dimensionResource(id = R.dimen.padding_xsmall)))
        }
    }
}

@Composable
fun MediaListItem(item: MediaItem, navController: NavHostController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clickable { navController.navigate("detail/${item.id}") }
    ) {
        Imagen(item = item, modifier = Modifier.fillMaxWidth())
        Title(item = item)
    }
}

@Composable
private fun Title(item: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.secondary)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(
            text = item.title,
            style = MaterialTheme.typography.h6 //
        )
    }
}
