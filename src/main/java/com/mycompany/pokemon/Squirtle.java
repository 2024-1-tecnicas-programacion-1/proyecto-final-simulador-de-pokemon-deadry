package com.mycompany.pokemon;

public abstract class Squirtle extends Pokemon implements IAgua {

    public Squirtle(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void AtaqueAgua() {
        PuntosdeAtaque = 48;
    }
}
