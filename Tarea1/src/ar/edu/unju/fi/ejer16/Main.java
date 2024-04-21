package ar.edu.unju.fi.ejer16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int indice;
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona para la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }
        int i = 0;
        while (i < nombres.length) {
            System.out.println("Posición " + i + ": " + nombres[i]);
            i++;
        }
        System.out.println("El tamaño del array es: " + nombres.length);
        do {
            System.out.print("Ingrese un índice del elemento a eliminar (0-4): ");
            indice = scanner.nextByte();
        } while (indice < 0 || indice >= nombres.length);
        for (int j = indice; j < nombres.length - 1; j++) {
            nombres[j] = nombres[j + 1];
        }
        nombres[nombres.length - 1] = "";
        System.out.println("Array después de eliminar el elemento:");
        System.out.print("| ");
        for (int k = 0; k < nombres.length; k++) {
            System.out.print(nombres[k] + " | ");
        }
	}

}
