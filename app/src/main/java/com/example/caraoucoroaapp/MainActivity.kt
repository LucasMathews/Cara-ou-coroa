package com.example.caraoucoroaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_press.setOnClickListener {
            val intent = Intent(applicationContext,ActivityResultado::class.java)

            //Gerar numero randomico
            val numero = Random().nextInt(2)

            //enviar numero para próxima activity
            intent.putExtra("numero","numero")

            startActivity(intent)
        }
    }
}