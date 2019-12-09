package com.lara.cuatroproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //1º añadido al gradle: ANKO
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_busqueda.setOnClickListener {
            seleccionar(it)
        }
        btn_captura.setOnClickListener {

        }
        btn_operacion.setOnClickListener {

        }

    }


    //funcion que manda a la activity correspondiente dependiendo del boton pulsado
    fun seleccionar(v: View) {
        val botonAux = v as Button


        if (botonAux == btn_busqueda) {
            val miIntent = Intent(this, Act_Busqueda::class.java)
            //miIntent.putExtra("color", "amarillo")
            startActivity(miIntent)
        }
    }
}
