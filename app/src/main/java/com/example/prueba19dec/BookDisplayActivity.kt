package com.example.prueba19dec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

    private var Info : MutableList<Book> = TODO()
    private lateinit var boton : Button

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        boton=findViewById(R.id.buttonvolvermain)


    }
}