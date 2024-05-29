

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
        if (this.estado == Estado.NORMAL && oponente.estado == Estado.NORMAL){
            oponente.recibirDaño(this.PuntosdeAtaque);
            System.out.println(this.nombre + " ataca a " + oponente.nombre + " causando " + this.PuntosdeAtaque + " puntos de daño.");
        }
        else{
            System.out.println(this.nombre + "no puede atacar porque esta en estado" + this.estado);
        }
    }
    public void recibirDaño(int danio){
        this.salud -= danio;
        if (this.salud < 0){
           this.salud = 0;
       }
        System.out.println(this.nombre + " recibe " + danio + " puntos de daño. Salud restante: " + this.salud);
        if (this.salud == 0){
            this.estado = Estado.DEBILITADO;
            System.out.println(this.nombre + "ha sido debilitado");
        }
        
    }
   public void entrenar() {
        this.PuntosdeAtaque += 5;
        this.salud += 10;
        System.out.println(this.nombre + " ha sido entrenado. Puntos de ataque aumentados a " + this.PuntosdeAtaque);
        System.out.println(this.nombre + " ha sido entrenado. Salud aumentada a " + this.salud);
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return PuntosdeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public Estado getEstado() {
        return estado;
    }
}
        


