package com.elliot.personajes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonajeAdapter(private val personajes: List<Personaje>) : RecyclerView.Adapter<PersonajeAdapter.PersonajeHolder>() {
    class PersonajeHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        fun onBind(personaje: Personaje) {
            val image = view.findViewById<ImageView>(R.id.image)
            val title = view.findViewById<TextView>(R.id.title)
            val content = view.findViewById<TextView>(R.id.content)

            image.setImageResource(personaje.image)
            title.text = personaje.title
            content.text = personaje.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.card_characters, parent, false)
        return PersonajeHolder(view)
    }

    override fun onBindViewHolder(personajeHolder: PersonajeHolder, position: Int) {
        val personaje = personajes[position]
        personajeHolder.onBind(personaje)
    }

    override fun getItemCount(): Int {
        return personajes.size
    }
}