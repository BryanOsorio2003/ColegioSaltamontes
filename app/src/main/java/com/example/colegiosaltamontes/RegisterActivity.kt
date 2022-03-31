package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

    var texto: TextView?=null
    var texto1: TextView?=null

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

        texto=findViewById(R.id.texto)
        texto1=findViewById(R.id.texto1)

        val button1: Button = findViewById(R.id.btnRegistrar)
        button1.setOnClickListener{onClick(1)}

        val button2: Button = findViewById(R.id.btnSalir)
        button2.setOnClickListener{onClick(2)}
    }

    private fun onClick(boton: Int) {
        when(boton){
            1->{
                var estudiantes:Estudiantes= Estudiantes()
                var operaciones: Operaciones= Operaciones()

                estudiantes.nombre=campoNombre?.text.toString()
                estudiantes.telefono=campoTelefono?.text.toString()
                estudiantes.documento=campoDocumento?.text.toString()
                estudiantes.direccion=campoDireccion?.text.toString()
                estudiantes.edad=campoEdad?.text.toString().toInt()

                estudiantes.materia1=campoMateria1?.text.toString()
                estudiantes.materia2=campoMateria2?.text.toString()
                estudiantes.materia3=campoMateria3?.text.toString()
                estudiantes.materia4=campoMateria4?.text.toString()
                estudiantes.materia5=campoMateria5?.text.toString()

                estudiantes.nota1=campoNota1?.text.toString().toDouble()
                estudiantes.nota2=campoNota2?.text.toString().toDouble()
                estudiantes.nota3=campoNota3?.text.toString().toDouble()
                estudiantes.nota4=campoNota4?.text.toString().toDouble()
                estudiantes.nota5=campoNota5?.text.toString().toDouble()

                if(estudiantes.nota1!! <0 || estudiantes.nota2!! <0 || estudiantes.nota3!! <0 || estudiantes.nota4!! <0 || estudiantes.nota5!! <0){
                    texto!!.text="Nota erronea, las notas deben ser entre 0 y 5"
                    texto1!!.text=""
                }
                else if(estudiantes.nota1!! >5 || estudiantes.nota2!! >5 || estudiantes.nota3!! >5 || estudiantes.nota4!! >5 || estudiantes.nota5!! >5){
                    texto!!.text="Nota erronea, las notas deben ser entre 0 y 5"
                    texto1!!.text=""
                }
                else{
                    var promedio=(estudiantes.nota1!! + estudiantes.nota2!! + estudiantes.nota3!! + estudiantes.nota4!! + estudiantes.nota5!!)/5

                    estudiantes.promedio=promedio

                    //texto.text="Materia: $materia1 con nota $nota1\n Materia: $materia2 con nota $nota2\n Materia: $materia3 con nota $nota3\n Materia: $materia4 con nota $nota4\n Materia: $materia5 con nota $nota5\n Promedio: $promedio"
                    if(promedio>=3.5){
                        texto1!!.text="EL ESTUDIANTE PASO EL PERIODO, ¡FELICIDADES!"
                    }
                    else{
                        if(promedio>=2.5 && promedio<=3.4){
                            texto1!!.text="Puede recuperar las materias,¡PONGASE LAS PILAS!"
                        }
                        else{
                            texto1!!.text="No puede recuperar, no tiene posibilidades a recuperar, ¡lo siento!"
                        }
                    }
                }


                if(estudiantes.nombre!="" && estudiantes.documento!="" && estudiantes.materia1!="" && estudiantes.materia2!="" && estudiantes.materia3!="" && estudiantes.materia4!="" && estudiantes.materia5!=""){
                    operaciones.registrar(estudiantes)

                    var intent =  Intent(this,ResultadoActivity::class.java)
                    val bundle: Bundle = Bundle()
                }
            }
            2->{
                val intent = Intent(this,MenuActivity::class.java)
                startActivity(intent)
            }
        }

    }

}

