package com.example.kotlinlog

import android.util.Log

class Human: Animal {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "人間です。")
    }
}
