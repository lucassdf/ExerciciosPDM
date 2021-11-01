package com.example.exerciciospdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_lista1_exercicio5.*

class Lista1Exercicio5 : AppCompatActivity(), View.OnClickListener {
    private var resultado = 0
    private var operacaoAcionada = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista1_exercicio5)
       //clickListeners()
        txtValores.setText("")
        txtResultado.setText("")

        btn0.setOnClickListener{
            atualizaNumeroExpressao("0")
        }
        btn1.setOnClickListener{
            atualizaNumeroExpressao("1")
        }
        btn2.setOnClickListener{
            atualizaNumeroExpressao("2")
        }
        btn3.setOnClickListener{
            atualizaNumeroExpressao("3")

        }
        btn4.setOnClickListener{
            atualizaNumeroExpressao("4")

        }
        btn5.setOnClickListener{
            atualizaNumeroExpressao("5")

        }
        btn6.setOnClickListener{
            atualizaNumeroExpressao("6")

        }
        btn7.setOnClickListener{
            atualizaNumeroExpressao("7")

        }
        btn8.setOnClickListener{
            atualizaNumeroExpressao("8")

        }
        btn9.setOnClickListener{
            atualizaNumeroExpressao("9")

        }
        btnDiv.setOnClickListener{
            atualizaOperacaoCalculo(" / ")

        }
        btnMult.setOnClickListener{
            atualizaOperacaoCalculo(" x ")

        }
        btnSub.setOnClickListener{
            atualizaOperacaoCalculo(" - ")

        }
        btnSoma.setOnClickListener{
            atualizaOperacaoCalculo(" + ")

        }
        btnIgual.setOnClickListener{
            //atualizaOperacaoCalculo(" = ")
            val calcResultExp: Int
            calcResultExp = getCalculo(txtValores.text.toString())
            txtResultado.setText(calcResultExp.toString())

        }
        btnApagar.setOnClickListener{
            atualizaTextView(txtValores,"",true)
            atualizaTextView(txtResultado,"",true)
        }


    }
    fun atualizaOperacaoCalculo(caracter:String ){
        txtValores.text = txtValores.text.toString() + caracter
        operacaoAcionada = true
    }

    fun atualizaNumeroExpressao(caracter:String){
        atualizaTextView(txtValores,caracter)
        if (operacaoAcionada){
            operacaoAcionada = false
        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    private fun atualizaTextView(textView: TextView, caracter:String, zerar:Boolean = false ){
        if(zerar){
            textView.setText(caracter);
        } else {
            textView.text = textView.text.toString() + caracter;
        }

    }

    fun getCalculo(expressao:String): Int {
        var resultado:Int = 0

        val nums = expressao.split("[+-/x]".toRegex()).toTypedArray()
        val op = expressao.replace("\\s+".toRegex(),"").split("\\d".toRegex()).toTypedArray()
        var i:Int = 1

        resultado = resultado + nums[0].toString().trim().toInt()
        for(itemOp in op ){
            if(itemOp.contains("[+-/x]".toRegex())){
                when (itemOp) {
                    "+"-> {
                        resultado = resultado + nums[i].toString().trim().toInt()
                    }
                    "-"-> {
                        resultado = resultado - nums[i].toString().trim().toInt()
                    }
                    "x"-> {
                        resultado = resultado * nums[i].toString().trim().toInt()
                    }
                    "/"-> {
                        resultado = resultado / nums[i].toString().trim().toInt()
                    }
                }
                i++
            }


        }

        return resultado
    }
}


