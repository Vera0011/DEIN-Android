package com.example.examenut3;

import android.graphics.Color;

import com.example.examenut3.Static.Product;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

class ProductsAdapter(private val products: ArrayList<Product>, private val productClickListener: ProductClickListener) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){
    interface ProductClickListener{
        fun onProductClick (item : Product)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val row: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(row)
    }
    override fun getItemCount() = products.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = products[position]
        holder.bindRow(product)
        holder.itemView.setOnClickListener {productClickListener .onProductClick(product) }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView: TextView = view.findViewById(R.id.row_producto)
        val subtitleTextView: TextView = view.findViewById(R.id.row_description)

        fun bindRow(product: Product) {
            titleTextView.text = product.name
            subtitleTextView.text = product.description
        }
    }
}
