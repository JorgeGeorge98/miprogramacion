package practicaTema14;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		//Ejercicio 4
		/*
		int s = 1;
		
		while(s != 0) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("Introduce un numero para imprimePositivo()");
				s = scan.nextInt();
				Ejer4.imprimePositivo(s);
				System.out.println("Introduce un numero para imprimeNegativo()");
				s = scan.nextInt();
				Ejer4.imprimeNegativo(s);
			} catch (Exception e) {
				System.out.println("Error: "+e.toString());
			}
		}
		*/
	//-----------------------------------------------------------------------------------//
		
		//Gato
		/*
		try {
			Gato gatillo = new Gato("Gatillo", 3);
			Gato minino = new Gato("Minino", -2);
			Gato garfield = new Gato("Ga", 1);
			
			gatillo.setEdad(-3);
			minino.setEdad(5);
			minino.setNombre("m");
		} catch (Exception e) {
			System.out.println("Error: "+e.toString());
		}
		*/
	//----------------------------------------------------------//
		
		//Gato+
		
		ArrayList<Gato> gatos = new ArrayList<>();
		
		int i = 1;
		
		while(i <= 5) {
			try {
				Scanner scan = new Scanner(System.in);
				
				System.out.println("GATO "+i+"\nIntroduce un nombre: ");
				String nombre = scan.nextLine();
				System.out.println("Introduce una edad: ");
				int edad = scan.nextInt();
				
				Gato gato = new Gato(nombre, edad);
				
				gatos.add(gato);
				
				i++;
			} catch (Exception e) {
				System.out.println("Error: "+e.toString());
			}
		}
		
		for (Gato g : gatos) {
			g.imprimir();
		}
		
	}

}
