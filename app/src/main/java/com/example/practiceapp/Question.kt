package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        val rightButton = findViewById<Button>(R.id.rightAnswerButton)
        val wrongButton1 = findViewById<Button>(R.id.wrongAnswerButton)
        val wrongButton2 = findViewById<Button>(R.id.wrongAnswerButton2)
        val wrongButton3 = findViewById<Button>(R.id.wrongAnswerButton3)


        rightButton.setOnClickListener{

            val winScreen = Intent(this, winScreen::class.java)
            startActivity(winScreen)

        }

        wrongButton1.setOnClickListener{

            val loseScreen = Intent(this, loseScreen::class.java)
            startActivity(loseScreen)

        }

        wrongButton2.setOnClickListener{

            val loseScreen = Intent(this, loseScreen::class.java)
            startActivity(loseScreen)

        }

        wrongButton3.setOnClickListener{

            val loseScreen = Intent(this, loseScreen::class.java)
            startActivity(loseScreen)

        }


    }
}