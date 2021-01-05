package com.example.marblemaze

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


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
            topLine.startAnimation(AnimationUtils.loadAnimation(this,R.anim.anim_out))
            bottomLine.startAnimation(AnimationUtils.loadAnimation(this,R.anim.anim_out))
            Handler().postDelayed({
                logo.visibility = View.GONE
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            },500)
            val topAnimation = TranslateAnimation(
                0.0f,
                2000.0f,
                0.0f,
                0.0f
            )


            topAnimation.duration = 1000

            topAnimation.repeatCount = 1

            topAnimation.fillAfter = false
            topLine.startAnimation(topAnimation)
            val bottomAnimation = TranslateAnimation(
                0.0f,
                -2000.0f,
                0.0f,
                0.0f
            )


            bottomAnimation.duration = 1500

            bottomAnimation.repeatCount = 1

            bottomAnimation.fillAfter = false
            topLine.startAnimation(topAnimation)
            bottomLine.startAnimation(bottomAnimation)

        },1000)

    }

}