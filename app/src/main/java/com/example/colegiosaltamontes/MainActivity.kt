package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val duracion: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logo =findViewById<ImageView>(R.id.gifLogo)

        cambiarActivity()
    }

    private fun cambiarActivity(){
        Handler().postDelayed(Runnable {
            startActivity(Intent(this,MenuActivity::class.java))
        },duracion)
    }
}