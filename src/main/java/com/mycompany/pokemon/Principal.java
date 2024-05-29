package com.mycompany.pokemon;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("**/////////////////////**");
            System.out.println("///Bienvenido a UPoke///");
            System.out.println("**/////////////////////**");
            System.out.println("Ingrese alguna de las siguientes opciones:");
            System.out.println("1) Gestionar entrenadores");
            System.out.println("2) Gestionar Pokemones");
            System.out.println("3) Iniciar Batalla");
            System.out.println("4) Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    gestionarEntrenadores(sc);
                    break;
                case 2:
                    gestionarPokemones(sc);
                    break;
                case 3:
                    iniciarBatalla(sc);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }

    public static void gestionarEntrenadores(Scanner sc) {
        int opcionEntrenador;
        do {
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1) Registrar un nuevo entrenador");
            System.out.println("2) Ver lista de entrenadores");
            System.out.println("3) Seleccionar un entrenador");
            System.out.println("4) Volver al menú principal");
            opcionEntrenador = sc.nextInt();

            switch (opcionEntrenador) {
                case 1:
                    // agregar para registrar un nuevo entrenador
                    System.out.println("Registrar un nuevo entrenador");
                    break;
                case 2:
                    // agregar para ver lista de entrenadores
                    System.out.println("Ver lista de entrenadores");
                    break;
                case 3:
                    // agregar para seleccionar un entrenador
                    System.out.println("Seleccionar un entrenador");
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcionEntrenador != 4);
    }

    public static void gestionarPokemones(Scanner sc) {
        int opcionPokemones;
        do {
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1) Ver todos los pokemones registrados");
            System.out.println("2) Registrar pokémon");
            System.out.println("3) Volver al menú principal");
            opcionPokemones = sc.nextInt();

            switch (opcionPokemones) {
                case 1:
                    // agregar para ver todos los pokemones registrados
                    System.out.println("Ver todos los pokemones registrados");
                    break;
                case 2:
                    // agregar para registrar un pokémon
                    System.out.println("Registrar pokémon");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcionPokemones != 3);
    }

    public static void iniciarBatalla(Scanner sc) {
        int opcionBatalla;
        do {
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1) Elegir entrenador 1");
            System.out.println("2) Elegir entrenador 2");
            System.out.println("3) Seleccionar Pokémon de entrenador 1");
            System.out.println("4) Seleccionar Pokémon de entrenador 2");
            System.out.println("5) Comenzar batalla");
            System.out.println("6) Volver al menú principal");
            opcionBatalla = sc.nextInt();

            switch (opcionBatalla) {
                case 1:
                    // agregar para elegir entrenador 1
                    System.out.println("Elegir entrenador 1");
                    break;
                case 2:
                    // agregar para elegir entrenador 2
                    System.out.println("Elegir entrenador 2");
                    break;
                case 3:
                    // agregar para seleccionar Pokémon de entrenador 1
                    System.out.println("Seleccionar Pokémon de entrenador 1");
                    break;
                case 4:
                    // agregar para seleccionar Pokémon de entrenador 2
                    System.out.println("Seleccionar Pokémon de entrenador 2");
                    break;
                case 5:
                    // agregar para comenzar batalla
                    System.out.println("[Nombre del Pokémon 1] vs. [Nombre del Pokémon 2]");
                    gestionarBatalla(sc);
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcionBatalla != 6);
    }

    public static void gestionarBatalla(Scanner sc) {
        int opcionAccion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1) [Pokémon 1] Atacar");
            System.out.println("2) [Pokémon 2] Atacar");
            System.out.println("3) Finalizar la batalla");
            opcionAccion = sc.nextInt();

            switch (opcionAccion) {
                case 1:
                    // agregar para que Pokémon 1 ataque
                    System.out.println("[Pokémon 1] ataca");
                    break;
                case 2:
                    // agregar para que Pokémon 2 ataque
                    System.out.println("[Pokémon 2] ataca");
                    break;
                case 3:
                    System.out.println("Finalizando la batalla...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcionAccion != 3);
    }
}