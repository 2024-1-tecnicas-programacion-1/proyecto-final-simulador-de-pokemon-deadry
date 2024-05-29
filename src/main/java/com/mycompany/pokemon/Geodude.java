package com.mycompany.pokemon;

public class Geodude extends Pokemon implements ITierra{
    
    public Geodude(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueTierra() {
    PuntosdeAtaque = 80;
   
    }
    
    @Override
    public void vida() {
    salud = 40;
    }
}