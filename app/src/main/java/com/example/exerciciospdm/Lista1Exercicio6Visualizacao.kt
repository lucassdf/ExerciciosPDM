package com.example.exerciciospdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio6_visualizacao.*

class Lista1Exercicio6Visualizacao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio6_visualizacao)
        //var b = intent.getIntExtra(a)

        if(intent.getStringExtra(("imagem")) == "maca")
           imageView.setImageResource(R.drawable.maca)
        if(intent.getStringExtra(("imagem")) == "pera")
            imageView.setImageResource(R.drawable.pera)
        if(intent.getStringExtra(("imagem")) == "uva")
            imageView.setImageResource(R.drawable.uva)

    }
}