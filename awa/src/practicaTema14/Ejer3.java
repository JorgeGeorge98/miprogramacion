package practicaTema14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {

	static double[] arr = new double[5];
	
	public static void ejer3() {
		
		int i = 0;
		
		while(i < arr.length) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce un numero: ");
				arr[i] = scan.nextDouble();
				i++;
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Error, ha salido de los limites del array.");
			} catch (InputMismatchException e) {
				System.out.println("Error, valor no valido, intente de nuevo.");
			}	
		}
		
		for (double d : arr) {
			System.out.println(d);
		}
	}
}
