package com.example.recicler_view

import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ColorsAdapter( private val colors: List<Color>, private val colorClickListener : ColorClickListener) : RecyclerView.Adapter<ColorsAdapter.ViewHolder>(){
    interface ColorClickListener{
        fun onColorClick (color: Color)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val row: View = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(row)
    }
    override fun getItemCount() = colors.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val color = colors[position]
        color.photo = "https://loremflickr.com/320/240?random=$position"
        holder.bindRow(color)
        holder.itemView.setOnClickListener {colorClickListener .onColorClick(color) }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val circleView: View = view.findViewById(R.id.circleView)
        val titleTextView: TextView = view.findViewById(R.id.titleTextView)
        val subtitleTextView: TextView = view.findViewById(R.id.subtitleTextView)
        val imagen: ImageView = view.findViewById(R.id. image)

        fun bindRow(color: Color) {
            titleTextView.text = color.name
            subtitleTextView.text = color.hex

            /* Insert image with Glide */
            Glide.with(itemView.context).load(color.photo).into(imagen)
            val gradientDrawable = circleView.background as GradientDrawable
            val colorId = android.graphics.Color.parseColor(color.hex)
            gradientDrawable.setColor(colorId)
        }
    }
}