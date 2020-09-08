package com.example.kotlinlog

import android.util.Log

class Human: Animal, Thinkable {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int, hobby: String): super(name, age,hobby) {
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", this.name +"(" +this.age + "歳)")
    }

    override fun think() {
    }
}
