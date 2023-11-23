package br.edu.utfpr.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.edu.utfpr.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvContador = findViewById<TextView>( R.id.tvContador )
        tvContador.text = Datasource().loadAffirmation().size.toString()

    }
}