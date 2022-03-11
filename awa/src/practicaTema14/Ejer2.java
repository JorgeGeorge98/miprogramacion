package practicaTema14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

	public static void ejer2() {
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		try {
			System.out.println("Introduce un valor: ");
			a = scan.nextInt();
			System.out.println("Introduce otro valor: ");
			b = scan.nextInt();
			
			int c = a/b;
			
			System.out.println(c);
			
		} catch (InputMismatchException e) {
			System.out.println("Error, valor no valido");
		} catch (ArithmeticException e) {
			System.out.println("Error, no se puede dividir entre 0");
		}
	}
	
}
