package ar.edu.unju.fi.ejer18.main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejer18.model.DestinoTuristico;
import ar.edu.unju.fi.ejer18.model.Pais;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        paises.add(new Pais("PAIS01", "Argentina"));

        do {
            System.out.println("1 – Alta de destino turístico");
            System.out.println("2 – Mostrar todos los destinos turísticos");
            System.out.println("3 – Modificar el país de un destino turístico");
            System.out.println("4 – Limpiar el ArrayList de destino turísticos");
            System.out.println("5 – Eliminar un destino turístico");
            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 – Mostrar todos los países");
            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	try {
                        scanner.nextLine();
                        System.out.print("Ingrese el código del destino turístico: ");
                        String codigoDestino = scanner.nextLine();
                        System.out.print("Ingrese el nombre del destino turístico: ");
                        String nombreDestino = scanner.nextLine();
                        System.out.print("Ingrese el precio del destino turístico: ");
                        double precioDestino = scanner.nextDouble();
                        System.out.print("Ingrese el código del país: ");
                        String codigoPais = scanner.next();
                        System.out.print("Ingrese la cantidad de días del destino turístico: ");
                        int cantidadDias = scanner.nextInt();

                        Pais paisAsociado = null;
                        for (Pais pais : paises) {
                            if (pais.getCodigo().equals(codigoPais)) {
                                paisAsociado = pais;
                                break;
                            }
                        }

                        if (paisAsociado != null) {
                            DestinoTuristico nuevoDestino = new DestinoTuristico(codigoDestino, nombreDestino, precioDestino, paisAsociado, cantidadDias);
                            destinos.add(nuevoDestino);
                            System.out.println("Destino turístico agregado exitosamente.");
                        } else {
                            System.out.println("El código del país no es válido.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Se ha introducido un tipo de dato incorrecto.");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error al intentar agregar el destino turístico.");
                    }
                break;
                case 2:
                	if (destinos.isEmpty()) {
                        System.out.println("No hay destinos turísticos para mostrar.");
                    } else {
                        for (DestinoTuristico destino : destinos) {
                            System.out.println("Código: " + destino.getCodigo());
                            System.out.println("Nombre: " + destino.getNombre());
                            System.out.println("Precio: " + destino.getPrecio());
                            System.out.println("País: " + destino.getPais().getNombre());
                            System.out.println("Cantidad de días: " + destino.getCantidadDias());
                            System.out.println("-----------------------------------");
                        }
                    }
                break;
                case 3:
                    try {
                        scanner.nextLine(); // Limpiar el buffer de entrada
                        System.out.print("Ingrese el código del destino turístico que desea modificar: ");
                        String codigoDestino = scanner.nextLine();

                        // Buscar el destino turístico con el código ingresado
                        DestinoTuristico destinoModificado = null;
                        for (DestinoTuristico destino : destinos) {
                            if (destino.getCodigo().equals(codigoDestino)) {
                                destinoModificado = destino;
                                break;
                            }
                        }

                        if (destinoModificado != null) {
                            System.out.print("Ingrese el nuevo código de país para el destino turístico: ");
                            String nuevoCodigoPais = scanner.nextLine();
                            Pais nuevoPais = null;
                            for (Pais pais : paises) {
                                if (pais.getCodigo().equals(nuevoCodigoPais)) {
                                    nuevoPais = pais;
                                    break;
                                }
                            }

                            if (nuevoPais != null) {
                                destinoModificado.setPais(nuevoPais);
                                System.out.println("El país del destino turístico ha sido modificado exitosamente.");
                            } else {
                                System.out.println("El código del país no es válido.");
                            }
                        } else {
                            System.out.println("El código del destino turístico no es válido.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error al intentar modificar el país del destino turístico.");
                    }
                break;
                case 4:
                    destinos.clear();
                    System.out.println("Se han eliminado todos los destinos turísticos.");
                break;    
                case 5:
                    try {
                        scanner.nextLine();
                        System.out.print("Ingrese el código del destino turístico que desea eliminar: ");
                        String codigoDestino = scanner.nextLine();

                        Iterator<DestinoTuristico> iterator = destinos.iterator();
                        boolean eliminado = false;
                        while (iterator.hasNext()) {
                            DestinoTuristico destino = iterator.next();
                            if (destino.getCodigo().equals(codigoDestino)) {
                                iterator.remove();
                                eliminado = true;
                                System.out.println("Destino turístico eliminado exitosamente.");
                                break;
                            }
                        }

                        if (!eliminado) {
                            System.out.println("No se encontró un destino turístico con el código proporcionado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Ha ocurrido un error al intentar eliminar el destino turístico.");
                    }
                break;
                case 6:
                    destinos.sort((DestinoTuristico d1, DestinoTuristico d2) -> d1.getNombre().compareTo(d2.getNombre()));

                    destinos.forEach((destino) -> {
                        System.out.println("Código: " + destino.getCodigo());
                        System.out.println("Nombre: " + destino.getNombre());
                        System.out.println("Precio: " + destino.getPrecio());
                        System.out.println("País: " + destino.getPais().getNombre());
                        System.out.println("Cantidad de días: " + destino.getCantidadDias());
                        System.out.println("-----------------------------------");
                    });
                break;
                case 7:
                    if (paises.isEmpty()) {
                        System.out.println("No hay países para mostrar.");
                    } else {
                        for (Pais pais : paises) {
                            System.out.println("Código: " + pais.getCodigo());
                            System.out.println("Nombre: " + pais.getNombre());
                            System.out.println("-----------------------------------");
                        }
                    }
                break;
                case 8:
                    scanner.nextLine();
                    System.out.print("Ingrese el código del país para mostrar sus destinos turísticos: ");
                    String codigoPais = scanner.nextLine();
                    boolean encontrado = false;

                    for (DestinoTuristico destino : destinos) {
                        if (destino.getPais().getCodigo().equals(codigoPais)) {
                            encontrado = true;
                            System.out.println("Código: " + destino.getCodigo());
                            System.out.println("Nombre: " + destino.getNombre());
                            System.out.println("Precio: " + destino.getPrecio());
                            System.out.println("País: " + destino.getPais().getNombre());
                            System.out.println("Cantidad de días: " + destino.getCantidadDias());
                            System.out.println("-----------------------------------");
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No hay destinos turísticos para el código de país ingresado.");
                    }
                break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 9);

	}

}
