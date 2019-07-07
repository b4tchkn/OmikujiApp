package com.example.omikuji

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.omikuji.*

class OmikujiActivity : AppCompatActivity() {

    val omikujiBox = OmikujiBox()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.omikuji)

        omikujiBox.omikujiView = imageView

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

        omikujiBox.shake()

/*
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f, imageView.width/2f, imageView.height/2f)
        rotate.duration = 200

        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)

        imageView.startAnimation(set)
*/
        // imageView.setImageResource(R.drawable.result1)
    }

}
