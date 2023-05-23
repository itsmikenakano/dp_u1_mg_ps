package com.example.dispositivosmoviles

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

//esta clase hereda de AppCompatActivity
class MainActivity : AppCompatActivity() {

    //reescribir la funcion onCreate que hereda de  AppCompactActivity
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var boton1 = findViewById<Button>(R.id.boton1)
        var txtBuscar = findViewById<TextView>(R.id.txt_buscar)
        boton1.text="Ingresar"

        boton1.setOnClickListener { txtBuscar.text = "El evento se ha ejecutado"
            //Toast.makeText(this,
            //   "Este es un ejemplo",
            //    Toast.LENGTH_SHORT)
            //    .show()

            var f=Snackbar.make(boton1, "Este es otro mensaje", Snackbar.LENGTH_LONG)
            //f.setBackgroundTint(R.color.black).show()
            f.show()
        }

    }
}