package ar.edu.unju.fi.ejer6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejer6.model.Persona;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Usando el constructor por defecto
        System.out.println("Creando una persona con el constructor por defecto...");
        Persona personaPorDefecto = new Persona();
        // Aquí se podrían establecer los valores usando los setters
        // ...
        personaPorDefecto.mostrarDatos();

        // Usando el constructor parametrizado
        System.out.println("Ingrese DNI, nombre, fecha de nacimiento (dd/MM/yyyy) y provincia para la nueva persona:");
        String dni = scanner.nextLine();
        String nombre = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
        String provincia = scanner.nextLine();
        Persona personaParametrizada = new Persona(dni, nombre, fechaNacimiento, provincia);
        personaParametrizada.mostrarDatos();

        // Usando el constructor con DNI, nombre y fecha de nacimiento
        System.out.println("Ingrese DNI, nombre y fecha de nacimiento (dd/MM/yyyy) para la nueva persona:");
        dni = scanner.nextLine();
        nombre = scanner.nextLine();
        fechaNacimiento = LocalDate.parse(scanner.nextLine(), formatter);
        Persona personaConAlgunosDatos = new Persona(dni, nombre, fechaNacimiento);
        personaConAlgunosDatos.mostrarDatos();
    }
}