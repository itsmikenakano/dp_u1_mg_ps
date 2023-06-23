package com.example.dispositivosmoviles.data.entities.marvel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

//Este plugin me da implementando los metodos para la clase
@Parcelize
data class MarvelChars(
    val id: Int,
    val name: String,
    val comic: String,
    val image: String
) : Parcelable
