package com.lara.cuatroproyecto

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_act__captura.*

const val REQUEST_IMAGE_CAPTURE = 1
class Act_Captura : AppCompatActivity() {
//importante agregado al manifest uses-feature para que pueda utilizar la app de la camara del movil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act__captura)
    btn_camara.setOnClickListener {
        dispatchTakePictureIntent()
    }
    }


    //esto esta copidado del otro ejercicio tal cual hay q modificarlo
   // funcion que intenta conectar con la app camara y sacar una foto
    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }


    //funcion que recoge el resultado de la camara y si se ha hecho una foto la muestra en la app
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(imageBitmap)
        }
    }
}

}
