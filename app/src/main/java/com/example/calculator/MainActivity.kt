package com.example.calculator


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var firsOperandET: EditText
    private lateinit var secondOperandET: EditText

    private lateinit var buttonSumBTN: Button
    private lateinit var buttonDifBTN: Button
    private lateinit var buttonMultBTN: Button
    private lateinit var buttonDivBTN: Button

    private lateinit var buttonResetBTN: Button
    private lateinit var buttonExitBTN: Button


    private lateinit var resultTV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        firsOperandET = findViewById(R.id.firstOperandET)
        secondOperandET = findViewById(R.id.secondOperandET)

        buttonSumBTN = findViewById(R.id.buttonSumBTN)
        buttonDifBTN = findViewById(R.id.buttonDifBTN)
        buttonMultBTN = findViewById(R.id.buttonMultBTN)
        buttonDivBTN = findViewById(R.id.buttonDivBTN)
        resultTV = findViewById(R.id.resultTVV)
        buttonResetBTN = findViewById(R.id.buttonResetBTN)
        buttonExitBTN = findViewById(R.id.buttonExitBTN)

        buttonSumBTN.setOnClickListener(this)
        buttonDifBTN.setOnClickListener(this)
        buttonMultBTN.setOnClickListener(this)
        buttonDivBTN.setOnClickListener(this)
        buttonResetBTN.setOnClickListener(this)
        buttonExitBTN.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        var check = true
        if (firsOperandET.text.isEmpty() || secondOperandET.text.isEmpty()) {
            return
        }
        var first = firsOperandET.text.toString().toDouble()
        var second = secondOperandET.text.toString().toDouble()

        var result = when (v.id) {
            R.id.buttonSumBTN -> Operation(first, second).sum()
            R.id.buttonDifBTN -> Operation(first, second).dif()
            R.id.buttonMultBTN -> Operation(first, second).mult()
            R.id.buttonDivBTN -> Operation(first, second).div()
            R.id.buttonResetBTN -> {
                firsOperandET.text.clear()
                secondOperandET.text.clear()
                check = false
            }

            R.id.buttonExitBTN -> finish()



            else -> 0.0
        }
        if (!check) resultTV.text = "результат" else resultTV.text = result.toString()


    }
}








