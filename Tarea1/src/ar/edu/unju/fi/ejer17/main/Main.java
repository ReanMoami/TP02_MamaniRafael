package ar.edu.unju.fi.ejer17.main;

import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;
import ar.edu.unju.fi.ejer17.model.Jugador;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 – Alta de jugador");
            System.out.println("2 – Mostrar los datos del jugador");
            System.out.println("3 – Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 – Modificar los datos de un jugador");
            System.out.println("5 – Eliminar un jugador");
            System.out.println("6 – Mostrar la cantidad total de jugadores");
            System.out.println("7 – Mostrar la cantidad de jugadores por nacionalidad");
            System.out.println("8 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	try {
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        System.out.print("Ingrese el nombre del jugador: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el apellido del jugador: ");
                        String apellido = scanner.nextLine();
                        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
                        String fechaNacimientoStr = scanner.nextLine();
                        String[] partesFecha = fechaNacimientoStr.split("/");
                        int dia = Integer.parseInt(partesFecha[0]);
                        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restamos 1 porque los meses en Calendar van de 0 a 11
                        int año = Integer.parseInt(partesFecha[2]);
                        Calendar fechaNacimiento = Calendar.getInstance();
                        fechaNacimiento.set(año, mes, dia);
                        System.out.print("Ingrese la nacionalidad: ");
                        String nacionalidad = scanner.nextLine();
                        System.out.print("Ingrese la estatura (en metros): ");
                        double estatura = scanner.nextDouble();
                        System.out.print("Ingrese el peso (en kilogramos): ");
                        double peso = scanner.nextDouble();
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        System.out.print("Ingrese la posición (delantero, medio, defensa, arquero): ");
                        String posicion = scanner.nextLine();

                        Jugador nuevoJugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
                        jugadores.add(nuevoJugador);
                        System.out.println("Jugador agregado exitosamente.");
                    } catch (DateTimeParseException e) {
                        System.out.println("Error: La fecha de nacimiento no tiene el formato correcto.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Se esperaba un número.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al agregar el jugador.");
                    }
                    break;
                case 2:
                	try {
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del jugador: ");
                        String nombreBuscado = scanner.nextLine();
                        System.out.print("Ingrese el apellido del jugador: ");
                        String apellidoBuscado = scanner.nextLine();

                        boolean encontrado = false;
                        for (Jugador jugador : jugadores) {
                            if (jugador.getNombre().equalsIgnoreCase(nombreBuscado) && jugador.getApellido().equalsIgnoreCase(apellidoBuscado)) {
                                System.out.println("Datos del jugador:");
                                System.out.println("Nombre: " + jugador.getNombre());
                                System.out.println("Apellido: " + jugador.getApellido());
                                System.out.println("Fecha de Nacimiento: " + jugador.getFechaNacimiento());
                                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                                System.out.println("Estatura: " + jugador.getEstatura() + " m");
                                System.out.println("Peso: " + jugador.getPeso() + " kg");
                                System.out.println("Posición: " + jugador.getPosicion());
                                System.out.println("Edad: " + jugador.calcularEdad() + " años");
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Jugador no encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al buscar los datos del jugador.");
                    }
                    break;
                case 3:
                    jugadores.stream()
                             .sorted(Comparator.comparing(Jugador::getApellido))
                             .forEach(jugador -> System.out.println(jugador.getApellido() + ", " +
                                                                    jugador.getNombre() + " - " +
                                                                    jugador.getPosicion()));
                break;
                case 4:
                    try {
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        System.out.print("Ingrese el nombre del jugador a modificar: ");
                        String nombreModificar = scanner.nextLine();
                        System.out.print("Ingrese el apellido del jugador a modificar: ");
                        String apellidoModificar = scanner.nextLine();

                        Jugador jugadorAModificar = null;
                        for (Jugador jugador : jugadores) {
                            if (jugador.getNombre().equalsIgnoreCase(nombreModificar) && jugador.getApellido().equalsIgnoreCase(apellidoModificar)) {
                                jugadorAModificar = jugador;
                                break;
                            }
                        }

                        if (jugadorAModificar != null) {
                            System.out.print("Ingrese el nuevo nombre del jugador (dejar en blanco para no modificar): ");
                            String nuevoNombre = scanner.nextLine();
                            if (!nuevoNombre.isEmpty()) {
                                jugadorAModificar.setNombre(nuevoNombre);
                            }

                            System.out.print("Ingrese el nuevo apellido del jugador (dejar en blanco para no modificar): ");
                            String nuevoApellido = scanner.nextLine();
                            if (!nuevoApellido.isEmpty()) {
                                jugadorAModificar.setApellido(nuevoApellido);
                            }

                            // Repetir para cada atributo que se desee modificar...
                            
                            System.out.println("Los datos del jugador han sido actualizados.");
                        } else {
                            System.out.println("Jugador no encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al modificar los datos del jugador.");
                    }
                break;
                case 5:
                    try {
                        scanner.nextLine(); // Limpiar el buffer del scanner
                        System.out.print("Ingrese el nombre del jugador a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        System.out.print("Ingrese el apellido del jugador a eliminar: ");
                        String apellidoEliminar = scanner.nextLine();

                        Iterator<Jugador> iterator = jugadores.iterator();
                        boolean eliminado = false;
                        while (iterator.hasNext()) {
                            Jugador jugador = iterator.next();
                            if (jugador.getNombre().equalsIgnoreCase(nombreEliminar) && jugador.getApellido().equalsIgnoreCase(apellidoEliminar)) {
                                iterator.remove();
                                eliminado = true;
                                System.out.println("El jugador ha sido eliminado exitosamente.");
                                break;
                            }
                        }

                        if (!eliminado) {
                            System.out.println("Jugador no encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ocurrió un error al eliminar el jugador.");
                    }
                break;
                case 6:
                    System.out.println("La cantidad total de jugadores es: " + jugadores.size());
                break;
                case 7:
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese la nacionalidad para contar los jugadores: ");
                    String nacionalidadBuscada = scanner.nextLine();
                    long conteo = jugadores.stream()
                                           .filter(jugador -> jugador.getNacionalidad().equalsIgnoreCase(nacionalidadBuscada))
                                           .count();

                    System.out.println("La cantidad de jugadores de nacionalidad " + nacionalidadBuscada + " es: " + conteo);
                break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);
    }
}
