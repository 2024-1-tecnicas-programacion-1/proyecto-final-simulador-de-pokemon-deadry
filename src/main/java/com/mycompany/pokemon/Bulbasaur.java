package com.mycompany.pokemon;

public class Bulbasaur extends Pokemon implements IVeneno, IPlanta {

    public Bulbasaur(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }

    @Override
    public void ataqueVeneno() {
        PuntosdeAtaque=49;
    }
    @Override
    public void vida(){
    salud=45;
    }
     @Override
    public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }

    @Override
    public void AtaquePlanta() {
        PuntosdeAtaque=49;
    }

    @Override
    public void Vida() {
        salud=45;
    }

    
}
