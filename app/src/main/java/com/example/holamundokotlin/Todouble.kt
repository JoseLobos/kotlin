package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Todouble : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todouble)

        val dstr1 = "1.234567899999"
        val double1: Double? = dstr1.toDouble()
        println(double1)
        Toast.makeText(this,"$double1", Toast.LENGTH_LONG).show()

    }
}