
package com.mycompany.pokemon;


public abstract class Bulbasaur extends Pokemon implements IVeneno,IPlanta {
    
    public Bulbasaur(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        super(nombre, salud, PuntosdeAtaque, tipo, estado);
    }
    
     @Override
    public void lodoBom(){
    
    }
    
     @Override
    public void puyaNociva(){
        
    }   
    
     @Override
    public void colaVeneno(){
        
    }
    
     @Override
    public void lanzaMugre(){
        
    }
    
     @Override
    public void acido(){
    }
}
    

