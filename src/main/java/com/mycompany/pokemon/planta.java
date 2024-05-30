
package com.mycompany.pokemon;


public  class planta extends Pokemon implements IPlanta {
    public planta(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }
    @Override
    public void AtaquePlanta() {
        PuntosdeAtaque = 0;
    }

    public void Vida() {
        salud = 0;
    }

    @Override
    public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }
}

   