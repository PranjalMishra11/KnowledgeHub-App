package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1= findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            intent= Intent(applicationContext, Screen2::class.java)
            startActivity(intent)
        }
    }
}