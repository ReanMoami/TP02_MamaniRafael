package ar.edu.unju.fi.ejer8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejer8.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraEspecial calculadora = new CalculadoraEspecial();

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        calculadora.setN(n);

        System.out.println("El resultado de la sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("El resultado de la productoria es: " + calculadora.calcularProductoria());

        scanner.close();
    }
}