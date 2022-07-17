package com.example.birthdaycard

import android.content.Intent
import android.os.Bundle

import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createbirthdaybutton(){


        val nameinp =findViewById<EditText>(R.id.editTextTextPersonName)
        val name = nameinp.editableText.toString()

        val intent = Intent(this,birthdaygreet::class.java)
        intent.putExtra(birthdaygreet.NAME_EXTRA ,name)
        startActivity(intent)

    }

}