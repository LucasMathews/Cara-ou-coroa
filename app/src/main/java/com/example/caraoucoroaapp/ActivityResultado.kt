package com.example.caraoucoroaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ActivityResultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if(numero==0){
            image_resultado.setImageResource(R.drawable.moeda_coroa)
        }else{
            image_resultado.setImageResource(R.drawable.moeda_cara)
        }
        button_back.setOnClickListener {
            finish()
        }
    }
}