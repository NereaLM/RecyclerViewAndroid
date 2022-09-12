package com.example.miappprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()
        for (i in 1..1000) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_24, "Item " + i))
        }

        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter

    }
}