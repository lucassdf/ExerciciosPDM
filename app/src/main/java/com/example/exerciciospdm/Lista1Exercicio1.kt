package com.example.exerciciospdm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Lista1Exercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio1)

        val editNome2 = findViewById<EditText>(R.id.editNome2)
        val editTel = findViewById<EditText>(R.id.editTel)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editWhats = findViewById<EditText>(R.id.editWhats)

        val checkBoxtel = findViewById<CheckBox>(R.id.checkBoxTel)
        val checkBoxEmail = findViewById<CheckBox>(R.id.checkBoxEmail)
        val checkBoxWhats = findViewById<CheckBox>(R.id.checkBoxWhats)

        val buttonCadastrar = findViewById<Button>(R.id.buttonCadastrar)

        buttonCadastrar.setOnClickListener{
            //raw string
            var msg = """Nome: ${editNome2.text}
                /Telefone: ${editTel.text}
                /Email: ${editEmail.text}
                /WhatsApp: ${editWhats.text}
                /
                /Preferencia de Contato
               
            """.trimMargin("/")

            if(checkBoxtel.isChecked){
                msg +="\n - Telefone"
            }

            if(checkBoxEmail.isChecked){
                msg +="\n - Email"
            }
            if(checkBoxWhats.isChecked){
                msg +="\n - WhatsApp"
            }

            alert("Cadastro Efetuado com sucesso!", msg, this)

        }

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