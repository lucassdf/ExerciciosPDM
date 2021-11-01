package com.example.exerciciospdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_lista1_exercicio4.*

class Lista1Exercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio4)

        carregarSpinner("opcao")
        //carregarSpinner("genero")

        spinOpcao.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if(p2 == 1)
                    carregarSpinner("filme")
                if(p2 == 2)
                    carregarSpinner("musica")
                if(p2 == 3)
                    carregarSpinner("livro")
                if(p2 == 4)
                    carregarSpinner("jogo")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }



    }
    private fun carregarSpinner(tipo: String) {
            if(tipo == "opcao") {
                //Carregar spinner
                val itens = arrayOf("Selecione", "Filmes", "Músicas", "Livros", "Jogos")
                val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                spinOpcao.adapter = adapter
            }
            if(tipo == "filme") {
            //Carregar spinner
            val itens = arrayOf("Selecione", "Ação", "Comédia", "Terror", "Drama")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinGenero.adapter = adapter
            }
            if(tipo == "musica") {
            //Carregar spinner
            val itens = arrayOf("Selecione", "Samba", "Rock", "Rap/HIP HOP", "Sertanejo")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinGenero.adapter = adapter
            }
            if(tipo == "livro") {
            //Carregar spinner
            val itens = arrayOf("Selecione", "Romance", "Ficção Literária", "Épico", "Poemas")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinGenero.adapter = adapter
            }
            if(tipo == "jogo") {
            //Carregar spinner
            val itens = arrayOf("Selecione", "RPG", "MMORPG", "PUZZLE", "ESPORTES")
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, itens)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinGenero.adapter = adapter
            }

    }
}