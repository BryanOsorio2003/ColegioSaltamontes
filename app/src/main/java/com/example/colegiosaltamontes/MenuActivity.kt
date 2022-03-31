package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val button1: Button = findViewById(R.id.btnIrRegistrar)
        button1.setOnClickListener{onClick(1)}

        val button2: Button = findViewById(R.id.btnEstadisticas)
        button2.setOnClickListener{onClick(2)}

        val button3: Button = findViewById(R.id.btnAyuda)
        button3.setOnClickListener{onClick(3)}
    }

    private fun onClick(boton: Int) {
        when(boton){
            1->{
                val intent = Intent(this,RegisterActivity::class.java)
                startActivity(intent)
            }
            2->{

            }
            3->{

            }
        }

    }
}