package mx.edu.itson.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

/**
 * Eduardo Talavera Ramos - 00000245244
 * 13/02/2025
 */
class Index : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_index)

        val btnWelcome: Button = findViewById(R.id.btn_welcome)

        btnWelcome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}