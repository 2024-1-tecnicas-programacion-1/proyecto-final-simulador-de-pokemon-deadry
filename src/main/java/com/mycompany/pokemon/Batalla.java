public class Batalla {

    private Entrenador entrenador1;
    private Entrenador entrenador2;
    
    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        resetearPokemon(pokemon1, pokemon2); // Restablecer los Pokémon antes de cada batalla
       
        System.out.println("¡La batalla entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre() + " ha comenzado!");

        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            realizarAtaque(pokemon1, pokemon2);

            if (pokemon2.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " ha sido derrotado. ¡" + pokemon1.getNombre() + " gana la batalla!");
                break;
            }

            realizarAtaque(pokemon2, pokemon1);

            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon1.getNombre() + " ha sido derrotado. ¡" + pokemon2.getNombre() + " gana la batalla!");
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

    private void resetearPokemon(Pokemon pokemon1, Pokemon pokemon2) {
        if(pokemon1.getEstado() == Estado.DEBILITADO){
            pokemon1.setEstado(Estado.NORMAL);
            System.out.println(pokemon1.getNombre() + " ha sido rehabilitado y su salud ha sido restaurada a su estado inicial.");
            pokemon1.setSalud(pokemon1.getSaludInicial()); // Restablecer la salud inicial
        }
        if(pokemon2.getEstado() == Estado.DEBILITADO){
            pokemon2.setEstado(Estado.NORMAL);
            System.out.println(pokemon2.getNombre() + " ha sido rehabilitado y su salud ha sido restaurada a su estado inicial.");
            pokemon2.setSalud(pokemon2.getSaludInicial()); // Restablecer la salud inicial
        }
    }   
}