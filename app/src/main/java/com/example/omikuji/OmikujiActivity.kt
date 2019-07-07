package com.example.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.main.*
import kotlinx.android.synthetic.main.omikuji.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)


/*
        // くじ番号の取得
        val rnd = Random()
        val number = rnd.nextInt(20)

        // おみくじ棚の準備
        val omikujiShelf = Array<String>(20, {"吉"})
        omikujiShelf[0] = "凶"
        omikujiShelf[19] = "大吉"

        // おみくじ棚から取得
        fortuneTxt.text = omikujiShelf[number]
*/
    }

    fun onButtonClick(v: View) {
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100
        imageView.startAnimation(translate)

        // imageView.setImageResource(R.drawable.result1)
    }

}
