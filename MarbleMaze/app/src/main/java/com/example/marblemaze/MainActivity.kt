package com.example.marblemaze

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start)
        val optionsButton = findViewById<Button>(R.id.options)
        val quitButton = findViewById<Button>(R.id.quit)


        optionsButton.setOnClickListener() {
            startActivity(Intent(this@MainActivity, OptionsPage::class.java))
        }


            startButton.setOnClickListener() {
                val intent = Intent(this, StartActivity::class.java)
                startActivity(intent)

            }
            quitButton.setOnClickListener() {

                finishAndRemoveTask()
            }

    }
}