package ar.edu.unju.fi.ejer12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejer12.model.Persona;

public class Main {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        String[] partesFecha = fechaNacimientoStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Restamos 1 porque los meses en Calendar van de 0 a 11
        int año = Integer.parseInt(partesFecha[2]);

        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(año, mes, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);

        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación: " + persona.obtenerEstacion());

        scanner.close();
    }
}