package com.screen.buttonsintents

import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import android.widget.EditText


class MainActivity2 : MainActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var k = intent.getStringExtra(EXTRA_MESSAGE).toString().toInt()
        val butReturn = findViewById<Button>(R.id.button4)
        butReturn.setOnClickListener{
            val tempIntent = Intent(this, MainActivity:: class.java)
            tempIntent.putExtra(k.toString(),"String")
            startActivity(tempIntent)
        }
        val removeButton = findViewById<Button>(R.id.button3)
        removeButton.setOnClickListener{
            --k
            findViewById<EditText>(R.id.editText2).setText(k.toString())
        }
    }

    }
