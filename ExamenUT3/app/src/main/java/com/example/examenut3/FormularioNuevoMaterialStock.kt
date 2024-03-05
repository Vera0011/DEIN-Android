package com.example.examenut3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.example.examenut3.Static.ListProducts

class FormularioNuevoMaterialStock : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario_nuevo_material_stock)

        val confirm : TextView = findViewById(R.id.confirm_add);
        val menu : TextView = findViewById(R.id.goto_menu);

        confirm.setOnClickListener {
            val list : ArrayList<TextView> = ArrayList();
            list.add(findViewById(R.id.code_input));
            list.add(findViewById(R.id.name_input));
            list.add(findViewById(R.id.stock_input));
            list.add(findViewById(R.id.price_input));
            list.add(findViewById(R.id.description_input));

            Log.d("Product", list.toString())
            ListProducts.addItem(list.get(0).text.toString(), list.get(1).text.toString(), list.get(2).text.toString(), list.get(3).text.toString(), list.get(4).text.toString())

            // Clear field
            list.forEach {
                it.text = ""
            }

            Toast.makeText(
                this@FormularioNuevoMaterialStock,
                "Producto registrado correctamente",
                Toast.LENGTH_SHORT
            ).show()
        }

        menu.setOnClickListener {
            val intent = Intent(this@FormularioNuevoMaterialStock, MainActivity::class.java);
            this.finish();

            startActivity(intent)
        }
    }
}