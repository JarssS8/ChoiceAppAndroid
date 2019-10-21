package com.example.random_choice_app

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class RandomNumber : AppCompatActivity() {
    private var resulName: TextView? = null
    private var initialNumber: EditText? = null
    private var lastNumber: EditText? = null
    private var resulNumber: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_number)


        resulName = findViewById(R.id.txtMessageResul)
        initialNumber = findViewById(R.id.txtInitialNumber)
        lastNumber = findViewById(R.id.txtLastNumber)
        resulNumber = findViewById(R.id.txtResulNumber)
    }

    fun Randomize(v: View) {
        if (initialNumber?.text.toString().trim().isNotEmpty() && lastNumber?.text.toString().trim().isNotEmpty()) {

            var firstNumber: Int = Integer.parseInt(initialNumber?.text.toString().trim())
            var lastNumberInt: Int = Integer.parseInt(lastNumber?.text.toString().trim())
            resulName?.text = "El numero aleatorio es el..."

            if (firstNumber != lastNumberInt) {
                if (firstNumber > lastNumberInt) {
                    var aux = lastNumberInt
                    lastNumberInt = firstNumber
                    firstNumber = aux
                }
                resulNumber?.text = Random.nextInt(firstNumber, lastNumberInt + 1).toString()
            } else
                resulNumber?.text = firstNumber.toString()

        } else {
            resulName?.text = ""
            resulNumber?.text = ""
            if (initialNumber?.text.toString().trim().isEmpty() && lastNumber?.text.toString().trim().isEmpty())
                Toast.makeText(this, "Both values are empty", Toast.LENGTH_SHORT).show()
            else if (initialNumber?.text.toString().trim().isEmpty())
                Toast.makeText(this, "Initial value is empty", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "Last value is empty", Toast.LENGTH_SHORT).show()
        }


    }
}