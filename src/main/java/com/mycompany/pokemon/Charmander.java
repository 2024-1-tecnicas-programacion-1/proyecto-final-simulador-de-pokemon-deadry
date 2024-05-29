package com.mycompany.pokemon;

public abstract class Charmander extends Pokemon implements IFuego {

    public Charmander(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void AtaqueFuego() {
        PuntosdeAtaque=52;
    }
}
