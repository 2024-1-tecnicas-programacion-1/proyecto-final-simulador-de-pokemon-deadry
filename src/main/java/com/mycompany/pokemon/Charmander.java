
package com.mycompany.pokemon;


public abstract class Charmander extends Pokemon implements IFuego {
    
    public Charmander(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }
    
    @Override
    public void BalonIgneo() {

    }

    @Override
    public void Ascuas() {

    }

    @Override
    public void DanzaLlama() {

    }

    @Override
    public void DíaSoleado() {

    }

    @Override
    public void LluviaIgnea() {

    }
    
}

