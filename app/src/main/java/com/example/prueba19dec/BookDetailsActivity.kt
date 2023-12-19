package com.example.prueba19dec

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

private lateinit var boton: Button
private lateinit var botondos: Button
private lateinit var autor: EditText
private lateinit var anio: EditText

class BookDetailsActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)


        boton = findViewById(R.id.buttondetails)
        botondos = findViewById(R.id.buttonatras1)
        autor = findViewById(R.id.AUTOR)
        anio = findViewById(R.id.ANIO)


    }







}