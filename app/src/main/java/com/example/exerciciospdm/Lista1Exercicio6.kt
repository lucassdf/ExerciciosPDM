package com.example.exerciciospdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista1_exercicio6.*

class Lista1Exercicio6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio6)
        var a:String = ""

        imageView1.setImageResource(R.drawable.maca)
        imageView1.tag = 1
        imageView2.setImageResource(R.drawable.maca)
        imageView2.tag = 2
        imageView3.setImageResource(R.drawable.pera)
        imageView3.tag = 3
        imageView4.setImageResource(R.drawable.pera)
        imageView4.tag = 4
        imageView5.setImageResource(R.drawable.uva)
        imageView5.tag = 5
        imageView6.setImageResource(R.drawable.uva)
        imageView6.tag = 6

        imageView1.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView1.tag == 1)
                a = "maca"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }
        imageView2.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView2.tag == 2)
                a = "maca"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }
        imageView3.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView3.tag == 3)
                a = "pera"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }
        imageView4.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView4.tag == 4)
                a = "pera"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }
        imageView5.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView5.tag == 5)
                a = "uva"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(this, Lista1Exercicio6Visualizacao::class.java)
            if(imageView6.tag == 6)
                a = "uva"
            intent.putExtra("imagem",a)
            startActivity(intent)
        }

    }
}