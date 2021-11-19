package Flujos_y_Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ejercicio3 {

	public static void main(String[] args) {


		//ESCRIBIR


		try {
			File fichero = new File("./archivos/prueba.txt");

			if (fichero.createNewFile()) {
				System.out.println("File " + fichero.getName() + " created in: " + fichero.getCanonicalPath());
			} else {
				System.out.println("File already exists.");
			}

			FileWriter fw = new FileWriter(fichero);

			Map<String, ArrayList<String>> personajes= new HashMap<>();

			personajes.put("Tracer", new ArrayList<String>());
			personajes.put("Winston", new ArrayList<String>());
			personajes.put("Genji", new ArrayList<String>());

			personajes.get("Tracer").add ("<hab1>Blink</hab1>");
			personajes.get("Tracer").add ("<hab2>Recall</hab2>");
			personajes.get("Tracer").add ("<hab3>Pulse Bomb</hab3>");

			personajes.get("Winston").add ("<hab1>Jump Pack</hab1>");
			personajes.get("Winston").add ("<hab2>Barrier Protection</hab2>");
			personajes.get("Winston").add ("<hab3>Primal Rage</hab3>");

			personajes.get("Genji").add ("<hab1>Deflect</hab1>");
			personajes.get("Genji").add ("<hab2>Swift Strike</hab2>");
			personajes.get("Genji").add ("<hab3>Dragonblade</hab3>");


			fw.write("<?xml version='1' encoding='UTF-8' ?>");
			fw.write(System.lineSeparator()+"\t");
			fw.write("<personajes>");
			for(Entry<String, ArrayList<String>> entry : personajes.entrySet()) {
				String key = entry.getKey();
				ArrayList<String> value = entry.getValue();

				fw.write(System.lineSeparator()+"\t\t");
				fw.write("<"+key+">");
				fw.write("\t");

				for (String element : value) {
					fw.write(System.lineSeparator()+"\t\t\t");
					fw.write(element);
				}
				fw.write(System.lineSeparator()+"\t\t");
				fw.write("</"+key+">");
			}

			fw.write(System.lineSeparator()+"\t");
			fw.write("</personajes>");

			fw.close();

		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

		//LEER

		try {

			File fichero2 = new File("./archivos/prueba.txt");

			if(fichero2.createNewFile()) {
				System.out.println("El fichero se ha creado en: " + fichero2.getPath());
			} else {
				System.out.println("Ya existe el fichero.");
			}

			BufferedReader br = new BufferedReader(new FileReader(fichero2));

			String linea = br.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			br.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}


	}

}
