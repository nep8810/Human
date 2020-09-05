package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animal = Human("太郎", 30)      // 名前を太郎、年齢30歳で、Humanのインスタンスを作る

        animal.say()  // 太郎が話します（ログ出力）
        Log.d("kotlintest", "私の名前は" + animal.name + "です。")
        Log.d("kotlintest", "年は" + animal.age + "歳です。")

    }
}
