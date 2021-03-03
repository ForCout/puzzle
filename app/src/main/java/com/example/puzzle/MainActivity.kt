package com.example.puzzle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_Puzzle)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}