package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val appdev= findViewById<CardView>(R.id.android)
        appdev.setOnClickListener {
            intent= Intent(applicationContext, AndroidDev::class.java)
            startActivity(intent)
        }

        val iosdev= findViewById<CardView>(R.id.ios)
        iosdev.setOnClickListener {
            intent= Intent(applicationContext, ios::class.java)
            startActivity(intent)
        }

        val web= findViewById<CardView>(R.id.web)
        web.setOnClickListener {
            intent= Intent(applicationContext, webdev::class.java)
            startActivity(intent)
        }

        val machineL= findViewById<CardView>(R.id.ml)
        machineL.setOnClickListener {
            intent= Intent(applicationContext, ml::class.java)
            startActivity(intent)
        }

        val datas= findViewById<CardView>(R.id.dsa)
        datas.setOnClickListener {
            intent= Intent(applicationContext, dsa::class.java)
            startActivity(intent)
        }

        val devo= findViewById<CardView>(R.id.devops)
        devo.setOnClickListener {
            intent= Intent(applicationContext, devops::class.java)
            startActivity(intent)
        }

        val supportB= findViewById<Button>(R.id.button2)
        supportB.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:7611877374")
            startActivity(intent)
        }

    }
}