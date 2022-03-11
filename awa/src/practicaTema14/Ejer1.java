package practicaTema14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {
	
	public static void ejer1() {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("Introduce un numero entero: ");
		
		try {
			a = scan.nextInt();
			System.out.println("Valor introducido: "+a);
		} catch (InputMismatchException e) {
			System.out.println("Valor introducido incorrecto");
		}
	}

}
