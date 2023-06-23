package com.example.dispositivosmoviles.data.entities.marvel

<<<<<<< HEAD
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
=======
data class MarvelChars(val id: Int, val name:String, val comic:String, val image:String)
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
