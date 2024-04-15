package ar.edu.unju.fi.ejer3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Ingrese un número: "); 
		int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número es par.  " + (numero * 3));
        } else {
            System.out.println("El número es impar. " + (numero * 2));
	}

}
