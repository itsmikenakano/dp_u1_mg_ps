package com.example.dispositivosmoviles.logic.marvelLogic

import android.util.Log
import com.example.dispositivosmoviles.data.connections.ApiConnection
import com.example.dispositivosmoviles.data.endpoints.MarvelEndpoint
import com.example.dispositivosmoviles.data.entities.marvel.MarvelChars

class MarvelLogic {

    suspend fun getMarvelChars(name:String, limit:Int): List<MarvelChars> {

        var itemList = arrayListOf<MarvelChars>()


        val response =
            ApiConnection.getService(ApiConnection.typeApi.Marvel, MarvelEndpoint::class.java)
                .getCharacterStartWith(name, limit)

        if (response.isSuccessful) {
            response.body()!!.data.results.forEach {
                var comic: String = "No disponible"
                if (it.comics.items.size > 0) {
                    comic = it.comics.items[0].name
                }

                val m = MarvelChars(
                    it.id,
                    it.name,
                    comic,
                    it.thumbnail.path + "." + it.thumbnail.extension,
                )

                itemList.add(m)
            }
        } else {
            Log.d("UCE", response.toString())
        }

        return itemList
    }
}