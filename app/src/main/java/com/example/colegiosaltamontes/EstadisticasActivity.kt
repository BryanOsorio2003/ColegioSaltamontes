package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class EstadisticasActivity : AppCompatActivity() {
    var lista = Operaciones.listaEstudiantes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        var registrados = findViewById<TextView>(R.id.estudiantesRegistrados)
        var ganadores = findViewById<TextView>(R.id.estudiantesGanadores)
        var perdedores = findViewById<TextView>(R.id.estudiantesPerdedores)
        var recuperar = findViewById<TextView>(R.id.estudiantesPosibleRecuperar)

        var cantidadTotal= lista.size
        var cantidadGanadores:Int = totalEstudiantesGanadores()
        var cantidadPerdedores:Int = totalEstudiantesPerdedores()
        var cantidadRecuperacion:Int = totalEstudiantesRecuperacion()

        registrados.text="$cantidadTotal"
        ganadores.text="$cantidadGanadores"
        perdedores.text="$cantidadPerdedores"
        recuperar.text="$cantidadRecuperacion"

        var btnSalir = findViewById<Button>(R.id.btnVolver)
        btnSalir.setOnClickListener { onClick() }
    }

    private fun totalEstudiantesRecuperacion(): Int {
        var cantidad = 0
        for (estudiantes in lista){
            if (estudiantes.recuperacion == true){
                cantidad=cantidad+1
            }
        }
        return cantidad
    }

    private fun totalEstudiantesPerdedores(): Int {
        var cantidad=0
        for (est in lista){
            if (est.resultado.equals("Perdio")){
                cantidad += 1
            }
        }

        return cantidad
    }

    private fun totalEstudiantesGanadores(): Int {
        var cantidad=0
        for (estudiantes in lista){
            if (estudiantes.resultado.equals("Gano")){
                cantidad += 1
            }
        }
        return cantidad
    }

    private fun onClick() {
        var intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}