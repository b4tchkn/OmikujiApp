package com.example.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main.*
import java.util.*

class OmikujiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        var str = "大吉"
        val rnd = Random()
        val number = rnd.nextInt(3)
        val omikujiShelf = Array<String>(20, {"吉"})


        when (number) {
            0 -> str = "吉"
            1 -> str = "凶"
        }

        fortuneTxt.text = str
    }
}
