package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

private lateinit var result_edit_Text: TextView
private lateinit var buttonB: Button
private lateinit var enter_Text: EditText
private lateinit var countingCharacters: TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        result_edit_Text = findViewById(R.id.result_Text)
        buttonB = findViewById(R.id.ButtonB)
        enter_Text = findViewById(R.id.Enter_Text)
        countingCharacters = findViewById(R.id.countingCharacters_Text)
        onclick(buttonB)
    }

    fun onclick(view: View) {
        var inputText = enter_Text.text.toString()
        var filterText = inputText.filter { it != ' ' }
       // var lengthChar = inputText.let {it.length}
        countingCharacters.text=inputText.length.toString()
        result_edit_Text.text=filterText



    }

}