package com.example.exerciciospdm

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class Lista1Exercicio2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio2)

        val editNome2 = findViewById<EditText>(R.id.editNome2)
        val editTel = findViewById<EditText>(R.id.editEmail)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editWhats = findViewById<EditText>(R.id.editWhats)

        val checkBoxtel = findViewById<CheckBox>(R.id.checkBoxTel)
        val checkBoxEmail = findViewById<CheckBox>(R.id.checkBoxEmail)
        val checkBoxWhats = findViewById<CheckBox>(R.id.checkBoxWhats)

        val buttonCadastrar = findViewById<Button>(R.id.buttonCadastrar)

        editTel.isEnabled = false;
        editEmail.isEnabled = false;
        editWhats.isEnabled = false;

        checkBoxtel.setOnCheckedChangeListener{button: CompoundButton, checked: Boolean ->

            if(checkBoxtel.isChecked){
                editTel.isEnabled = true;
            }
            else
                editTel.isEnabled = false;
        }

        checkBoxEmail.setOnCheckedChangeListener{button: CompoundButton, checked: Boolean ->

            if(checkBoxEmail.isChecked){
                editEmail.isEnabled = true;
            }
            else
                editEmail.isEnabled = false;
        }

        checkBoxWhats.setOnCheckedChangeListener{button: CompoundButton, checked: Boolean ->

            if(checkBoxWhats.isChecked){
                editWhats.isEnabled = true;
            }
            else
                editWhats.isEnabled = false;

        }

        buttonCadastrar.setOnClickListener{
            if(editNome2.text.isNotEmpty() && editTel.text.isNotEmpty() &&  editEmail.text.isNotEmpty() && editWhats.text.isNotEmpty()){
                    //raw string
                    var msg = """Nome: ${editNome2.text}
                /Telefone: ${editTel.text}
                /Email: ${editEmail.text}
                /WhatsApp: ${editWhats.text}
                /
                /Preferencia de Contato
               
                """.trimMargin("/")

                    if (checkBoxtel.isChecked) {
                        msg += "\n - Telefone"
                    }

                    if (checkBoxEmail.isChecked) {
                        msg += "\n - Email"
                    }
                    if (checkBoxWhats.isChecked) {
                        msg += "\n - WhatsApp"
                    }

                    alert("Cadastro Efetuado com sucesso!", msg, this)
                } else {
                    alert("Erro", "Voce deve preencher os campos selecionados", this)
                }
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


