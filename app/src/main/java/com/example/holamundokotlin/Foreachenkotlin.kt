package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Foreachenkotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foreachenkotlin)

        var daysOfWeek =
            listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
        daysOfWeek.forEach{
            println(it)
        }
    }
}