package com.example.lection_03

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {
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

    }
    @SuppressLint("NotifyDataSetChanged")
    fun setItems(list : List<Int>){
        items.clear()
        items.addAll(list)
        notifyItemRangeInserted(items.size,list.size)
        //notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addItems(int: Int){
        items.add(int)
        notifyItemRangeInserted(items.size,1)
        //notifyDataSetChanged()
    }

}