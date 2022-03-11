package excepcionesYdepuracion;

import java.util.Scanner;

public class Ejer1 {

	public void ejer1() {
		Scanner scan = new Scanner(System.in);
		double num = 0;
		
		while(true) {
			try {
				System.out.println("Introduce un numero: ");
				num = scan.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("Valor invalido, intente de nuevo");
				scan.next();
			}
		}
	}
	
}
