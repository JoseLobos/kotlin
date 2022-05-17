package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class When : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when)

        val vehicle = "Bike"
        var message= when (vehicle) {
            "Car" -> {
                "Four wheels"
            }
            "Bike" -> {
                "Two wheels"
            }
            else -> {
                "Unknown number of wheels"
            }
        }
        Toast.makeText(this,"$message", Toast.LENGTH_LONG).show()
    }
}