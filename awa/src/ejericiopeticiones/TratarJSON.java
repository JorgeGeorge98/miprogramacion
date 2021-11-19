package ejericiopeticiones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONObject;

public class TratarJSON {



	/**
	 * Metodo que realiza una peticion HTTP relativa a obtener todos los personajes del LOL
	 * junto con varias características
	 * @param ruta (String. Ruta donde queremos persistir los datos obtenidos de esa petición HTTP)
	 */
	public static void obtenerPersonajes(String ruta) {
		Peticiones pet = new Peticiones();
		String peticion = "http://ddragon.leagueoflegends.com/cdn/11.23.1/data/en_US/champion.json";

		try {
			Peticiones.realizarPetGet(peticion, ruta);
		} catch (Exception e) {
			System.err.println("Error "+e.getMessage());
		}
	}

	/**
	 * Lee el fichero donde se ha escrito (persistido) la respuesta HTTP realizada.
	 * Esta respuesta tiene formato JSON
	 * @param ruta (Ruta en la que está el archivo que se quiere leer)
	 * @return String que contiene toda la lectura del fichero
	 */
	public static String leerFichero(String ruta) {

		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
		try {
			//1º Abrimos el fichero que queremos leer
			File fich = new File(ruta);

			//2º Realizamos una comprobación para saber si el fichero se ha abierto correctamente, es decir,
			// comprobamos si existe.
			if(fich.exists()) {
				System.out.println("El fichero existe, se prosigue con la lectura");

				//3º Creamos/abrimos un flujo de lectura.
				br = new BufferedReader(new FileReader(fich));

				//4º Operamos con nuestro fichero. En este caso, si queremos leer todo el documento, lo hacemos con un while.
				String linea = new String(br.readLine());
				while(linea!=null) {
					sb.append(linea);
					linea = br.readLine();
				}

			} else {
				System.out.println("El fichero no existe");
			}


		} catch (IOException e) {
			System.err.println("Error al leer el archivo: "+e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("Nullpointer "+e.getMessage());
		} finally {
			cerrarFlujos(null, br);
		}

		return sb.toString();
	}

	/**
	 * Se recibe un String cad que es el JSON que recibimos en el cuerpo de la respuesta HTTP.
	 * Ese JSON hay que tratarlo para extraer los datos que se desean.
	 * @param cad (String con un formato JSON que contiene la respuesta HTTP hecha)
	 * @return String (contiene los datos que hemos extraído del JSON)
	 */
	public static String domarALaBestiaParda(String cad) {

		StringBuilder sb = new StringBuilder();
		JSONObject request = new JSONObject(cad);

		JSONObject data = request.getJSONObject("data");
		for (Entry<String, Object> entry : data.toMap().entrySet()) {

			String key = entry.getKey();
			sb.append(key+":\n");
			if (entry.getValue() instanceof Map) {
				Map<String, Object> map2 = (Map<String, Object>) entry.getValue();
				for (Entry<String, Object> entry2 : map2.entrySet()) {
					String key2 = entry2.getKey();
					if(key2.equals("title") || key2.equals("blurb") ) {
						sb.append(key2+": "+entry2.getValue()+"\n");
					} else if (entry2.getValue() instanceof Map) {
						Map<String, Object> map3 = (Map<String, Object>) entry2.getValue();
						for (Entry<String, Object> entry3 : map3.entrySet()) {
							String key3 = entry3.getKey();
							if(key3.equals("attackspeed")) {
								sb.append(key3+": "+entry3.getValue()+"\n");
							}
						}
					} else if(entry2.getValue() instanceof ArrayList) {
						ArrayList<String> arr = (ArrayList<String>) entry2.getValue();
						sb.append("roles: ");
						int size = arr.size();
						for (int i=0; i<size; i++) {
							if(i==size-1) {
								sb.append(arr.get(i));
							}else {
								sb.append(arr.get(i)+", ");
							}
						}
						sb.append("\n");
					}
				}
			}
		}
		return sb.toString();
	}

	/**
	 * Escribe un fichero de texto plano dados un texto y una ruta donde se quiere crear el fichero
	 * @param texto (tipo String. Es el texto a escribir en el fichero)
	 * @param ruta (tipo String. Es la ruta donde especificamos que tiene que escribirse el fichero)
	 */
	public static void escribirFichero(String texto, String ruta) {
		BufferedWriter bw = null;
		try {
			//1º Abrimos el fichero donde queramos escribir / leer
			File fichero = new File(ruta);

			//2º Comprobar si el fichero se ha abierto correctamente
			if (fichero.createNewFile()) {
				System.out.println("Fichero creado: " + fichero.getName());
			} else {
				System.out.println("El fichero existe, se prosigue con la escritura");
			}

			//3º Crear un flujo de escritura
			bw = new BufferedWriter(new FileWriter(fichero));

			//4º Operar con dicho fichero. Con el flujo de escritura que hemos creado.
			bw.write(texto);


		} catch (IOException e) {
			System.err.println("Error al escribir el archivo: "+e.getMessage());
		} finally {
			//5º Cerrar el flujo
			cerrarFlujos(bw, null);
		}

	}

	/**
	 * Metodo que cierra los flujos tanto de escritura como de lectura
	 * @param w (Writer de escritura)
	 * @param r (Reader de lectura)
	 */
	public static void cerrarFlujos(Writer w, Reader r) {
		try {
			if(w!=null) {
				System.out.println("Flujo de escritura cerrado correctamente");
				w.close();
			}
			if(r!=null) {
				System.out.println("Flujo de lectura cerrado correctamente");
				r.close();
			}
		} catch (IOException e) {
			System.err.println("Error cerrando los flujos de Lectura/Escritura: "+e.getMessage());
		}

	}

}