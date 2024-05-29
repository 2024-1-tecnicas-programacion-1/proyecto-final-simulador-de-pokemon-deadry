
package com.mycompany.pokemon;


public class Jigglypuff extends Pokemon implements IHada{
    
    public Jigglypuff(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueHada() {
 
    }   
}
