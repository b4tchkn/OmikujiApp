package com.example.omikuji

import java.util.*

class OmikujiBox {
    val number: Int
    get() {
        var rnd = Random()
        return rnd.nextInt(20)
    }
}