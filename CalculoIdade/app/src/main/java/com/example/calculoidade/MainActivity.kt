package com.example.calculoidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularMedia(view:View){

        val anoAtual:Int = Calendar.getInstance().get(Calendar.YEAR);
        val result:Int = anoAtual - dataNascimento.text.toString().toInt();

        resultado.text = "Sua idade é " + result;

    }
}
