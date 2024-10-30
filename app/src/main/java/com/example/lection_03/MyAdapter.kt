package com.example.lection_03

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context) : RecyclerView.Adapter<MyViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])

        holder.bind(items[position])

        holder.image.setOnClickListener {
            val intent = Intent(context, Class2::class.java).apply {
                putExtra(IMAGE_KEY, items[position].toString())
            }
            context.startActivity(intent)
        }


    }

    fun setItems(list : List<Int>){
        items.clear()
        items.addAll(list)
        notifyItemRangeInserted(items.size,list.size)

    }

    fun addItems(int: Int){
        items.add(int)
        notifyItemRangeInserted(items.size,1)
    }

}