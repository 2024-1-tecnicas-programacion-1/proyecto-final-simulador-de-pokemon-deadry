
package com.mycompany.pokemon;


public class Pidgey extends Pokemon implements IVolador{
    
    public Pidgey(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueVolador() {
    PuntosdeAtaque = 45;
    }
    
    @Override
    public void vida() {
    salud = 40;   
    }
}