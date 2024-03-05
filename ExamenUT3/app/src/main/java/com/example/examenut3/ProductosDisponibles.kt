package com.example.examenut3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.examenut3.Static.ListProducts
import com.example.examenut3.Static.Product

class ProductosDisponibles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos_disponibles)

        val recycler: RecyclerView =
            findViewById(R.id.recicler)
        recycler.adapter = ProductsAdapter(
            ListProducts.list,
            object : ProductsAdapter.ProductClickListener {
                override fun onProductClick(item: Product) {
                    Toast.makeText(
                        this@ProductosDisponibles, "Producto añadido correctamente a la cesta",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        )
    }
}