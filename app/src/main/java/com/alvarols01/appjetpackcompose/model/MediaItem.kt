package com.alvarols01.appjetpackcompose.model



data class MediaItem(
    val id: Int,
    val title: String,
    val photo: String

)


fun getMedia(): List<MediaItem> = (1..100).map {
    MediaItem(
        id = it,
        title = "Pokémon con ID $it",
        photo = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/${it}.png"
    )



}
