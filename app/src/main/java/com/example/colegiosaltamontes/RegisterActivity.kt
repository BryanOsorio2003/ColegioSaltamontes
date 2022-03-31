package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    var campoNombre: EditText?=null
    var campoTelefono: EditText ?=null
    var campoDocumento: EditText?=null
    var campoDireccion: EditText?=null
    var campoEdad: EditText?=null


    var campoMateria1: EditText?=null
    var campoMateria2: EditText?=null
    var campoMateria3: EditText?=null
    var campoMateria4: EditText?=null
    var campoMateria5: EditText?=null

    var campoNota1: EditText?=null
    var campoNota2: EditText?=null
    var campoNota3: EditText?=null
    var campoNota4: EditText?=null
    var campoNota5: EditText?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        campoNombre=findViewById(R.id.inputName)
        campoTelefono=findViewById(R.id.inputPhone)
        campoDocumento=findViewById(R.id.inputDocument)
        campoDireccion=findViewById(R.id.inputAddress)
        campoEdad=findViewById(R.id.inputAge)

        campoMateria1=findViewById(R.id.materia1)
        campoMateria2=findViewById(R.id.materia2)
        campoMateria3=findViewById(R.id.materia3)
        campoMateria4=findViewById(R.id.materia4)
        campoMateria5=findViewById(R.id.materia5)

        campoNota1=findViewById(R.id.nota1)
        campoNota2=findViewById(R.id.nota2)
        campoNota3=findViewById(R.id.nota3)
        campoNota4=findViewById(R.id.nota4)
        campoNota5=findViewById(R.id.nota5)


        val button1: Button = findViewById(R.id.btnRegistrar)
        button1.setOnClickListener{onClick(1)}

        val button2: Button = findViewById(R.id.btnSalir)
        button2.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton: Int) {
        when(boton){
            1->{
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
            }
            2->{

            }
        }

    }

}

