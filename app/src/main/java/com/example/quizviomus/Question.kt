package com.example.quizviomus

import android.media.Image

data class QuizQuestion(
    val question: String,
    val image: Int,
    val options:List<String>,
    val correctOption:Int,
)

val quizQuestion = listOf<QuizQuestion>(
    QuizQuestion( question = "Guess the interval?", image = R.drawable.pic0, listOf("Augmented 8th",
     "Perfect 8th", "Minor 8th","Diminished 8th"), correctOption = 0 ),

    QuizQuestion(question = "Guess the interval?",
        image = R.drawable.pic1,
        options = listOf("Major 2nd ","Minor 2nd","Diminished 2nd","Augmented 2nd"),
        correctOption = 1),

    QuizQuestion(  question = "Guess the interval?",
        image = R.drawable.pic2,
        options = listOf("Major 6th","Minor 6th","Diminished 6th","Augmented 6th"),
        correctOption = 1 ),

    QuizQuestion(question = "Guess the interval?", image=R.drawable.pic3,
        options = listOf("Diminished 4th","Minor 4th ", "Perfect 4th", "Augmented 4th"),
        correctOption = 3),

    QuizQuestion(question = "Guess the interval?", image = R.drawable.pic4,
        options = listOf("Major 3rd","Minor 3rd","Diminished 3rd","Augmented 3rd"),
        correctOption = 1), QuizQuestion(question = "Guess the interval", image= R.drawable.pic8, options = listOf("Major 6th","Minor 6th","Diminished 6th","Augmented 6th"),
        correctOption = 0 )

)