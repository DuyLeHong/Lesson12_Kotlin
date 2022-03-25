package com.example.lesson12_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val keyName : String = AppUtils.KEY_NAME

        AppUtils.takeParams(keyName, keyName)

        AppUtils.doSomething()
    }
}