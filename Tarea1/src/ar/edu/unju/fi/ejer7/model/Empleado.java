package ar.edu.unju.fi.ejer7.model;

public class Empleado {
    // Atributos privados
    private String nombre;
    private int legajo;
    private double salario;

    // Constantes
    private static final double SALARIO_MINIMO = 210000.00;
    private static final double AUMENTO_POR_MERITOS = 20000.00;

    // Constructor parametrizado
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.salario = salario >= SALARIO_MINIMO ? salario : SALARIO_MINIMO;
    }

    // Método para mostrar datos del empleado
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.printf("Salario $: %.2f\n", salario);
    }

    // Método para dar aumento por méritos
    public void darAumento() {
        salario += AUMENTO_POR_MERITOS;
    }
}