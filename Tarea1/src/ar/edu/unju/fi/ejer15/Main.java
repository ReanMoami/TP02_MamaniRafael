package ar.edu.unju.fi.ejer15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int tamaño;
        do {
            System.out.print("Ingrese un número entero en el rango [5,10]: ");
            tamaño = scanner.nextInt();
        } while (tamaño < 5 || tamaño > 10);
        
        scanner.nextLine();
        
        String[] nombres = new String[tamaño];
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre para la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Valores del array:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        System.out.println("Valores del array en orden inverso:");
        for (int i = nombres.length - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
	}

}
