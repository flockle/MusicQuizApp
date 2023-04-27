package com.example.quizviomus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var mRunnable = Runnable {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("FROM_ACTIVITY", "MainActivity4");
            startActivity(intent)
            finish()
        }

        var mHandler = Handler()

        mHandler.postDelayed(mRunnable, 1250)

    }
}