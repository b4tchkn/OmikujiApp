package com.example.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        //var str = "good"
        val rnd = Random()
        val number = rnd.nextInt(20)
        val omikujiShelf = Array<String>(20, {"吉"})

        omikujiShelf[0] = "凶"
        omikujiShelf[19] = "大吉"

        fortuneTxt.text = omikujiShelf[number]
    }
}
