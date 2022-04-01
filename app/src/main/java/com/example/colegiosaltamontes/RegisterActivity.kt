package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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

        val button1: Button = findViewById(R.id.butnRegistrar)
        button1.setOnClickListener{onClick()}

        val button2: Button = findViewById(R.id.btnSalir)
        button2.setOnClickListener{onClicka()}
    }

    private fun onClicka() {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }

    private fun onClick() {
        var estudiantes:Estudiantes= Estudiantes()


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
            Toast.makeText(applicationContext, "Nota erronea, las notas deben ser entre 0 y 5", Toast.LENGTH_SHORT).show()
            /*texto!!.text="Nota erronea, las notas deben ser entre 0 y 5"
            texto1!!.text=""*/
        }
        else if(estudiantes.nota1!! >5 || estudiantes.nota2!! >5 || estudiantes.nota3!! >5 || estudiantes.nota4!! >5 || estudiantes.nota5!! >5){
            Toast.makeText(applicationContext, "Nota erronea, las notas deben ser entre 0 y 5", Toast.LENGTH_SHORT).show()
            /*texto!!.text="Nota erronea, las notas deben ser entre 0 y 5"
            texto1!!.text=""*/
        }
        else{
            var promedio=(estudiantes.nota1!! + estudiantes.nota2!! + estudiantes.nota3!! + estudiantes.nota4!! + estudiantes.nota5!!)/5

            estudiantes.promedio=promedio

            var resultado:String?=null

            if(promedio>=3.5){
                resultado="EL ESTUDIANTE PASO EL PERIODO, ¡FELICIDADES!"
            }else{
                resultado="EL ESTUDIANTE PERDIO"
            }

            estudiantes.resultado=resultado

            if(estudiantes.nombre!="" && estudiantes.documento!="" && estudiantes.materia1!="" && estudiantes.materia2!="" && estudiantes.materia3!="" && estudiantes.materia4!="" && estudiantes.materia5!="")
                {
                var operaciones:Operaciones= Operaciones()
                operaciones.registrar(estudiantes)

                var intent =  Intent(this,ResultadoActivity::class.java)
                val bundle: Bundle = Bundle()

                bundle.putString("nombre", estudiantes.nombre)
                bundle.putString("documento", estudiantes.documento)
                bundle.putString("materia 1", estudiantes.materia1)
                bundle.putString("materia 2", estudiantes.materia2)
                bundle.putString("materia 3", estudiantes.materia3)
                bundle.putString("materia 4", estudiantes.materia4)
                bundle.putString("materia 5", estudiantes.materia5)

                bundle.putDouble("Nota 1", estudiantes.nota1!!)
                bundle.putDouble("Nota 2", estudiantes.nota2!!)
                bundle.putDouble("Nota 3", estudiantes.nota3!!)
                bundle.putDouble("Nota 4", estudiantes.nota4!!)
                bundle.putDouble("Nota 5", estudiantes.nota5!!)

                bundle.putDouble("Promedio", estudiantes.promedio!!)
                bundle.putString("Resultado", estudiantes.resultado)

                var recuperacion: String? = null
                if (promedio <= 2.5) {
                    recuperacion = "No puede"
                }
                else if (promedio <= 3.5) {
                    recuperacion = "Puede recuperar"
                }
                else {
                    recuperacion = null
                }
                if (recuperacion != null) {
                    bundle.putString("recuperacion", recuperacion)
                }
                intent.putExtras(bundle)
                startActivity(intent)
                }

            }


        }

    }




