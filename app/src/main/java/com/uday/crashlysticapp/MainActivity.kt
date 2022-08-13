package com.uday.crashlysticapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private var a = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<MaterialButton>(R.id.clickMeButton).setOnClickListener {
            print("${a[9]}")
            //throw RuntimeException("this is testing crashes we are checking it.") // Force a crash
        }
    }
}