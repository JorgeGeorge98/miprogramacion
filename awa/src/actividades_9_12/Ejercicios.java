package actividades_9_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el numero del ejercicio: ");
		int ejercicio = scan.nextInt();
		
		switch(ejercicio) {
		
		case 1:
			eje1();
			break;
		case 2:
			eje2();
			break;
		case 3:
			int[] arr= new int[5];
			for (int i=0; i<arr.length; i++) {
				System.out.println("Introduzca un numero: ");
				arr[i] = scan.nextInt();
			}
			eje3(arr);
			break;
		default:
			System.out.println("Error");
			break;
		}
		

	}

	//EJERCICIO 1
	public static void eje1() {
		
		System.out.println("---EJERCICIO 1---\n");
		
		ArrayList<String> palabras = new ArrayList<String>();
		
		palabras.add("hola");
		palabras.add("adios");
		palabras.add("uwu");
		palabras.add("pollo_asado");
		palabras.add("lulxd");
		palabras.add("supercalifragilisticoespialidoso");
		palabras.add("foñite");
		palabras.add("lmao");
		palabras.add("neun");
		palabras.add("zehn");
		
		for(int i=0; i<palabras.size(); i++) {
	
			int strtamano = palabras.get(i).length();
			
			if(strtamano>6) {
				System.out.println("La palabra "+ palabras.get(i) + " tiene una longitud mayor de 6.");
			} else {
				System.out.println("La posicion "+ i +" contiene la palabra "+ palabras.get(i));
			}
			
		}
	}
	
	//EJERCICIO 2
	public static void eje2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 2---\n");
		
		System.out.println("Introduzca una palabra: ");
		String str = scan.next();
		
		int i = 0;
		int j = str.length() - 1;
		
		while (i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				System.out.println("NO ES PALINDROMO");
				return;
			}
			
			i++;
			j--;
		}
		
		System.out.println("ES PALINDROMO!");
	}
	
	//EJERCICIO 3
	public static void eje3(int[] arr) {
		
		int numsnecesarios = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int aux = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=aux;
				}
			}
		}
		
		System.out.println("\n"+ Arrays.toString(arr) +"\n");
	
		for (int i=0; i<arr.length-1; i++) {
			while(arr[i+1] != arr[i] + 1) {
				int diferencia = (arr[i+1]-arr[i])-1;
					numsnecesarios+=diferencia;
					for(int j=1; j<=diferencia; j++) {
						numeros.add(arr[i]+j);
					}
			break;
			}
		}
		
		System.out.println("Minimo de numeros necesarios: "+ numsnecesarios +"\n"+ Arrays.toString(numeros.toArray()));

	}
}