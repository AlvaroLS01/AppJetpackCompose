package com.alvarols01.appjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import com.alvarols01.appjetpackcompose.ui.theme.AppJetpackComposeTheme
import com.alvarols01.appjetpackcompose.navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppJetpackComposeTheme {

                NavGraph()
            }
        }
    }
}
