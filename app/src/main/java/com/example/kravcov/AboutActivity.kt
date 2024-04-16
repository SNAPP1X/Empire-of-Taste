package com.example.kravcov

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AboutActivity : AppCompatActivity() {
    private lateinit var back: Button
    private lateinit var about: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_about)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val uri = Uri.parse("https://vgpek-practice.store/about/")
        about = findViewById(R.id.aboutSite)
        about.setOnClickListener(){
            val aboutIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(aboutIntent)
        }

        back = findViewById(R.id.backAboutBtn)
        back.setOnClickListener(){
        val backIntent = Intent(this, MainActivity::class.java)
        startActivity(backIntent)
        }
    }
}