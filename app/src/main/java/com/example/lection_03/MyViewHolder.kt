package com.example.lection_03

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val text = view.findViewById<TextView>(R.id.text_1)
    val image = view.findViewById<ImageView>(R.id.image_view)

    @SuppressLint("ResourceAsColor")
    fun bind(number: Int){

        text.text = "$number"
        if(number % 2 == 0){
            image.setBackgroundColor(0xFFFF4444.toInt())
        }else{
            image.setBackgroundColor(0xFF00DDFF.toInt())
        }

    }
}