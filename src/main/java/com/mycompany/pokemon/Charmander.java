package com.mycompany.pokemon;

public abstract class Charmander extends Pokemon implements IFuego {

    public Charmander(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void AtaqueFuego() {
        PuntosdeAtaque=52;
    }
    @Override
    public void Vida(){
    salud=39;
    }
     @Override
    public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }
}
