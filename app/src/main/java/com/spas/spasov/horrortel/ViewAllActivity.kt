package com.spas.spasov.horrortel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewAllActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all)

        val imgGoBack: ImageView = findViewById(R.id.imgGoBack);
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewViewAllStories)

        imgGoBack.setOnClickListener(){
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val storyList = listOf(
            "Story 1",
            "Story 2",
            "Story 3",
            "Story 4",
            "Story 5",
            "Story 6",
        )

        val adapter = ViewAllStoriesAdapter(storyList)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
    }

}
