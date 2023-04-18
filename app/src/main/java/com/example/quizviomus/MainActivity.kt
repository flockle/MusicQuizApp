package com.example.quizviomus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        //startActBtn = findViewById(L.id.btn_start) as Button

        //set on click to button
        val startActBtn: Button = findViewById( R.id.startActBtn)

        startActBtn.setOnClickListener {
           val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }



    }
}