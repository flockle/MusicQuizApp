package com.example.quizviomus

import android.bluetooth.BluetoothClass.Device.Major
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.versionedparcelable.VersionedParcelize
import com.example.quizviomus.databinding.ActivityMain2Binding
import android.graphics.drawable.Drawable
import android.os.Handler
import android.widget.ScrollView
import kotlinx.android.parcel.Parcelize
import kotlinx.coroutines.delay
import kotlinx.parcelize.IgnoredOnParcel

@Parcelize
class MainActivity2() : AppCompatActivity(), Parcelable {
    companion object {
        @JvmStatic
        var questionIndex = 0
        @JvmStatic
        var score = 0

    }




    val delayTime = 1500L



    private fun loadNextQuestion() {
        var questionText = findViewById<TextView>(R.id.tv_question)
        var imageView = findViewById<ImageView>(R.id.iv_image)
        var optionOne = findViewById<Button>(R.id.tv_option_one)
        var optionTwo = findViewById<TextView>(R.id.tv_option_two)
        var optionThree = findViewById<TextView>(R.id.tv_option_three)
        var optionFour = findViewById<TextView>(R.id.tv_option_four)

        var initialQuestion = quizQuestion[questionIndex];
        questionText.text = quizQuestion[questionIndex].question;

        imageView.setImageDrawable(getDrawable(quizQuestion[questionIndex].image))
        imageView.setImageResource(quizQuestion[questionIndex].image)
        optionOne.text = initialQuestion.options.elementAt(0)
        optionTwo.text = initialQuestion.options.elementAt(1)
        optionThree.text = initialQuestion.options.elementAt(2)
        optionFour.text = initialQuestion.options.elementAt(3)

        val btnNext: Button = findViewById(R.id.btn_next)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var previousActivity = getIntent().getStringExtra("FROM_ACTIVITY")

        if (previousActivity != null) {
            if (previousActivity == "MainActivity3") {
                score++
                println("NIH $score")
                questionIndex++
            } else if (previousActivity == "MainActivity4") {
                questionIndex++
                println("err")
            }
        }
        if(questionIndex == quizQuestion.size){
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("SCORE", score)
            //score.text.toString()
            startActivity(intent)


        }
        loadNextQuestion()
        val btnNext: Button = findViewById(R.id.btn_next)
        btnNext.setOnClickListener {
            if(questionIndex == quizQuestion.size){
                val intent = Intent(this, MainActivity5::class.java)
                //intent.putExtra("SCORE", score)
                startActivity(intent)
            }

            System.err.println(questionIndex)
            loadNextQuestion()
            questionIndex++
        }

        //var imageView = findViewById<ImageView>(R.id.correctAns)
        val tv_option_one: Button = findViewById(R.id.tv_option_one)
        //val tv_option_two: Button = findViewById(R.id.tv_option_two)
        tv_option_one.setOnClickListener {
            var correctAns = quizQuestion[questionIndex].correctOption
            if (correctAns == 0) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
                questionIndex++
            }
        }

        val tv_option_two: Button = findViewById(R.id.tv_option_two)
        tv_option_two.setOnClickListener {
            var correctAns = quizQuestion[questionIndex].correctOption
            if (correctAns == 1) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
            }
        }

        val tv_option_three: Button = findViewById(R.id.tv_option_three)
        tv_option_three.setOnClickListener{
            var correctAns = quizQuestion[questionIndex].correctOption
            if (correctAns == 2) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
            }
        }

        val tv_option_four: Button = findViewById(R.id.tv_option_four)
        tv_option_four.setOnClickListener{
            var correctAns = quizQuestion[questionIndex].correctOption
            if (correctAns == 3) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, MainActivity4::class.java)
                startActivity(intent)
            }
        }

      }
    }
