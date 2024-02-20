package com.alvarols01.appjetpackcompose.ui.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import coil.compose.rememberImagePainter
import com.alvarols01.appjetpackcompose.R
import com.alvarols01.appjetpackcompose.model.MediaItem


@Composable
fun Imagen(item: MediaItem, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.cell_foto_height))
    ) {
        Image(
            painter = rememberImagePainter(
                data = item.photo,
                builder = {
                    crossfade(true)
                }
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

    }
}

