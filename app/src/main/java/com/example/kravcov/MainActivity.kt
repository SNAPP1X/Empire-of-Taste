package com.example.kravcov

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var productsBtn: Button
    private lateinit var aboutBtn: Button
    private lateinit var contactsBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        productsBtn = findViewById(R.id.productsBtn)
        aboutBtn = findViewById(R.id.aboutBtn)
        contactsBtn = findViewById(R.id.contactsBtn)

        productsBtn.setOnClickListener {
            val productsIntent = Intent(this@MainActivity, ProductssActivity::class.java)
            startActivity(productsIntent)
        }
        aboutBtn.setOnClickListener(){
            val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutIntent)
        }
        contactsBtn.setOnClickListener(){
            val contactsIntent = Intent(this@MainActivity, ContactsActivity::class.java)
            startActivity(contactsIntent)
        }
    }
}