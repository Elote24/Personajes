package com.elliot.personajes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val personajeAdapter = PersonajeAdapter(createPersonajes())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = personajeAdapter

        personajeAdapter.notifyDataSetChanged()
    }

        fun createPersonajes(): List<Personaje> {
            val personajes = mutableListOf<Personaje>()

            personajes.add(
                Personaje(
                    R.drawable.ic_batman,
                    "Batman",
                    "Batman es un superheroes sin superpoderes"
                )
            )

            personajes.add(
                Personaje(
                    R.drawable.ic_superman,
                    "Superman",
                    "Superman es un superheroe con superfuerza y puede volar "
                )
            )

            personajes.add(
                Personaje(
                    R.drawable.ic_hombre_arana,
                    "Spiderman",
                    "Spiderman es un superheroe con poderes de una araña"
                )
            )

            return personajes
        }
    }
