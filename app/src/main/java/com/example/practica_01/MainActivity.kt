package com.example.practica_01

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG = "hola mundo"
    lateinit var myBoton: Button
    lateinit var editTextDato: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top,
                systemBars.right, systemBars.bottom)
            insets
        }
        Log.i(TAG, "go Oncreate!")

        editTextDato = findViewById(R.id.editText)
        myBoton = findViewById<Button>(R.id.bt_intent)

        myBoton.setOnClickListener{

            val dato = editTextDato.text.toString()
            val intent = Intent(this, Activity2::class.java).apply {
                putExtra("dato", dato)
            }

            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "go Oncreate!")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "go Oncreate!")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "go Oncreate!")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "go Oncreate!")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "go Oncreate!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "go Oncreate!")
    }


}
//israel abraham gutierrez enriquez