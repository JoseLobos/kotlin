package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class While : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while)

        var x = 0
        while (x < 10) {
            Toast.makeText(this,"$x", Toast.LENGTH_LONG).show()
            x++ // igual a decir x += 1
        }
    }
}