package com.mycompany.pokemon;

public class Batalla {

    private Entrenador entrenador1;
    private Entrenador entrenador2;
    
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
    System.out.println("¡La batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + " ha comenzado!");

    while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
        realizarAtaque(pokemon1, pokemon2);

        if (pokemon2.getSalud() <= 0) {
            System.out.println(pokemon2.getNombre() + " ha sido derrotado. ¡" + pokemon1.getNombre() + " gana la batalla!");
            resetearPokemon(pokemon2);
            break;
        }

        realizarAtaque(pokemon2, pokemon1);

        if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon1.getNombre() + " ha sido derrotado. ¡" + pokemon2.getNombre() + " gana la batalla!");
            resetearPokemon(pokemon1);
            resetearPokemon(pokemon2);
            break;
        }            
    }
}

    private void realizarAtaque(Pokemon atacante, Pokemon defensor) {
        if (atacante.getEstado() == Estado.NORMAL && defensor.getEstado() == Estado.NORMAL) {
            int multiplicador = TipoPokemon.obtenerMultiplicadorDeDano(atacante.getTipo(), defensor.getTipo());
            int danio = (atacante.getPuntosDeAtaque() * multiplicador);
            defensor.recibirDaño(danio);
            System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " causando " + danio + " puntos de daño.");
        } else {
            System.out.println(atacante.getNombre() + " no puede atacar porque está en estado " + atacante.getEstado());
        }
    }    

    public void resetearPokemon(Pokemon pokemon) {
        pokemon.setSalud(pokemon.getsaludInicial());
        pokemon.setEstado(Estado.NORMAL);
    }    
}

