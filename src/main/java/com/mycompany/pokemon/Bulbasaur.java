package com.mycompany.pokemon;

public abstract class Bulbasaur extends Pokemon implements IVeneno, IPlanta {

    public Bulbasaur(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueVeneno() {
        PuntosdeAtaque=49;
    }
}
