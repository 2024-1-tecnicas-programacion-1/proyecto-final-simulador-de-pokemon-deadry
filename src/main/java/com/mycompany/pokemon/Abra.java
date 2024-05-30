package com.mycompany.pokemon;

public class Abra extends Pokemon implements IPsiquico {

    public Abra(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
    super(nombre, salud, PuntosdeAtaque, TipoPokemon.PSIQUICO, Estado.NORMAL);
    }

    @Override
    public void AtaquePsiquico() {
        PuntosdeAtaque=20;
    }
    @Override
    public void vida(){
    salud=25;
    }
    
     @Override
    public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }

}
