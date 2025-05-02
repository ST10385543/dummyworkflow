package com.example.workflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SimpleAdapter(listOf(
            "Task 1 - Complete project setup",
            "Task 2 - Implement RecyclerView",
            "Task 3 - Add GitHub Actions",
            "Task 4 - Test the workflow",
            "Task 5 - Deploy the app"
        ))
    }
}