package mx.edu.itson.popcornfactory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

/**
 * Eduardo Talavera Ramos - 00000245244
 * 13/02/2025
 */
class DetalleContenido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_pelicula)

        var peliculaImagen: ImageView = findViewById(R.id.iv_pelicula_imagen)
        var nombrePelicula: TextView = findViewById(R.id.tv_nombre_pelicula)
        var peliculaDesc: TextView = findViewById(R.id.tv_pelicula_desc)
        var seatsLeft: TextView = findViewById(R.id.seatsLeft)
        var buyTickets: Button = findViewById(R.id.buyTickets)

        val bundle = intent.extras
        var ns = 0;
        var id = -1;
        var title = ""

        if(bundle != null){
            ns = bundle.getInt("numberSeats")
            peliculaImagen.setImageResource(bundle.getInt("header"))
            nombrePelicula.setText(bundle.getString("titulo"))
            peliculaDesc.setText(bundle.getString("sinopsis"))
            seatsLeft.setText("$ns seats available ")
            id = bundle.getInt("pos")
        }

        if (ns == 0){
            buyTickets.isEnabled = false
        } else {
            buyTickets.setOnClickListener {
                val intent: Intent = Intent(this, SeatSelection::class.java)
                intent.putExtra("movie", id)
                intent.putExtra("name", title)
                startActivity(intent)
            }
        }
    }
}