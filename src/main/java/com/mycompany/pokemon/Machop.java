
package com.mycompany.pokemon;


public class Machop extends Pokemon implements ILucha{
    
    public Machop(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueLucha(){
    PuntosdeAtaque = 80;
    }
    
    @Override
    public void vida() {
    salud = 70;   
    }
}
