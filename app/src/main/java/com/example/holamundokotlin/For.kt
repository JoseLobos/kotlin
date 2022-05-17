package com.example.holamundokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class For : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for)

        val names = listOf("Anne", "Peter", "Jeff")
        for (name in names) {
            Toast.makeText(this, name, Toast.LENGTH_LONG).show()
        }
        for (x in 0 until 10 step 2){
            Toast.makeText(this, "$x", Toast.LENGTH_LONG).show()
        }
        for (x in 0 until 10)
            Toast.makeText(this,"$x", Toast.LENGTH_LONG).show() // muestra de 0 a 9
        for (x in 0 until 10 step 2)
            Toast.makeText(this,"$x", Toast.LENGTH_LONG).show()
        for (x in 10 downTo 0 step 2)
            Toast.makeText(this,"$x", Toast.LENGTH_LONG).show()


    }
}