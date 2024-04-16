package ar.edu.unju.fi.ejer5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 1 y 9: ");
        int numero = valor.nextInt();
        if (numero < 1 || numero > 9) {
            System.out.println("El número debe estar entre 1 y 9.");
        } else {
            System.out.println("Tabla de multiplicar del número "  + numero + ":");
            for (int i = 0; i <= 10; i++) {
                System.out.println(numero  + " x " + i + " = "  +  (numero * i));
            }
        }
	}

}
