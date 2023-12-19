package com.example.prueba19dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookTitleActivity : AppCompatActivity() {

    private lateinit var boton : Button
    private lateinit var titulo : EditText
    private lateinit var paginas : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        boton=findViewById(R.id.buttonmain)
        titulo=findViewById(R.id.TITULO)
        paginas=findViewById(R.id.PAGINAS)

        boton.setOnClickListener()
        startActivity(intent)
    }









}

@Override
private fun Button.setOnClickListener() {

}


