package com.example.marblemaze

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start)
        val optionsButton = findViewById<Button>(R.id.options)
        val quitButton = findViewById<Button>(R.id.quit)

        quitButton.setOnClickListener(){
            finishAndRemoveTask()
        }
    }
}