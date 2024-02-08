package com.example.recicler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView =
            findViewById(R.id. recycler)
        recycler.adapter = ColorsAdapter(
            buildColors(),
            object : ColorsAdapter.ColorClickListener {
                override fun onColorClick(color: Color) {
                    Toast.makeText(
                        this@MainActivity, color.hex,
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        )
    }

    private fun buildColors (): List<Color> {
        return listOf(
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), ""),
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), ""),
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), ""),
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), ""),
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), ""),
            Color(getString(R.string.red), getColorHex(R.color.red), ""),
            Color(getString(R.string.indigo), getColorHex(R.color.indigo), ""),
            Color(getString(R.string.green), getColorHex(R.color.green), ""),
            Color(getString(R.string.orange), getColorHex(R.color.orange), ""),
            Color(getString(R.string.blue), getColorHex(R.color.blue), ""),
            Color(getString(R.string.yellow), getColorHex(R.color.yellow), ""),
            Color(getString(R.string.bluegrey), getColorHex(R.color.bluegrey), ""),
            Color(getString(R.string.teal), getColorHex(R.color.teal), ""),
            Color(getString(R.string.deeppurple), getColorHex(R.color.deeppurple), ""),
            Color(getString(R.string.cyan), getColorHex(R.color.cyan), ""),
            Color(getString(R.string.brown), getColorHex(R.color.brown), "")
        )
    }
    private fun getColorHex (colorResId: Int): String {
        return String.format("#%06X", 0xFFFFFF and ContextCompat.getColor( this, colorResId))
    }
}