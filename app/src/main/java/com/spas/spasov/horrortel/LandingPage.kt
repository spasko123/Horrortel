package com.spas.spasov.horrortel

import android.content.Intent
import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class LandingPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing_page)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

       button.setOnClickListener{
           val intent = Intent(this, HomeActivity::class.java)
           startActivity(intent)
       }
    }

}