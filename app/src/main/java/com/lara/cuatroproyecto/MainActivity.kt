package com.lara.cuatroproyecto

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


const val BUSQUEDA_REQUEST=1

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
            startActivityForResult(miIntent, BUSQUEDA_REQUEST)
        }
    }

    //en esta funcion se pueden ir recogiendo las diferentes activity results de cada activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == BUSQUEDA_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
               //AÑADIR CODIGO DE SI ES CORRECTO EL RESULTADO
                //CAMBIAR COLOR DEL BOTON Y QUE NO SE PUEDA CLICAR DE NUEVO
            }

        }
    }
}
