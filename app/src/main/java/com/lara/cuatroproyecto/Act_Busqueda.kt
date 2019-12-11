package com.lara.cuatroproyecto

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_act__busqueda.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.toast

class Act_Busqueda : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act__busqueda)



        btn_comprobar.setOnClickListener {
            comprobar()
        }

        //boton que llama una url con una pagina pista para la respuesta
        btn_pista.setOnClickListener {
            browse("https://es.wikipedia.org/wiki/Computadora_personal#Historia")
        }


    }


    //funcion que comprueba que la fecha sea la correcta
    fun comprobar() {

        val fechaCorrecta = "1964"
        //meter la fecha dada en un int
        val fecha = txt_fecha.text.toString()


        //comprobar si la respuesta es igual o no a la correcta
        if (fecha == fechaCorrecta) {
            toast("RESPUESTA CORRECTA")
            //que mande un result_ok para recogerlo en el main
            setResult(Activity.RESULT_OK)
            //cerrar la activity
            finish()
        } else {
            toast("INTENTALO DE NUEVO")

        }



    }

}
