package com.alvarols01.appjetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.CornerSize

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.unit.dp

val Rojo = Color(0xFFE53935)
val Blanco = Color(0xFFFFFFFF)
val Negro = Color(0xFF000000)
val Gris = Color(0xFF9E9E9E)

private val DarkColorPalette = darkColors(
    primary = Rojo,
    background = Negro,
    surface = Gris,
    onSurface = Blanco
)

private val LightColorPalette = lightColors(
    primary = Rojo,
    background = Blanco,
    surface = Gris,
    onSurface = Negro
)

@Composable
fun AppJetpackComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val shapes = Shapes(
        small = CutCornerShape(CornerSize(4.dp)),
        medium = CutCornerShape(CornerSize(8.dp)),
        large = CutCornerShape(CornerSize(12.dp))
    )

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = shapes,
        content = content
    )
}
