package com.example.examenut3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add : TextView = findViewById(R.id.goto_new);
        val list : TextView = findViewById(R.id.goto_list);
        val cart : TextView = findViewById(R.id.goto_cart);

        add.setOnClickListener {
            val intent = Intent(this@MainActivity, FormularioNuevoMaterialStock::class.java);
            this.finish();

            startActivity(intent)
        }

        list.setOnClickListener {
            val intent = Intent(this@MainActivity, ProductosDisponibles::class.java);
            this.finish();

            startActivity(intent)
        }

        cart.setOnClickListener {
            val intent = Intent(this@MainActivity, CestaCompra::class.java);
            this.finish();

            startActivity(intent)
        }
    }
}