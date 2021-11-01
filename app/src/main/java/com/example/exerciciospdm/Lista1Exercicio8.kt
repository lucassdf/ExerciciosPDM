package com.example.exerciciospdm

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio8.*

class Lista1Exercicio8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio8)

        buttonAbrir.setOnClickListener {

            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse(editTextWeb.text.toString()))
            startActivity(intent)

        }


    }
}