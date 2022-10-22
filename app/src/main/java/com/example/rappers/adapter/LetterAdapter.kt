package com.example.rappers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.LetterListFragmentDirections
import com.example.rappers.R
//import com.example.rappers.RapperActivity

class LetterAdapter : RecyclerView.Adapter<LetterAdapter.WordviewHolder>() {

    val dataset = ('A').rangeTo('Z').toList()
    class WordviewHolder( itemView: View) : RecyclerView.ViewHolder(itemView) {
        val wordButton: Button = itemView.findViewById(R.id.text_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordviewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return WordviewHolder(layout)
    }

    override fun onBindViewHolder(holder: WordviewHolder, position: Int) {
        holder.wordButton.text = dataset[position].toString()
//        val intent =  Intent(holder.itemView.context, RapperActivity::class.java).putExtra("char",dataset[position])

//        holder.itemView.findNavController().navigate(action)
        holder.wordButton.setOnClickListener {
            val action = LetterListFragmentDirections.actionLetterListFragmentToRapperListFragment(letter = dataset[position].toString())
            holder.itemView.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = dataset.size
}