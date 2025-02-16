package mx.edu.itson.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Reporte : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datos_cliente)

        val asiento : TextView = findViewById(R.id.asiento)
        val btnConfirmar : TextView = findViewById(R.id.btnConfirmar)
        val nombreCliente : EditText = findViewById(R.id.nombreCliente)

        btnConfirmar.setOnClickListener{
            val intent = Intent(this, Index::class.java)
            startActivity(intent)
        }
    }
}