

package com.mycompany.pokemon;


public abstract class Pokemon {

    protected String nombre;
    protected int salud;
    protected int PuntosdeAtaque;
    protected TipoPokemon tipo;
    protected Estado estado;

    public Pokemon(String nombre, int salud, int PuntosdeAtaque, TipoPokemon tipo, Estado estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.PuntosdeAtaque = PuntosdeAtaque;
        this.tipo = tipo;
        this.estado = estado;
    }
    public void atacar (Pokemon oponente){
        
    }
    public void recibirDaño(int danio){
        
    }
    public void entrenar(){
    
    }
        
    }

