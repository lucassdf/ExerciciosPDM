package com.example.exerciciospdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio9_detalhe.*

class Lista1Exercicio9Detalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio9_detalhe)

        buttonSomar.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1").toString().trim().toInt()
            val valor2 = intent.getStringExtra("valor2").toString().trim().toInt()
            val resultado = valor1 + valor2
            val enviar = resultado.toString()

            val returnIntent = Intent()
            returnIntent.putExtra("retorno", "$enviar")
            setResult(RESULT_OK, returnIntent)
            finish()

        }
        buttonSubtrair.setOnClickListener {

            val valor1 = intent.getStringExtra("valor1").toString().trim().toInt()
            val valor2 = intent.getStringExtra("valor2").toString().trim().toInt()
            val resultado = valor1 - valor2
            val enviar = resultado.toString()

            val returnIntent = Intent()
            returnIntent.putExtra("retorno", "$enviar")
            setResult(RESULT_OK, returnIntent)
            finish()


        }
        buttonDividir.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1").toString().trim().toInt()
            val valor2 = intent.getStringExtra("valor2").toString().trim().toInt()
            val resultado = valor1 / valor2
            val enviar = resultado.toString()

            val returnIntent = Intent()
            returnIntent.putExtra("retorno", "$enviar")
            setResult(RESULT_OK, returnIntent)
            finish()

        }
        buttonMultiplicar.setOnClickListener {
            val valor1 = intent.getStringExtra("valor1").toString().trim().toInt()
            val valor2 = intent.getStringExtra("valor2").toString().trim().toInt()
            val resultado = valor1 * valor2
            val enviar = resultado.toString()

            val returnIntent = Intent()
            returnIntent.putExtra("retorno", "$enviar")
            setResult(RESULT_OK, returnIntent)
            finish()

        }



    }
}