package com.spas.spasov.horrortel

import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.RelativeSizeSpan
import android.text.style.TypefaceSpan
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi

class StoriesActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)

        val txtStory: TextView = findViewById(R.id.txtStory)
    }
}