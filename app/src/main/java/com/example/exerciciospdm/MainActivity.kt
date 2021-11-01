package com.example.exerciciospdm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       button1.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio1::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio2::class.java)
            startActivity(intent)

        }

        button3.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio3::class.java)
            startActivity(intent)

        }

        button4.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio4::class.java)
            startActivity(intent)

        }

        button5.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio5::class.java)
            startActivity(intent)

        }

        button6.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio6::class.java)
            startActivity(intent)

        }

        button7.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio7::class.java)
            startActivity(intent)

        }

        button8.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio8::class.java)
            startActivity(intent)

        }

        button9.setOnClickListener {
            //intent explicito
            val intent = Intent(this, Lista1Exercicio9::class.java)
            startActivity(intent)

        }


    }
}