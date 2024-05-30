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
            System.out.println("2) Pokemones disponibles");
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

                    if (entrenadorSeleccionado != null) {
                        int opcionEquipo;
                        do {
                            System.out.println("Seleccione una de las siguientes opciones:");
                            System.out.println("1) Ver equipo de pokémones");
                            System.out.println("2) Agregar pokémon al equipo");
                            System.out.println("3) Entrenar pokémon");
                            System.out.println("4) Volver al menú de gestionar entrenadores");
                            opcionEquipo = sc.nextInt();

                            switch (opcionEquipo) {
                                case 1:
                                    entrenadorSeleccionado.mostrarPokemones();
                                    break;
                                case 2:
                                    System.out.println("Pokémons disponibles:");
                                    System.out.println("1) Charmander");
                                    System.out.println("2) Squirtle");
                                    System.out.println("3) Bulbasaur");
                                    System.out.println("4) Pikachu");
                                    System.out.println("5) Abra");
                                    System.out.println("6) Geodude");
                                    System.out.println("7) Pidgey");
                                    System.out.println("8) Jigglypuff");
                                    System.out.println("9) Machop");
                                    System.out.println("10) Grimer");

                                    System.out.println("Seleccione un Pokémon para agregar al equipo:");
                                    int opcionPokemon = sc.nextInt();

                                    Pokemon pokemonSeleccionado = null;

                                    switch (opcionPokemon) {
                                        case 1:
                                            pokemonSeleccionado = new Charmander("Charmander", 39, 52, TipoPokemon.FUEGO, Estado.NORMAL);
                                            break;
                                        case 2:
                                            pokemonSeleccionado = new Squirtle("Squirtle", 44, 48, TipoPokemon.AGUA, Estado.NORMAL);
                                            break;
                                        case 3:
                                            pokemonSeleccionado = new Bulbasaur("Bulbasaur", 45, 49, TipoPokemon.VENENO, Estado.NORMAL);
                                            break;
                                        case 4:
                                            pokemonSeleccionado = new Pikachu("Pikachu", 35, 55, TipoPokemon.ELECTRICO, Estado.NORMAL);
                                            break;
                                        case 5:
                                            pokemonSeleccionado = new Abra("Abra", 25, 20, TipoPokemon.PSIQUICO, Estado.NORMAL);
                                            break;
                                        case 6:
                                            pokemonSeleccionado = new Geodude("Geodude", 40, 80, TipoPokemon.TIERRA, Estado.NORMAL);
                                            break;
                                        case 7:
                                            pokemonSeleccionado = new Pidgey("Pidgey", 40, 45, TipoPokemon.VOLADOR, Estado.NORMAL);
                                            break;
                                        case 8:
                                            pokemonSeleccionado = new Jigglypuff("Jigglypuff", 115, 45, TipoPokemon.HADA, Estado.NORMAL);
                                            break;
                                        case 9:
                                            pokemonSeleccionado = new Machop("Machop", 70, 80, TipoPokemon.LUCHA, Estado.NORMAL);
                                            break;
                                        case 10:
                                            pokemonSeleccionado = new Grimer("Grimer", 80, 80, TipoPokemon.VENENO, Estado.NORMAL);
                                            break;
                                        default:
                                            System.out.println("Opción inválida. Por favor, seleccione un Pokémon de la lista.");
                                            break;
                                    }

                                    if (pokemonSeleccionado != null) {
                                        entrenadorSeleccionado.agregarPokemon(pokemonSeleccionado);
                                        System.out.println(pokemonSeleccionado.getNombre() + " agregado al equipo de " + entrenadorSeleccionado.getNombre() + ".");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Equipo de " + entrenadorSeleccionado.getNombre() + ":");
                                    entrenadorSeleccionado.mostrarPokemones();
                                    

                                    System.out.println("Seleccione un Pokémon para entrenar:");
                                    int opcionEntrenar = sc.nextInt();
                                    if (opcionEntrenar >= 1 && opcionEntrenar <= entrenadorSeleccionado.getPokemones().size()) {
                                        Pokemon pokemonEntrenar = entrenadorSeleccionado.getPokemones().get(opcionEntrenar - 1);
                                        pokemonEntrenar.entrenar();
                                        System.out.println("Pokémon " + pokemonEntrenar.getNombre() + " ha sido entrenado.");
                                    } else {
                                        System.out.println("Opción inválida. Por favor, seleccione un Pokémon de su equipo.");
                                    }

                                    break;
                                case 4:
                                    System.out.println("Volviendo al menú de gestionar entrenadores...");
                                    break;
                                default:
                                    System.out.println("Usted ingresó una opción inválida");
                            }
                        } while (opcionEquipo != 4);
                    } else {
                        System.out.println("Entrenador no encontrado.");
                    }

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
        System.out.println("1) Ver todos los pokemones disponibles");
        System.out.println("2) Volver al menú principal");
        opcionPokemones = sc.nextInt();

        switch (opcionPokemones) {
            case 1:
                System.out.println("Pokémons disponibles:");
                System.out.println("1) Charmander");
                System.out.println("2) Squirtle");
                System.out.println("3) Bulbasaur");
                System.out.println("4) Pikachu");
                System.out.println("5) Abra");
                System.out.println("6) Geodude");
                System.out.println("7) Pidgey");
                System.out.println("8) Jigglypuff");
                System.out.println("9) Machop");
                System.out.println("10) Grimer");
                break;
            case 2:
                System.out.println("Volviendo al menú principal...");
                break;
            default:
                System.out.println("Usted ingresó una opción inválida");
                break;
            }
        } while (opcionPokemones != 2);
    }   
    public static void iniciarBatalla(Scanner sc) {
        int opcionBatalla;
        Entrenador entrenador1 = null;
        Entrenador entrenador2 = null;
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
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
                    System.out.println("Ingrese el nombre del primer entrenador:");
                    sc.nextLine(); // Consume el salto de línea
                    String nombreEntrenador1 = sc.nextLine();
                    entrenador1 = buscarEntrenador(nombreEntrenador1);
                    if (entrenador1 == null) {
                        System.out.println("Entrenador no encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del segundo entrenador:");
                    sc.nextLine(); // Consume el salto de línea
                    String nombreEntrenador2 = sc.nextLine();
                    entrenador2 = buscarEntrenador(nombreEntrenador2);
                    if (entrenador2 == null) {
                        System.out.println("Entrenador no encontrado.");
                    }
                    break;
                case 3:
                    if (entrenador1 != null) {
                        System.out.println("Seleccione un Pokémon para el primer entrenador:");
                        entrenador1.mostrarPokemones();
                        int opcionPokemon1 = sc.nextInt();
                        if (opcionPokemon1 >= 1 && opcionPokemon1 <= entrenador1.getPokemones().size()) {
                            pokemon1 = entrenador1.getPokemones().get(opcionPokemon1 - 1);
                            System.out.println("Pokémon " + pokemon1.getNombre() + " seleccionado para el primer entrenador.");
                        } else {
                            System.out.println("Opción inválida. Por favor, seleccione un Pokémon de la lista.");
                        }
                    } else {
                        System.out.println("Primero seleccione al primer entrenador.");
                    }
                    break;
                case 4:
                    if (entrenador2 != null) {
                        System.out.println("Seleccione un Pokémon para el segundo entrenador:");
                        entrenador2.mostrarPokemones();
                        int opcionPokemon2 = sc.nextInt();
                        if (opcionPokemon2 >= 1 && opcionPokemon2 <= entrenador2.getPokemones().size()) {
                            pokemon2 = entrenador2.getPokemones().get(opcionPokemon2 - 1);
                            System.out.println("Pokémon " + pokemon2.getNombre() + " seleccionado para el segundo entrenador.");
                        } else {
                            System.out.println("Opción inválida. Por favor, seleccione un Pokémon de la lista.");
                        }
                    } else {
                        System.out.println("Primero seleccione al segundo entrenador.");
                    }
                    break;
                case 5:
                    if (entrenador1 != null && entrenador2 != null && pokemon1 != null && pokemon2 != null) {
                        Batalla batalla = new Batalla(entrenador1, entrenador2);
                        batalla.iniciarBatalla(pokemon1, pokemon2);
                    } else {
                        System.out.println("Seleccione los entrenadores y sus Pokémon antes de iniciar la batalla.");
                    }
                    break;
                case 6:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Usted ingresó una opción inválida");
            }

        } while (opcionBatalla != 6);
    }

    public static Entrenador buscarEntrenador(String nombre) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equalsIgnoreCase(nombre)) {
                return entrenador;
            }
        }
        return null;
    }

    public static Entrenador seleccionarEntrenador(Scanner sc) {
        System.out.println("Entrenadores disponibles:");
        for (int i = 0; i < entrenadores.size(); i++) {
            System.out.println((i + 1) + ") " + entrenadores.get(i).getNombre());
        }
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= entrenadores.size()) {
            return entrenadores.get(opcion - 1);
        } else {
            System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            return seleccionarEntrenador(sc);
        }
    }

    public static Pokemon seleccionarPokemon(Scanner sc, Entrenador entrenador) {
        System.out.println("Pokémons de " + entrenador.getNombre() + ":");
        entrenador.mostrarPokemones();
        System.out.println("Seleccione un Pokémon:");
        int opcion = sc.nextInt();
        if (opcion >= 1 && opcion <= entrenador.getPokemones().size()) {
            return entrenador.getPokemones().get(opcion - 1);
        } else {
            System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            return seleccionarPokemon(sc, entrenador);
        }
    }
}