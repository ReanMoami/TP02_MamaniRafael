package ar.edu.unju.fi.ejer13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice " + i + ": Valor " + array[i]);
        }
	}

}
