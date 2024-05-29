package com.mycompany.pokemon;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
   private static List<Entrenador> entrenadores = new ArrayList<>();
   private static List<Pokemon> pokemones = new ArrayList<>();
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
                    System.out.println("Saliendo UPoke...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcion != 4);
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
                    System.out.println("Ingrese el nombre del nuevo entrenador:");
                    String nombre = sc.next();
                    entrenadores.add(new Entrenador(nombre));
                    System.out.println("Entrenador " + nombre + " registrado exitosamente.");
                    break;
                case 2:
                     for (Entrenador entrenador : entrenadores) {
                        System.out.println(entrenador.getNombre());
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del entrenador: ");
                    sc.nextLine(); 
                    String nombreEntrenador = sc.nextLine();
                    Entrenador entrenadorSeleccionado = buscarEntrenador(nombreEntrenador);                   
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
                     for (Pokemon pokemon : pokemones) {
                        System.out.println(pokemon);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del pokémon: ");
                    sc.nextLine(); // Consume newline
                    String nombrePokemon = sc.nextLine();
                    System.out.print("Ingrese el nivel del pokémon: ");
                    int nivel = sc.nextInt();
                    pokemones.add(new Pokemon(nombrePokemon, nivel));
                    System.out.println("Pokémon registrado exitosamente.");
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
    
    private static Entrenador buscarEntrenador(String nombre) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equalsIgnoreCase(nombre)) {
                return entrenador;
            }
        }
        return null;
    }
}