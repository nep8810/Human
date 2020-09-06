package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animal1 = Human("太郎", 30,hobby = "読書")      // 名前を太郎、年齢30歳で、趣味は読書// Humanのインスタンスを作る
        val animal2 = Human("次郎", 25,hobby = "ゲーム")      // 名前を次郎、年齢25歳で、趣味はゲーム// Humanのインスタンスを作る

        animal1.say()  // 太郎は話す（ログ出力）
        Log.d("kotlintest", "私の名前は" + animal1.name + "です。")
        Log.d("kotlintest", "年は" + animal1.age + "歳です。")

        animal1.think()  // 太郎は考える（ログ出力）
        Log.d("kotlintest", "私は" + animal1.hobby + "について考える。")

        animal2.say()  // 次郎は話す（ログ出力）
        Log.d("kotlintest", "私の名前は" + animal2.name + "です。")
        Log.d("kotlintest", "年は" + animal2.age + "歳です。")

        animal2.think()  // 次郎は考える（ログ出力）
        Log.d("kotlintest", "私は" + animal2.hobby + "について考える。")
    }
}
