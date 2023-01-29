package com.example.bloggingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.blogbtn1)
        val btn2=findViewById<Button>(R.id.blogbtn2)
        val btn3=findViewById<Button>(R.id.blogbtn3)

        val i = Intent(applicationContext,BlogActivity::class.java)

        btn.setOnClickListener {
            startActivity(i);
        }
        btn2.setOnClickListener {
            startActivity(i);
        }
        btn3.setOnClickListener {
            startActivity(i);
        }
    }

}