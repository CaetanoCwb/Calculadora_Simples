package com.example.calculadora_smp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valor1 = findViewById(R.id.et_valor1) as EditText
        val valor2 = findViewById(R.id.et_valor2) as EditText
        val resultado = findViewById(R.id.et_valor3) as EditText
        val btn1 = findViewById(R.id.soma) as Button
        val btn2 = findViewById(R.id.subtrai) as Button
        val btn3 = findViewById(R.id.multiplica) as Button
        val btn4 = findViewById(R.id.divide) as Button
        val btn5 = findViewById(R.id.porcento) as Button

        btn1.setOnClickListener {
            val val1 = valor1.text.toString().toFloat();
            val val2 = valor2.text.toString().toFloat();

            val total = val1 + val2

            resultado.setText(total.toString())
        }

        btn2.setOnClickListener {
            val val1 = valor1.text.toString().toFloat();
            val val2 = valor2.text.toString().toFloat();

            val total = val1 - val2

            resultado.setText(total.toString())
        }

        btn3.setOnClickListener {
            val val1 = valor1.text.toString().toFloat();
            val val2 = valor2.text.toString().toFloat();

            val total = val1 * val2

            resultado.setText(total.toString())
        }

        btn4.setOnClickListener {
            val val1 = valor1.text.toString().toFloat();
            val val2 = valor2.text.toString().toFloat();

            val total = val1 / val2

            resultado.setText(total.toString())
        }

        btn5.setOnClickListener {
            val val1 = valor1.text.toString().toFloat();
            val val2 = valor2.text.toString().toFloat();

            val total = (val1 * 100) / val2

            resultado.setText(total.toString())
        }

        /*btn6.setOnClickListener {
         val val1 = valor1.text.toString().toFloat();
         val val2 = valor2.text.toString().toFloat();
         if (resultado != 0) val total1 = resultado
        }*/

    }
}