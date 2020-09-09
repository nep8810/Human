package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animal1 = Human("太郎", 30, "読書")      // 名前を太郎、年齢30歳で、趣味は読書// Humanのインスタンスを作る
        val animal2 = Human("次郎", 25, "ゲーム")      // 名前を次郎、年齢25歳で、趣味はゲーム// Humanのインスタンスを作る

        animal1.say()
        animal1.think()

        animal2.say()
        animal2.think()
    }
}
