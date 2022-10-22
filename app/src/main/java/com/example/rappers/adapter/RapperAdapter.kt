package com.example.rappers.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.R

class RapperAdapter(val context: Context, val char:  Char) : RecyclerView.Adapter<RapperAdapter.RapperViewHolder>() {

    val dataSet = (listOf<String>("nas", "rakim", "the notorious B.I.G.", "Jay-Z", "Eminem", "André 3000", "Kanye West", "Snoop Dogg", "Lil Wayne", "Kendrick Lamar", "Rick Ross",  "Twista")).filter { it.startsWith(char.toString() ) }
    class RapperViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        val textbutton : Button = itemview.findViewById(R.id.text_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RapperViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return RapperViewHolder(layout)
    }

    override fun onBindViewHolder(holder: RapperViewHolder, position: Int) {
        val rapper = dataSet[position]
        holder.textbutton.text = rapper

        val queryUrl: Uri = Uri.parse("https://www.google.com/search?q=${rapper}")


        holder.textbutton.setOnClickListener {
            context.startActivity(Intent(Intent.ACTION_VIEW, queryUrl))
        }
    }

    override fun getItemCount() = dataSet.size
}