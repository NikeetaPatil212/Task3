package com.example.todo_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var data:MutableList<CardInfo>,var click : ClickInterface): RecyclerView.Adapter<Adapter.viewHolder>() {

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.title)
        var date = itemView.findViewById<TextView>(R.id.date)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val item = data[position]
        holder.title.setText(item.title)
        holder.date.setText(item.date)
        holder.itemView.setOnClickListener {
            click.OnClick(item = item)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    /*public fun addItems(data: CardInfo) {
        this.data.add(data)
        notifyDataSetChanged()
    }*/

   /* public fun addItemList(data: MutableList<CardInfo>) {
        this.data.clear()
        this.data.addAll(data)
        notifyDataSetChanged()
    }*/

    interface ClickInterface {
        fun OnClick(item: CardInfo)
    }
}