
package com.mycompany.pokemon;


public class Grimer extends Pokemon implements IVeneno{
    
    public Grimer(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueVeneno(){    
    PuntosdeAtaque = 80;
    }
    
    @Override
    public void vida() {
    salud = 80;  
    }
}