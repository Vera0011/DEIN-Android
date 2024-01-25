package com.example.buttons_vera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val numBotones = 10
    private lateinit var llBotonera: LinearLayout
    private val randomNumber : Int = (0..9).random();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBotonera = findViewById(R.id.llBotonera)

        //Creamos las propiedades de layout que tendrán los botones.
        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            resources.getDimensionPixelSize(R.dimen.button_height)
        )
        //Creamos los botones en bucle
        for (i in 0 until numBotones) {
            val button = Button(this)
            //Asignamos propiedades de layout al botón
            button.layoutParams = lp
            //Asignamos Texto al botón
            button.text = "Botón " + String.format("%02d", i)
            //Asignamos el Listener
            button.setOnClickListener(buttonClickListener(i))
            //Añadimos el botón a la botonera
            llBotonera.addView(button)
        }

    }

    //MainActivity. (Cuidado no la crees dentro de la función onCreate donde hemos añadido el bucle)
    private fun buttonClickListener(index: Int): View.OnClickListener {
        return View.OnClickListener {
            Toast.makeText(
                this@MainActivity,
                this.setRandomText(index),
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun setRandomText(index : Int) : String
    {
        var result : String = "Sigue buscando";

        if(index == randomNumber) result = "Me encontraste!"

        return result;
    }
}