package com.lara.cuatroproyecto

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Pack200


const val BUSQUEDA_REQUEST=1
const val CAPTURA_REQUEST=2
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

            startActivityForResult(miIntent, BUSQUEDA_REQUEST)
        }else if(botonAux==btn_captura){
            val miIntent = Intent(this, Act_Busqueda::class.java)

            startActivityForResult(miIntent, CAPTURA_REQUEST)

        }

    }



    //en esta funcion se pueden ir recogiendo las diferentes activity results de cada activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == BUSQUEDA_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
                //CAMBIAR COLOR DEL BOTON Y QUE NO SE PUEDA CLICAR DE NUEVO
                btn_busqueda.setBackgroundColor(Color.GREEN)// el boton cambia de color
                btn_busqueda.isClickable=false //el boton se bloquea

            }

        }


    }

}
