package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Toint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toint)

        val istr1 = "42"
        val int1: Int? = istr1.toInt()
        println(int1)

    }
}