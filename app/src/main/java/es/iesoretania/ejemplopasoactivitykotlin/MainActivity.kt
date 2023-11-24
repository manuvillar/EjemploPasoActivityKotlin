package es.iesoretania.ejemplopasoactivitykotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.iesoretania.ejemplopasoactivitykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            val intent = Intent(this, DatosActivity::class.java)
            val num = binding.editTextNumero.text.toString()
            intent.putExtra("numero", num.toInt())
            intent.putExtra("texto", binding.editTextText.text.toString())
            startActivity(intent)
        }
    }
}