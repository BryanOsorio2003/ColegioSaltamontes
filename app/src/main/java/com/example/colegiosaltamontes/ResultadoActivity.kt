package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var resultado = findViewById<TextView>(R.id.resultado)
        var promedio = findViewById<TextView>(R.id.promedio)
        var documento = findViewById<TextView>(R.id.documento)
        var nombre = findViewById<TextView>(R.id.nombre)


        var btnSalir=findViewById<Button>(R.id.buttonSalir)
        btnSalir.setOnClickListener { onClick() }

        var campoMateria1 = findViewById<TextView>(R.id.campoMateria1)
        var campoNota1 = findViewById<TextView>(R.id.campoNota1)
        var campoMateria2 = findViewById<TextView>(R.id.campoMateria2)
        var campoNota2 = findViewById<TextView>(R.id.campoNota2)
        var campoMateria3 = findViewById<TextView>(R.id.campoMateria3)
        var campoNota3 = findViewById<TextView>(R.id.campoNota3)
        var campoMateria4 = findViewById<TextView>(R.id.campoMateria4)
        var campoNota4 = findViewById<TextView>(R.id.campoNota4)
        var campoMateria5 = findViewById<TextView>(R.id.campoMateria5)
        var campoNota5 = findViewById<TextView>(R.id.campoNota5)
        var recupera = findViewById<TextView>(R.id.recupera)

        var bundle: Bundle? = this.intent.extras

        resultado.text="${bundle?.getString("resultado")}"
        promedio.text="${bundle?.getDouble("promedioF")}"
        documento.text="${bundle?.getString("documento")}"
        nombre.text="${bundle?.getString("nombre")}"

        campoMateria1.text="${bundle?.getString("nombreMateria1")}"
        campoNota1.text="${bundle?.getDouble("notaMateria1")}"
        campoMateria2.text="${bundle?.getString("nombreMateria2")}"
        campoNota2.text="${bundle?.getDouble("notaMateria2")}"
        campoMateria3.text="${bundle?.getString("nombreMateria3")}"
        campoNota3.text="${bundle?.getDouble("notaMateria3")}"
        campoMateria4.text="${bundle?.getString("nombreMateria4")}"
        campoNota4.text="${bundle?.getDouble("notaMateria4")}"
        campoMateria5.text="${bundle?.getString("nombreMateria5")}"
        campoNota5.text="${bundle?.getDouble("notaMateria5")}"
        if (bundle?.getString("resultado")=="Perdio") {
            recupera.text = "Puede recuperar: ${bundle?.getString("recuperacion")}"
        }
    }
    private fun onClick() {
        var intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}