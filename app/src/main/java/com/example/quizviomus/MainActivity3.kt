package com.example.quizviomus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var mRunnable = Runnable {
            val intent = Intent(this,MainActivity2::class.java)

            intent.putExtra("FROM_ACTIVITY", "MainActivity3")
            startActivity(intent)
            finish()
        }

        var mHandler = Handler()

        mHandler.postDelayed(mRunnable, 1250)

    }

}