package com.example.rappers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.R

class LetterAdapter(val context: Context, val dataset: List<Char>) : RecyclerView.Adapter<LetterAdapter.WordviewHolder>() {

    class WordviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val wordButton: Button = itemView.findViewById(R.id.text_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordviewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return WordviewHolder(layout)
    }

    override fun onBindViewHolder(holder: WordviewHolder, position: Int) {
        holder.wordButton.text = dataset[position].toString()
        holder.wordButton.setOnClickListener {  }
    }

    override fun getItemCount() = dataset.size
}