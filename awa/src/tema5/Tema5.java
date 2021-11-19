package tema5;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Tema5 {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);

		System.out.println("Elija el Ejercicio (2) (3): ");

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
			break;
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

		Map<Integer, String> pedido= new HashMap<>();

		System.out.println("---TIENDA DE ELECTRONICA PEPE---");
		System.out.println("\n(1) PC Pre-Build\n(2) Tablet\n(3) Smartphone\nPresione 0 para salir.");
		int elec = scan.nextInt();

		int numref1=0;
		int numref2=0;
		int numref3=0;

		while (elec>0 && elec<=3) {
			switch(elec) {
			case 1:
				System.out.println("Has seleccionado PC PRE-BUILD");
				numref1++;
				pedido.put(numref1, "PC");
				System.out.println("\n---TIENDA DE ELECTRONICA PEPE---");
				System.out.println("\n(1) PC Pre-Build\n(2) Tablet\n(3) Smartphone\nPresione 0 para salir.");
				elec = scan.nextInt();
				break;
			case 2:
				System.out.println("Has seleccionado Tablet");
				numref2++;
				pedido.put(numref2,"Tablet");
				System.out.println("---TIENDA DE ELECTRONICA PEPE---");
				System.out.println("\n(1) PC Pre-Build\n(2) Tablet\n(3) Smartphone\nPresione 0 para salir.");
				elec = scan.nextInt();
				break;
			case 3:
				System.out.println("Has seleccionado Smartphone");
				numref3++;
				pedido.put(numref3, "Smartphone");
				System.out.println("---TIENDA DE ELECTRONICA PEPE---");
				System.out.println("\n(1) PC Pre-Build\n(2) Tablet\n(3) Smartphone\nPresione 0 para salir.");
				elec=scan.nextInt();
				break;
			}
		}

		System.out.println("Gracias por su visita :)");
		scan.nextLine();

		System.out.println("\nBUSCADOR DE NUMEROS DE REFERENCIA");
		System.out.println("Que quiere buscar (1), (2) o (3): ");
		int elec2 = scan.nextInt();

		switch (elec2) {
		case 1:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="PC") {
					System.out.println("Numero de referencia:");
					System.out.println(entry.getKey()+ " PC\n");
				}
			}
		break;
		case 2:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="Tablet") {
					System.out.println("Numero de referencia: ");
					System.out.println(entry.getKey()+" Tablet\n");
					}
				}
			break;
		case 3:
			for(Entry<Integer, String> entry: pedido.entrySet()) {
				if(entry.getValue()=="Smartphone") {
					System.out.println("Numero de referencia: ");
					System.out.println(entry.getKey()+ " Smartphone\n");
				}
			}
		break;
		default:
			System.out.println("Error");
			break;
		}
		}
		/*
		 * Ejercicio 3.
		 * Se tiene que implementar un programa que almacene todas las calles de un apartado postal
		 * "Una clave con muchos valores"
		 */

	public static void eje3() throws Exception {

		Scanner scan = new Scanner (System.in);

		System.out.println("\nEJERCICIO 3");
		scan.nextLine();


		System.out.println("Decida que quiere hacer:\n(1)Almacenar datos (2)Consultar datos (0)Salir");
		int eleccion = scan.nextInt();
		ArrayList<String> al1 = new ArrayList<>();
		Map<Integer, ArrayList<String>> codcalles= new HashMap<>();
		String str;

		while(eleccion>0) {
			switch(eleccion) {
				case 1:
					int check = 1;
					System.out.println("ALMACENAR DATOS");
					while (check != 0) {
						System.out.print("Introduzca una calle:");
						str = scan.next();
						al1.add(str);
						System.out.println("Si quiere parar presione 0, presione 1 para continuar: ");
						check = scan.nextInt();
					}

					System.out.println("Introduzca el codigo postal: ");
					int codpos = scan.nextInt();
					codcalles.put(codpos, al1);
					System.out.println("Que quiere hacer ahora: (1)Almacenar mas datos (2)Consultar datos (0)Salir");
					eleccion=scan.nextInt();
					break;

				case 2:
					System.out.println("CONSULTAR DATOS");
					System.out.println("Introduzca el codigo postal a consultar: ");
					codpos=scan.nextInt();
					for (Entry<Integer, ArrayList<String>> entry : codcalles.entrySet()) {
				        int key = entry.getKey();
				        ArrayList<String> value = entry.getValue();
				        System.out.println(key + " " + value);

				        //POI
				        XWPFDocument doc = new XWPFDocument();

						FileOutputStream out = new FileOutputStream(new File("poi.docx"));

						XWPFParagraph parrafo = doc.createParagraph();

						XWPFRun run = parrafo.createRun();
						run.setText(key + " " + value);
						doc.write(out);
						out.close();
						System.out.println("-documento creado-");
						//FIN DEL POI

				    System.out.println("Que quiere hacer ahora: (1)Almacenar mas datos (2)Consultar datos (0)Salir");
				    eleccion=scan.nextInt();
				    break;



			}
		}
		}
	}
}