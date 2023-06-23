package com.example.dispositivosmoviles.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dispositivosmoviles.R
import com.example.dispositivosmoviles.data.entities.marvel.MarvelChars
import com.example.dispositivosmoviles.databinding.MarvelCharactersBinding
<<<<<<< HEAD
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso

//Unit indica que la funcion no retorna nada
class MarvelAdapter(
    private val items: List<MarvelChars>,
    private var fnClick: (MarvelChars) -> Unit
) :
    RecyclerView.Adapter<MarvelAdapter.MarvelViewHolder>() {

=======
<<<<<<< HEAD
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso
=======
>>>>>>> 062fc2bf1b8529f61472643acb493db2f7fab0f8

class MarvelAdapter(private val items: List<MarvelChars>) :
    RecyclerView.Adapter<MarvelAdapter.MarvelViewHolder>() {

<<<<<<< HEAD
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
    class MarvelViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {

        private var binding: MarvelCharactersBinding = MarvelCharactersBinding.bind(view)
<<<<<<< HEAD

        //conectamos el objeto con el layout
        fun render(item: MarvelChars, fnClick: (MarvelChars) -> Unit) {
=======
        //conectamos el objeto con el layout
        fun render(item: MarvelChars) {
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
            //println("Recibiendo a ${item.name}")
            binding.imgMarvel.bringToFront()
            binding.txtName.text = item.name
            binding.txtComic.text = item.comic
            Picasso.get().load(item.image).into(binding.imgMarvel)
<<<<<<< HEAD
            itemView.setOnClickListener {
                fnClick(item)
//                Snackbar.make(
//                    binding.imgMarvel,
//                    item.name,
//                    Snackbar.LENGTH_SHORT
//                ).show()
            }
=======
            binding.imgMarvel.setOnClickListener {
                Snackbar.make(
                    binding.imgMarvel,
                    item.name,
                    Snackbar.LENGTH_SHORT
                ).show()
            }
=======
    class MarvelViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private var binding: MarvelCharactersBinding = MarvelCharactersBinding.bind(view)

        fun render(item: MarvelChars) {
            //println("Recibiendo a ${item.name}")
            binding.txtName.text = item.name
            binding.txtComic.text = item.comic
>>>>>>> 062fc2bf1b8529f61472643acb493db2f7fab0f8
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
        }

    }

    //Los tres metodos se ejecutan cuando se ingresa un elemento de la lista

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MarvelAdapter.MarvelViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MarvelViewHolder(
            inflater.inflate(
                R.layout.marvel_characters,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MarvelAdapter.MarvelViewHolder, position: Int) {
<<<<<<< HEAD
        holder.render(items[position], fnClick)
=======
        holder.render(items[position])
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
    }

    override fun getItemCount(): Int = items.size


}