package com.example.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String): super(name, age,hobby) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "人間です。")
        Log.d("kotlintest", "ホモサピエンスです。")
    }

    override fun think() {
        Log.d("kotlintest", "忙しいです。")
        Log.d("kotlintest", "退屈です。")
    }
}
