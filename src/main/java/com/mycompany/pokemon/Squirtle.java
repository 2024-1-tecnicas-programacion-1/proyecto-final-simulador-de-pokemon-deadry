package com.mycompany.pokemon;

public abstract class Squirtle extends Pokemon implements IAgua {

    public Squirtle(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void AtaqueAgua() {
        PuntosdeAtaque = 48;
    }
    @Override 
    public void vida(){
    salud=44;
    }
     @Override
    public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }
}
