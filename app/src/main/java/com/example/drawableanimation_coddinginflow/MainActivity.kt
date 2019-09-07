package com.example.drawableanimation_coddinginflow

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var wifiAnimation:AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.setBackgroundResource(R.drawable.animation)
        wifiAnimation= image.background as AnimationDrawable
    }

   // to be shure that all the window fanctions connected
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        wifiAnimation.start()
    }
}
