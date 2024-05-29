package com.mycompany.pokemon;

import java.io.Serializable;

public enum Estado implements Serializable {
    NORMAL, DEBILITADO, FORTALECIDO, ENVENENADO, PARALIZADO, DORMIDO, CONGELADO, QUEMADO, CONFUNDIDO, ATRAPADO, INFATUADO, CEGADO, CLAUSURADO, TORMENTADO;

    public boolean puedeAtacar() {
        return this == NORMAL || this == FORTALECIDO;
    }

    public boolean estaDebilitado() {
        return this == DEBILITADO;
    }

    public static Estado cambiarEstado(Estado estadoActual, Estado nuevoEstado) {
        if (estadoActual == DEBILITADO) {
            return estadoActual;
        }
        return nuevoEstado;
    }
}
