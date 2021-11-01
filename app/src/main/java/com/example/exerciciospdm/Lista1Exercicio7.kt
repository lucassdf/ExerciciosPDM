package com.example.exerciciospdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio7.*

class Lista1Exercicio7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio7)
        val envio = editText1.text
        val envio2 = editText2.text


       buttonEnviar.setOnClickListener {

           val intent = Intent(this, Lista1Exercicio7Detalhe::class.java)
           intent.putExtra("Endereco", "$envio")
          // val intent2 = Intent(this, Lista)
           intent.putExtra("Cidade", "$envio2")
           startActivity(intent)
       }

    }
}