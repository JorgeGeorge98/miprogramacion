package ejericiopeticiones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////
		////////////////////////IMPORTANTE//////////////////////////////////
		////////////////////////////////////////////////////////////////////

		/*
		 * EJERCICIO.
		 * Os dan un fichero, que se llama ejercicioPsjs.txt que contiene una serie de datos de los personajes del LoL.
		 * Esos datos son:
		 *
		 * (nombre del personaje):
		 * (attackspeed): (valor)
		 * (title): (valor)
		 * (blurb): (valor)
		 * (roles): (valor)
		 *
		 * En el nombre del personaje aparece el nombre directamente
		 * En el resto de atributos, sale lo que está en paréntesis.
		 * (blurb) es el lore del personaje.
		 * (roles) son los roles donde destaca ese personaje (mago, tanque, support...)
		 *
		 *
		 * Se os pide que:
		 * a) Almacenar todos los datos de los personajes en un Map
		 * b) Una vez almacenados, el usuario debe poder buscar un personaje.
		 * c) Según el personaje que se busque, le aparecerán las opciones de mostrar
		 * 		El título del campeón
		 * 		El lore del campeón
		 * 		Los roles donde el campeón destaca
		 */

		Scanner scan = new Scanner(System.in);
		
		Map<String, ArrayList<String>> personajes= new HashMap<>();
		
		try {
			File fichero = new File("./ejercicioProgramacion/ejercicioPsjs.txt");
			
			if (fichero.createNewFile()) {
				System.out.println("Fichero " + fichero.getName() + " creado en: " + fichero.getCanonicalPath());
			} else {
				System.out.println("Ya existe el archivo");
			}
			
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
			String linea = br.readLine();
			
				while(linea != null) {
					personajes.put(linea, new ArrayList<String>());
					String nomper = linea;
					linea = br.readLine();
					String[] split = linea.split(": ");
					String attspeed = split[1];
					personajes.get(nomper).add (attspeed);
					linea = br.readLine();
					String[] split2 = linea.split(": ");
					String title = split2[1];
					personajes.get(nomper).add (title);
					linea = br.readLine();
					String[] split3 = linea.split(": ");
					String blurb = split3[1];
					personajes.get(nomper).add (blurb);
					linea = br.readLine();
					String[] split4 = linea.split(": ");
					String roles = split4[1];
					personajes.get(nomper).add (roles);
					linea = br.readLine();
			}				

			br.close();
			
			System.out.println("-----BUSCADOR DE PERSONAJES-----\nIntroduzca el nombre del personaje: ");
			String perabuscar = scan.next();
			
			
			for(Entry<String, ArrayList<String>> entry : personajes.entrySet()) {
				String key = entry.getKey();
				ArrayList<String> value = entry.getValue();
				if(key.equals(perabuscar)) {
					System.out.println("Que quieres consultar sobre "+key+" (1)Titulo (2)Lore (3)Roles: ");
					int elec = scan.nextInt();
					
					switch (elec) {
					case 1: 
						System.out.println(value.get(1));
						break;
					case 2:
						System.out.println(value.get(2));
						break;
					case 3:
						System.out.println(value.get(3));
						break;
					default:
						System.out.println("Error");
						break;
					}
				} 
				
			}
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
