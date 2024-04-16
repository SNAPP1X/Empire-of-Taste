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

class ContactsActivity : AppCompatActivity() {
    private lateinit var back: Button
    private lateinit var contacts: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contacts)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val uri = Uri.parse("https://vgpek-practice.store/contact/")
        contacts = findViewById(R.id.contacts)
        contacts.setOnClickListener(){
            val contactsIntent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(contactsIntent)
        }

        back = findViewById(R.id.backContactsBtn)
        back.setOnClickListener() {
            val backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }
    }
}