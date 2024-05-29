
package com.mycompany.pokemon;

public abstract class Pikachu extends Pokemon implements IElectrico {
    
    public Pikachu(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }
      
    @Override
    public void AltoVoltaje() {

    }

    @Override
    public void Electrorrayo() {

    }

    @Override
    public void Trueno() {

    }

    @Override
    public void CampoElectrico() {

    }

    @Override
    public void AtaqueFulgor() {

    }
    
}

