package ar.edu.unju.fi.ejer9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejer9.model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3]; // Array para almacenar tres productos

        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Producto(); // Inicializar cada producto

            // Solicitar datos del producto
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            productos[i].setNombre(scanner.nextLine());
            System.out.println("Ingrese el código del producto " + (i + 1) + ":");
            productos[i].setCodigo(scanner.nextLine());
            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            productos[i].setPrecio(scanner.nextDouble());
            System.out.println("Ingrese el descuento del producto " + (i + 1) + " (entre 0 y 50):");
            productos[i].setDescuento(scanner.nextInt());
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Mostrar datos ingresados y el resultado de calcularDescuento()
            System.out.println("Producto " + (i + 1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.printf("Precio: $%.2f\n", productos[i].getPrecio());
            System.out.println("Descuento: " + productos[i].getDescuento() + "%");
            System.out.printf("Precio con descuento: $%.2f\n", productos[i].calcularDescuento());
            System.out.println();
        }

    }
}
