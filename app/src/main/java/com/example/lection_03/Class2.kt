package com.example.lection_03

import android.annotation.SuppressLint
import android.graphics.Color

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Class2 : AppCompatActivity(){
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.class2)
        val text = findViewById<TextView>(R.id.text_2)
        val imageText = intent.getStringExtra("image_text")

        text.text = imageText
        val color = findViewById<ConstraintLayout>(R.id.class2)
        if (imageText != null) {
            if(imageText.toInt() % 2 == 0 ){
                color.setBackgroundColor(Color.RED)
            }else{
                color.setBackgroundColor(Color.BLUE)
            }

        }
    }

}