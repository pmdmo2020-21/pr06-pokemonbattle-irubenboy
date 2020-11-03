package es.iessaladillo.pedrojoya.intents.data.local

import es.iessaladillo.pedrojoya.intents.R
import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon

object Database : DataSource{
    private var pokemons = listOf<Pokemon>() // Create to empty list

    init { // Create all pokemons to the list
        val p1 = Pokemon(1, "Pikachu", 10.0, R.drawable.pikachu)
        val p2 = Pokemon(2, "Bulbasur", 8.0, R.drawable.bulbasur)
        val p3 = Pokemon(3, "Cubone", 7.5, R.drawable.cubone)
        val p4 = Pokemon(4, "Feebas", 6.5, R.drawable.feebas)
        val p5 = Pokemon(5, "Giratina", 8.5, R.drawable.giratina)
        val p6 = Pokemon(6, "", 9.6, R.drawable.gyarados)
        pokemons = listOf(p1, p2, p3, p4, p5, p6) // add pokemons to list
    }
    override fun getRandomPokemon(): Pokemon {
        TODO("Not yet implemented")
    }

    override fun getAllPokemons(): List<Pokemon> {
        return pokemons
    }

    override fun getPokemonById(id: Long): Pokemon? {
        return pokemons.get(id.toInt())
    }

}