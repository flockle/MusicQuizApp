package com.example.quizviomus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

       val score = intent.getIntExtra("SCORE", 0)


        //val score = intent.getIntExtra("SCORE", 0)
        //finalScore.text = "Final Score: $score"


        //var OG
        val scoreElement = findViewById<TextView>(R.id.finalScore)
        scoreElement.text = "Your score is $score out of 12"

        val homeBtn: Button = findViewById( R.id.homeBtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


    }


}