package com.mycompany.pokemon;

public abstract class Abra extends Pokemon implements IPsiquico {

    public Abra(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void AtaquePsiquico() {
        PuntosdeAtaque=20;
    }

}
