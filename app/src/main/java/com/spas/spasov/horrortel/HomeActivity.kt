package com.spas.spasov.horrortel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.ShapeAppearanceModel

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewShortStories)
        val recyclerViewBooks: RecyclerView = findViewById(R.id.recyclerViewShortBooks);
        val imgLogo: ImageView = findViewById(R.id.imgLogo)
        val constraintLayoutShortStories: ConstraintLayout = findViewById(R.id.constraintLayoutShortStories)

        val storyList = listOf(
            "Story 1",
            "Story 2",
            "Story 3",
            "Story 4",
            "Story 5",
            "Story 6",
        )


        imgLogo.setOnClickListener(){
            val intent = Intent(this, StoriesActivity::class.java)
            startActivity(intent)
        }

        constraintLayoutShortStories.setOnClickListener(){
            val intent = Intent(this, ViewAllActivity::class.java)
            startActivity(intent)
        }
        

        val adapter = ShortStoriesAdapterHome(storyList)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter
        val adapterBooks = BooksAdapterHome(storyList)
        recyclerViewBooks.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewBooks.adapter = adapterBooks

    }
}