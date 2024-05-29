
package com.mycompany.pokemon;

import java.io.Serializable;

public enum TipoPokemon implements Serializable{
    FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, TIERRA, VOLADOR, HADA, LUCHA;
    
    private static int [][] tablaDeDano={
        {1, 1, 2, 2, 2, 4, 2, 2, 2},
        {4, 1, 2, 2, 2, 2, 2, 2, 2},
        {2, 2, 1, 2, 2, 2, 2, 4, 2},
        {2, 4, 2, 1, 2, 0, 4, 2, 2},
        {2, 2, 4, 2, 1, 2, 2, 2, 4},
        {2, 4, 4, 4, 2, 2, 0, 2, 2},
        {2, 2, 2, 4, 2, 2, 2, 2, 4},
        {2, 2, 1, 2, 2, 2, 2, 2, 1},
        {2, 2, 2, 2, 1, 2, 1, 4, 2},
    };
    
    public static int obtenerMultiplicadorDeDano (TipoPokemon atacante, TipoPokemon defensor){
        return tablaDeDano[atacante.ordinal()][defensor.ordinal()];
    }
    
    
    
}

