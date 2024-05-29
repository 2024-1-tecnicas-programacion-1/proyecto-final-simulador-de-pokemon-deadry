
package com.mycompany.pokemon;

import java.util.ArrayList;
import java.util.List;




public class Entrenador {
    private String nombre;
    private List <Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }
    
    public void agregarPokemon(Pokemon pokemon){
        pokemones.add(pokemon);
    }
    public void entrenarPokemon(Pokemon pokemon){
        pokemon.entrenar();
    }
    public void mostrarPokemones(){
        for(Pokemon pokemon : pokemones){
            System.out.println(pokemon);
        }
    }
    public void prepararBatalla(){
        
    }
    
    
    
    
}
