package ar.edu.unju.fi.ejer7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejer7.model.Empleado;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el legajo del empleado:");
        int legajo = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        // Crear el objeto empleado con el constructor parametrizado
        Empleado empleado = new Empleado(nombre, legajo, salario);

        // Mostrar datos del empleado
        empleado.mostrarDatos();

        // Dar aumento y mostrar datos actualizados
        empleado.darAumento();
        System.out.println("Después del aumento:");
        empleado.mostrarDatos();

        scanner.close();
    }
}