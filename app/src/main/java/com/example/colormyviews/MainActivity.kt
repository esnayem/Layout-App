package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val redButton: Button = findViewById(R.id.red_button)
        val yellowButton: Button = findViewById(R.id.yellow_button)
        val greenButton: Button = findViewById(R.id.green_button)


        redButton.setOnClickListener(){
            redClick()
        }

        yellowButton.setOnClickListener()
        {
            yellowClick()
        }

        greenButton.setOnClickListener()
        {
            greenClick()
        }
    }

    private fun redClick(){
        findViewById<TextView>(R.id.box_three_text).setBackgroundColor(Color.RED)
    }

    private fun yellowClick()
    {
        findViewById<TextView>(R.id.box_four_text).setBackgroundColor(Color.YELLOW)
    }

    private fun greenClick(){
        findViewById<TextView>(R.id.box_five_text).setBackgroundColor(Color.GREEN)
    }

}