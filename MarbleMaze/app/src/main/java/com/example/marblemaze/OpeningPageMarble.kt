package com.example.semesterproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.marblemaze.MainActivity
import com.example.marblemaze.R

@Suppress("DEPRECATION")
class OpeningPageMarble : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("LOGO", "WTF happened")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_page)
        val logo = findViewById<ImageView>(R.id.logoOpening)
        val topLine = findViewById<TextView>(R.id.textView1)
        val bottomLine = findViewById<TextView>(R.id.textView2)
        logo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_in))
        Handler().postDelayed({
            logo.startAnimation(AnimationUtils.loadAnimation(this,R.anim.anim_out))
            Handler().postDelayed({
                logo.visibility = View.GONE
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },1500)
        },1500)

    }

}