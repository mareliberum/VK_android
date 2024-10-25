package com.example.lection_03

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MyActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton
    lateinit var button: Button

    private val adapter = MyAdapter()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        val itemCount : Int

        super.onCreate(savedInstanceState)       //To extend onCreate method
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)

        button = findViewById(R.id.button)
        recyclerView.adapter = adapter

        button.setOnClickListener{

            adapter.addItems(adapter.itemCount + 1)
        }
        if(savedInstanceState != null){
            itemCount = savedInstanceState.getInt("itemCount",0)
            val items = ArrayList<Int>()
            for (i in 1..itemCount) {
                items.add(i)
            }

            adapter.setItems(items)
        }
        else{
            adapter.setItems(listOf(1,2,3,4,5))
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("itemCount", adapter.itemCount)
    }


}