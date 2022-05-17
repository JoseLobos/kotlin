package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Tolong : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tolong)

        val lstr1 = "4200000000"
        val long1: Long? = lstr1.toLong()
        println(long1)
        Toast.makeText(this,"$long1", Toast.LENGTH_LONG).show()
    }
}