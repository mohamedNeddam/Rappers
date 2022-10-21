package com.example.rappers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.rappers.adapter.LetterAdapter
import com.example.rappers.data.DataSource

class MainActivity : AppCompatActivity() {
    lateinit var wordRV : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordRV = findViewById(R.id.WordRecycleView)
        wordRV.adapter = LetterAdapter(this,DataSource().letterList())
        wordRV.setHasFixedSize(false)
    }
}