
package com.mycompany.pokemon;

import java.io.Serializable;

public enum TipoPokemon implements Serializable{
    FUEGO, AGUA, VENENO, ELECTRICO, PSIQUICO, TIERRA, VOLADOR, HADA, LUCHA,Electrico,Planta,Fuego;
    
    private static int [][] tablaDeDano={
        {1, 1, 2, 2, 2, 3, 2, 2, 2},
        {3, 1, 2, 2, 2, 2, 2, 2, 2},
        {2, 2, 1, 2, 2, 2, 2, 3, 2},
        {2, 3, 2, 1, 2, 0, 3, 2, 2},
        {2, 2, 3, 2, 1, 2, 2, 2, 3},
        {2, 3, 3, 3, 2, 2, 0, 2, 2},
        {2, 2, 2, 3, 2, 2, 2, 2, 3},
        {2, 2, 1, 2, 2, 2, 2, 2, 1},
        {2, 2, 2, 2, 1, 2, 1, 3, 2},
    };
    
    public static int obtenerMultiplicadorDeDano (TipoPokemon atacante, TipoPokemon defensor){
        
        return tablaDeDano[atacante.ordinal()][defensor.ordinal()];
    }
    
    
    
}

