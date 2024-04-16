package ar.edu.unju.fi.ejer10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejer10.model.Pizza;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[3]; // Array para almacenar tres pizzas

        for (int i = 0; i < pizzas.length; i++) {
            pizzas[i] = new Pizza(); // Inicializar cada pizza

            // Solicitar datos de la pizza
            System.out.println("Ingrese el diámetro de la pizza " + (i + 1) + " (20, 30, 40):");
            pizzas[i].setDiametro(scanner.nextInt());
            System.out.println("¿La pizza " + (i + 1) + " tiene ingredientes especiales? (true o false):");
            pizzas[i].setIngredientesEspeciales(scanner.nextBoolean());

            // Calcular precio y área
            pizzas[i].calcularPrecio();
            pizzas[i].calcularArea();

            // Mostrar datos de la pizza
            System.out.println("** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizzas[i].getDiametro());
            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
            System.out.printf("Precio Pizza = $%.2f\n", pizzas[i].getPrecio());
            System.out.printf("Área de la pizza = %.12f\n", pizzas[i].getArea());
            System.out.println();
        }

        scanner.close();
    }
}
