package com.example.birthdaycard

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class birthdaygreet : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA= "name_extra"
    }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreet)

        val greets =findViewById<TextView>(R.id.greeting)
        val name = intent.getStringExtra(NAME_EXTRA)
        greets.text="happy Birthday\n$name!"
    }
}