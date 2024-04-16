package ar.edu.unju.fi.ejer4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un número entero entre 0 y 10 para calcular su factorial: ");
        int numero = valor.nextInt();


        if (numero < 0 || numero > 10) {
            System.out.println("El número debe estar en el rango de 0 a 10.");
        } else {
            int factorial = 1;
            int i = numero;
            while (i > 1) {
                factorial *= i;
                i--; 
            }
            if (numero==1) {
            	factorial=0;
            }
            if (numero==0) {
            	factorial=1;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
	}

}
