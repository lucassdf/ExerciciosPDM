package com.example.exerciciospdm

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio9.*
import kotlinx.android.synthetic.main.activity_lista1_exercicio9.buttonEnviar

class Lista1Exercicio9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio9)
        val envio = editTextValor1.text
        val envio2 = editTextValor2.text

        buttonEnviar.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio9Detalhe::class.java)
            intent.putExtra("valor1", "$envio")
            // val intent2 = Intent(this, Lista)
            intent.putExtra("valor2", "$envio2")
            startActivityForResult(intent, 1)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == RESULT_OK){
            val resp = data?.getStringExtra("retorno")
            editTextResultado.setText(resp)
            }
        }
    }
