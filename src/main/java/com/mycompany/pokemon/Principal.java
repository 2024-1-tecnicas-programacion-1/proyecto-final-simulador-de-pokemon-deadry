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
                                    for (int i = 0; i < pokemones.size(); i++) {
                                        System.out.println((i + 1) + ") " + pokemones.get(i).getNombre());
                                    }

                                    System.out.println("Seleccione un Pokémon para agregar al equipo:");
                                    for (int i = 0; i < pokemones.size(); i++) {
                                    System.out.println((i + 1) + ") " + pokemones.get(i).getNombre());
                                    }
                                    
                                    int opcionPokemon = sc.nextInt();
                                    if (opcionPokemon >= 1 && opcionPokemon <= pokemones.size()) {
                                        Pokemon pokemonSeleccionado = pokemones.get(opcionPokemon - 1);
                                        entrenadorSeleccionado.agregarPokemon(pokemonSeleccionado);
                                        System.out.println("Pokémon " + pokemonSeleccionado.getNombre() + " agregado al equipo de " + entrenadorSeleccionado.getNombre());
                                    } else {
                                        System.out.println("Opción inválida. Por favor, seleccione un Pokémon de la lista.");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Equipo de " + entrenadorSeleccionado.getNombre() + ":");
                                    entrenadorSeleccionado.mostrarPokemones();

                                    // Seleccionar un Pokémon para entrenar
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
                    sc.nextLine();
                    String nombrePokemon = sc.nextLine();

                    System.out.print("Ingrese la salud del pokémon: ");
                    int salud = sc.nextInt();

                    System.out.print("Ingrese los puntos de ataque del pokémon: ");
                    int puntosDeAtaque = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Tipo de Pokémon (1- Psíquico, 2- Agua, 3- Fuego, 4- Planta, 5- Eléctrico, 6- Hada, 7- Lucha, 8- Tierra, 9- Veneno, 10- Volador): ");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Estado del Pokémon (1) Normal, (2) Debilitado): ");
                    int estadoSeleccionado = sc.nextInt();
                    sc.nextLine();
                    Estado estado;
                    if (estadoSeleccionado == 1) {
                        estado = Estado.NORMAL;
                    } else {
                        estado = Estado.DEBILITADO;
                    }

                    TipoPokemon tipoPokemon;
                    Pokemon nuevoPokemon = null;
                    switch (tipo) {
                        case 1:
                            tipoPokemon = TipoPokemon.PSIQUICO;
                            nuevoPokemon = new Psiquico(nombrePokemon, salud, puntosDeAtaque, tipoPokemon, estado);
                            break;
                        case 2:
                            tipoPokemon = TipoPokemon.AGUA;
                            nuevoPokemon = new Agua(nombrePokemon, salud, puntosDeAtaque, tipoPokemon, estado);
                            break;
                        case 3:
                            tipoPokemon = TipoPokemon.FUEGO;
                            nuevoPokemon = new Fuego(nombrePokemon, salud, puntosDeAtaque, tipoPokemon, estado);
                            break;
                        case 4:
                            tipoPokemon = TipoPokemon.Planta;
                            nuevoPokemon = new planta(nombrePokemon, salud, puntosDeAtaque, tipoPokemon, estado);
                            break;
                        case 5:
                            tipoPokemon = TipoPokemon.ELECTRICO;
                            nuevoPokemon = new Electrico(nombrePokemon, salud, puntosDeAtaque, tipoPokemon, estado);
                            break;
                        default:
                            System.out.println("Tipo de Pokémon inválido.");
                    }

                    if (nuevoPokemon != null) {
                        pokemones.add(nuevoPokemon);
                        System.out.println("Pokémon registrado exitosamente.");
                    }
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
                    System.out.println("Elegir entrenador 1:");
                    entrenador1 = seleccionarEntrenador(sc);
                    break;
                case 2:
                    System.out.println("Elegir entrenador 2:");
                    entrenador2 = seleccionarEntrenador(sc);
                    break;
                case 3:
                    if (entrenador1 != null) {
                        System.out.println("Seleccionar Pokémon de entrenador 1:");
                        pokemon1 = seleccionarPokemon(sc, entrenador1);
                    } else {
                        System.out.println("Primero elija entrenador 1.");
                    }
                    break;
                case 4:
                    if (entrenador2 != null) {
                        System.out.println("Seleccionar Pokémon de entrenador 2:");
                        pokemon2 = seleccionarPokemon(sc, entrenador2);
                    } else {
                        System.out.println("Primero elija entrenador 2.");
                    }
                    break;
                case 5:
                    if (pokemon1 != null && pokemon2 != null) {
                        System.out.println(pokemon1.getNombre() + " vs. " + pokemon2.getNombre());
                        gestionarBatalla(sc, pokemon1, pokemon2);
                    } else {
                        System.out.println("Debe seleccionar un Pokémon para cada entrenador antes de comenzar la batalla.");
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

    public static void gestionarBatalla(Scanner sc, Pokemon pokemon1, Pokemon pokemon2) {
        int opcionAccion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1) [Pokémon 1] Atacar");
            System.out.println("2) [Pokémon 2] Atacar");
            System.out.println("3) Finalizar la batalla");
            opcionAccion = sc.nextInt();

            switch (opcionAccion) {
                case 1:
                    System.out.println("[Pokémon 1] ataca");
                    if (pokemon1.getEstado() == Estado.NORMAL) {
                        int danio1 = pokemon1.getPuntosDeAtaque();
                        pokemon2.recibirDaño(danio1);
                        System.out.println(pokemon1.getNombre() + " ataca a " + pokemon2.getNombre() + " y causa " + danio1 + " de daño.");
                        if (pokemon2.getEstado() == Estado.DEBILITADO) {
                            System.out.println(pokemon2.getNombre() + " ha sido debilitado. Salud restante: " + pokemon2.getSalud());
                        } else {
                            System.out.println(pokemon2.getNombre() + " tiene " + pokemon2.getSalud() + " de salud restante.");
                        }
                    } else {
                        System.out.println(pokemon1.getNombre() + " no puede atacar porque está en estado " + pokemon1.getEstado());
                    }
                    break;
                case 2:

                    System.out.println("[Pokémon 2] ataca");
                    if (pokemon2.getEstado() == Estado.NORMAL) {
                        int danio1 = pokemon1.getPuntosDeAtaque();
                        pokemon1.recibirDaño(danio1);
                        System.out.println(pokemon2.getNombre() + " ataca a " + pokemon1.getNombre() + " y causa " + danio1 + " de daño.");
                        if (pokemon1.getEstado() == Estado.DEBILITADO) {
                            System.out.println(pokemon2.getNombre() + " ha sido debilitado. Salud restante: " + pokemon1.getSalud());
                        } else {
                            System.out.println(pokemon2.getNombre() + " tiene " + pokemon1.getSalud() + " de salud restante.");
                        }
                    } else {
                        System.out.println(pokemon2.getNombre() + " no puede atacar porque está en estado " + pokemon2.getEstado());
                    }
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
