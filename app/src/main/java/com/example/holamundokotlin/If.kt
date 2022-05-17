package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class If : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if)

        val age = 28
        val message = "Tu eres una persona ${ if (age < 18) "joven" else "adulta" }"
        Toast.makeText(this,"$message", Toast.LENGTH_LONG).show()

    }
}