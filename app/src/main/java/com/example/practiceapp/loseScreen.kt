package com.example.practiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class loseScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose_screen)


        val startOverButton = findViewById<Button>(R.id.playAgain1)

        startOverButton.setOnClickListener{

            val intention = Intent(this, MainActivity::class.java)
            startActivity(intention)

        }
    }
}