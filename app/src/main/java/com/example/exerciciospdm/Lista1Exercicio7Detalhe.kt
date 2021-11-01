package com.example.exerciciospdm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_lista1_exercicio7_detalhe.*

class Lista1Exercicio7Detalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio7_detalhe)

        var msg = """Endereco e Cidade:
            /${intent.getStringExtra("Endereco") +" - "+ intent.getStringExtra("Cidade")}
                
            """.trimMargin("/")

        alert("Cadastro Efetuado com sucesso!", msg, this)

    }

    fun alert(titulo: String, msg: String, ctx: Context){
        AlertDialog.Builder(ctx)
            .setTitle(titulo)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }
}