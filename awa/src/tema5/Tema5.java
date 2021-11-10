package tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tema5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Elija el Ejercicio (2) o (3): ");
		
		int eleccion = scan.nextInt();
		
		switch (eleccion) {
		case 2: {
			eje2();
			break;
		} 
		case 3: {
			eje3();
			break;
		}
		default:
			System.out.println("Error");
		}
		
		
	}
		/*
		 * Ejercicio 1. 
		 * ¿Arraylist Set o Maps?
		 * ¿En qué situaciones es mejor utilizar una colección con respecto a otra?
		 * 
		 * Arraylist: Para acceder a elementos usando su index frecuentemente y para mantener los elemtos en el orden en el que han sido insertados.
		 * 
		 * Set: Para cualquier ocasion donde se desee crear una coleccion de elementos unicos.
		 * 
		 * Maps: Para guardar datos en forma de clave-elemento como una tabla en una base de datos se usara un tipo de coleccion Maps.
		 */
		
		/*
		 * Ejercicio 2.
		 * Implementar un sistema que almacene los números de pedido de vuestra tienda de barrio.
		 * 
		 * Hacen un pedido a la tienda (por teclado) y se almacena el pedido con un numero de referencia y un valor
		 * 
		 * Por último, tiene que poder consultar los números de referencia asociados un valor en concreto.
		 */
		
	
	public static void eje2(){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEJERCICIO 2");
		scan.nextLine();
		
		Map<Integer, String> pedido= new HashMap<Integer, String>();
		
		System.out.println("---TIENDA DE ELECTRONICA PEPE---");
		System.out.println("\n(1) PC Pre-Build\n(2) Tablet\n(3) Smartphone\nPresione 0 para salir.");
		int elec = scan.nextInt();
		
		int numref1=0;
		int numref2=0;
		int numref3=0;
		
		while(elec > 0) {
			switch (elec) {
			case 1:
				pedido.put(numref1, "PC");
				numref1++;
				break;
			case 2:
				pedido.put(numref2, "Tablet");
				numref2++;
				break;
			case 3:
				pedido.put(numref3, "Smartphone");
				numref3++;
				break;
			default:
				System.out.println("Erorr");
			}
		}
		System.out.println("Gracias por su visita :)");
		scan.nextLine();
		
		System.out.println("Buscador de Numeros de Referencia");
		scan.nextLine();
		
		System.out.println("Que quiere buscar (1), (2) o (3): ");
		int elec2 = scan.nextInt();
		
		switch (elec2) {
		case 1:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="PC") {
					System.out.println(entry.getKey()+"\n");
				}
			}
		break;		
		case 2:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="Tablet") {
					System.out.println(entry.getKey()+"\n");
					}
				}
			break;
		case 3:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="Smartphone") {
					System.out.println(entry.getKey()+"\n");
				}
			}
		break;
		}
		}
	
		
		
		
		
		/*
		 * Ejercicio 3.
		 * Se tiene que implementar un programa que almacene todas las calles de un apartado postal
		 * "Una clave con muchos valores"
		 */
	
	public static void eje3() {
		
	}
}




