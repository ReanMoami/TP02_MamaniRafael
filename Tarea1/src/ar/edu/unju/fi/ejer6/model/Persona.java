package ar.edu.unju.fi.ejer6.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {
    // Atributos privados
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

    // Constructor por defecto
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // Constructor con algunos parámetros
    public Persona (String dni, String nombre, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = "Jujuy"; // Valor por defecto para la provincia
    }

    // Métodos accesores (getters y setters)
    // ...

    // Método para calcular la edad
    public int calcularEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para verificar si es mayor de edad
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }

    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Provincia: " + this.provincia);
        if (this.fechaNacimiento != null) {
        System.out.println("Edad: " + calcularEdad());
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
        } else {
        	System.out.println("Esta vacio, es igual " + this.fechaNacimiento);
        }
    }
}
