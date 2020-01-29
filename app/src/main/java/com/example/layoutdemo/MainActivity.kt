package com.example.layoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun greeting(view: View){

        val name = name_text.text
        val number = lucky_number.text.toString().toInt()

        message.text = "Hello $name, your lucky number is $number"

    }
}
