package com.fly.guess2019

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var numbers: Array<MediaPlayer>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numbers = arrayOf(
            MediaPlayer.create(this, R.raw.n1),
            MediaPlayer.create(this, R.raw.n2),
            MediaPlayer.create(this, R.raw.n3)
        )

        play.setOnClickListener {
            when (number.text.toString()) {
                "1" -> numbers.get(0).start()
                "2" -> numbers.get(1).start()
                "3" -> numbers.get(2).start()
            }
        }


    }
}
