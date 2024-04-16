package com.example.kravcov

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductssActivity : AppCompatActivity() {
    private lateinit var back: Button
    private lateinit var one: ImageView
    private lateinit var two: ImageView
    private lateinit var three: ImageView
    private lateinit var allProducts: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_products)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        one = findViewById(R.id.oneBtn)
        two = findViewById(R.id.twoBtn)
        three = findViewById(R.id.threeBtn)
        back = findViewById(R.id.backProductsBtn)
        allProducts = findViewById(R.id.allProducts)

        back.setOnClickListener(){
            val backIntant = Intent(this, MainActivity::class.java)
            startActivity(backIntant)
        }
        val adress1 = Uri.parse("https://vgpek-practice.store/product/pea-soup-buzdyaksky/")
        val adress2 = Uri.parse("https://vgpek-practice.store/product/specially-salted-salmon/")
        val adress3 = Uri.parse("https://vgpek-practice.store/product/grilled-half-chicken/")
        val adress4 = Uri.parse("https://vgpek-practice.store/shop/")
        one.setOnClickListener(){
            val adressIntent = Intent(Intent.ACTION_VIEW, adress1)
            startActivity(adressIntent)
        }
        two.setOnClickListener(){
            val backIntent = Intent(Intent.ACTION_VIEW, adress2)
            startActivity(backIntent)
        }
        three.setOnClickListener(){
            val backIntent = Intent(Intent.ACTION_VIEW, adress3)
            startActivity(backIntent)
        }
        allProducts.setOnClickListener(){
            val backIntent = Intent(Intent.ACTION_VIEW, adress4)
            startActivity(backIntent)
        }
    }
}