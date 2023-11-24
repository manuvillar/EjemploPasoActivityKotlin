package es.iesoretania.ejemplopasoactivitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.iesoretania.ejemplopasoactivitykotlin.databinding.ActivityDatosBinding

class DatosActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDatosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.TextViewNumero.textSize = 26F
        binding.TextViewText.textSize = 26F

        val bundle = intent.extras
        val numero = bundle?.getInt("numero")
        val texto = bundle?.getString("texto")

        binding.TextViewNumero.text = numero.toString()
        binding.TextViewText.text = texto

        binding.botonAtras.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}