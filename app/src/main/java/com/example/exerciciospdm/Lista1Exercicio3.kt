package com.example.exerciciospdm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_lista1_exercicio3.*

class Lista1Exercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio3)

        carregarSpinner("app")
        carregarSpinner("email")


        buttonConfirmar.setOnClickListener {
                val msg = """Nome: ${editNome.text}
                |Email : ${editEmail.text}
                |Tipo de Email: ${spinTipoEmail.selectedItem}
                |App : ${editApp.text}
                |Tipo de App: ${spinTipoApp.selectedItem}
                |
                """.trimMargin()

                alert("Bem vindo", msg, this)
        }

    }



    private fun carregarSpinner(tipo: String) {
        if(tipo == "app") {
            //Carregar spinner
            val itens = arrayOf("Selecione", "WhatsApp", "Telegram", "Signal", "Discord", "Teams")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinTipoApp.adapter = adapter
        }
        if(tipo == "email")
        {
            val itens = arrayOf("Selecione", "Pessoal", "Profissional", "Outro")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinTipoEmail.adapter = adapter
        }
    }
    fun alert(titulo: String, msg: String, ctx: Context) {
        AlertDialog.Builder(ctx)
            .setTitle(titulo)
            .setMessage(msg)
            .setPositiveButton("OK", null)
            .create()
            .show()
    }

}