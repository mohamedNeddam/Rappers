package com.example.rappers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.adapter.RapperAdapter
import com.example.rappers.data.DataSource

class RapperActivity : AppCompatActivity() {
    lateinit var rapperRecycleView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rapper)
        val letterId = intent?.extras?.getString("char")
        rapperRecycleView = findViewById(R.id.RapperRecycleView)
        rapperRecycleView.adapter = RapperAdapter(this ,DataSource().loadRapperByWord(letterId))

    }
}