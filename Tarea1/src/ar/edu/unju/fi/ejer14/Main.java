package ar.edu.unju.fi.ejer14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Ingrese un número entero en el rango [3,10]: ");
            size = scanner.nextInt();
        } while (size < 3 || size > 10);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número entero para la posición " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": Valor " + array[i]);
            suma += array[i];
        }

        System.out.println("La suma de todos los valores es: " + suma);
	}

}
