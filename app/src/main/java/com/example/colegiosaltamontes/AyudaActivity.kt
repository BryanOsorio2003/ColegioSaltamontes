package com.example.colegiosaltamontes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class AyudaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        val button: Button = findViewById(R.id.buttonVolver1)
        button.setOnClickListener{onClick()}
    }

    private fun onClick() {
        val intent = Intent(this,MenuActivity::class.java)
        startActivity(intent)
    }
}