package com.screen.buttonsintents

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

open class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = 0
        var iStr = ""
        val remover = findViewById<Button>(R.id.button)
        remover.setOnClickListener {
            iStr = i.toString()
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(EXTRA_MESSAGE,iStr)
            startActivity(intent)
        }
         val adder = findViewById<Button>(R.id.button2)
        adder.setOnClickListener{
            ++i
            findViewById<EditText>(R.id.number).setText(i.toString())
        }
    }

}