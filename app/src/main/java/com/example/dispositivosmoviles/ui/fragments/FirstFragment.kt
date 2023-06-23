package com.example.dispositivosmoviles.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dispositivosmoviles.R
import com.example.dispositivosmoviles.data.entities.marvel.MarvelChars
import com.example.dispositivosmoviles.databinding.FragmentFirstBinding
import com.example.dispositivosmoviles.logic.list.ListItems
<<<<<<< HEAD
import com.example.dispositivosmoviles.ui.activities.DetailsMarvelItem
import com.example.dispositivosmoviles.ui.activities.MainActivity
=======
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
import com.example.dispositivosmoviles.ui.adapters.MarvelAdapter

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val names = arrayListOf<String>(
            "Carlos", "Xavier", "Andres",
            "Pepe", "Mariano", "Rosa"
        )

<<<<<<< HEAD
        val adapter = ArrayAdapter<String>(requireActivity(), R.layout.simple_layout, names)

        binding.spinner.adapter = adapter
        chargeDataRV()

        binding.rvSwipe.setOnRefreshListener {
            chargeDataRV()
            binding.rvSwipe.isRefreshing=false
        }

    }

    fun sendMarvelItem(item: MarvelChars):Unit {
        val i = Intent(requireActivity(), DetailsMarvelItem::class.java)
        i.putExtra("name",item)
        startActivity(i)
    }

    fun chargeDataRV(){
        val rvAdapter = MarvelAdapter(ListItems().returnMarvelChars()
        ) { sendMarvelItem(it) }
        //las funciones que se pasan como argumentos se mandan fuera de los parentesis
        //y entre llaves
=======
<<<<<<< HEAD
        val adapter = ArrayAdapter<String>(requireActivity(), R.layout.simple_layout, names)

=======
                R.layout.simple_layout, names)
        //android.R.layout.simple_spinner_item
>>>>>>> 062fc2bf1b8529f61472643acb493db2f7fab0f8
        binding.spinner.adapter = adapter
        val rvAdapter = MarvelAdapter(ListItems().returnMarvelChars())
>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41

        val rvMArvel = binding.rvMarvelChars
        rvMArvel.adapter = rvAdapter

        rvMArvel.layoutManager = LinearLayoutManager(
            requireActivity(), LinearLayoutManager.VERTICAL,
            false
        )
<<<<<<< HEAD
=======


>>>>>>> 200e235258a59121771fde1e09385b06e3abbf41
    }


}