package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Tofloat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tofloat)

        val fstr1 = "123.45f"
        val float1: Float? = fstr1.toFloat()
        println(float1)
        Toast.makeText(this,"$float1", Toast.LENGTH_LONG).show()


    }
}