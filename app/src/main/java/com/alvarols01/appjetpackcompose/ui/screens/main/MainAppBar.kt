package com.alvarols01.appjetpackcompose.ui.screens.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.alvarols01.appjetpackcompose.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search

@Composable
fun MainAppBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
        actions = {
            IconButton(onClick = { onSearchClicked() }) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            }
        }
    )
}

