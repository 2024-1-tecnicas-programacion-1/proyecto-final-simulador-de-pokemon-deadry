
package com.mycompany.pokemon;

import java.util.ArrayList;
import java.util.List;


public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public void agregarPokemon(Pokemon pokemon) {
        pokemones.add(pokemon);
    }

    
    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();
        } else {
            System.out.println("El Pokémon no pertenece al entrenador.");
        }
    }

    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println("El entrenador no tiene Pokémons.");
        } else {
            for (Pokemon pokemon : pokemones) {
                System.out.println(pokemon);
            }
        }
    }

    public void prepararBatalla(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            System.out.println("El Pokémon " + pokemon.getNombre() + " está listo para la batalla!");
        } else {
            System.out.println("El Pokémon no pertenece al entrenador.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
}
