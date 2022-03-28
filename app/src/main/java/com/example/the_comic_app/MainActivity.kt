package com.example.the_comic_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var logoText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logoText = findViewById(R.id.logoTextView)
        logoText.text = getString(R.string.app_name)



    }
}