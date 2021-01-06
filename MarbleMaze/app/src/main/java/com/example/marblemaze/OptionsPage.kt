package com.example.marblemaze

import android.media.AudioManager
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity


class OptionsPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.options_page)

        val audioManager = getSystemService(AUDIO_SERVICE) as AudioManager

        val volumeBar = findViewById<SeekBar>(R.id.volumeBar)
        val sensitivityBar = findViewById<SeekBar>(R.id.sensitivityBar)
        val backButton = findViewById<ImageView>(R.id.back)

        backButton.setOnClickListener(){
            finish()
        }

        volumeBar.max = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        volumeBar.progress = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        //Set sensitivity to current

        volumeBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(arg0: SeekBar) {}
            override fun onStartTrackingTouch(arg0: SeekBar) {}
            override fun onProgressChanged(arg0: SeekBar, progress: Int, arg2: Boolean) {
                audioManager.setStreamVolume(
                    AudioManager.STREAM_MUSIC,
                    progress, 0
                )
            }
        })

        sensitivityBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(arg0: SeekBar) {}
            override fun onStartTrackingTouch(arg0: SeekBar) {}
            override fun onProgressChanged(arg0: SeekBar, progress: Int, arg2: Boolean) {
                //set sensitivity equal to progress
            }
        })
    }
}