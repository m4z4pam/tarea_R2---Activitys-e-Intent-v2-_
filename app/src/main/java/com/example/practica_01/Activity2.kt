package com.example.practica_01

import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {

    lateinit var editTextCity: EditText
    lateinit var btNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top,
                systemBars.right, systemBars.bottom)
            insets
        }

        val datoRecibido = intent.getStringExtra("dato")

        editTextCity = findViewById(R.id.editTextCity)
        btNext = findViewById(R.id.bt_next)

        btNext.setOnClickListener {
            val city = editTextCity.text.toString()

            val intent = Intent(this, Activity3::class.java).apply {
                putExtra("dato", datoRecibido)
                putExtra("city", city)
            }
            startActivity(intent)
        }
    }
}
