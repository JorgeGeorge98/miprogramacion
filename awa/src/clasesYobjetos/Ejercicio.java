package clasesYobjetos;

public class Ejercicio {

	public static void main(String[] args) {

		/*
		 * 1. Crear una clase coche.
		 * 
		 * OPCIONAL
		 * 2. (buscar en internet) Crear otras clases "Furgoneta" "Camion" "4x4".
		 * 3. Realizar herencia entre coches y las demas clases.
		 * 
		 * 4. Crear los atributos convenientes.
		 * 5. Crear funcionalidades que modifiquen los atributos.
		 * 6. En otra clase, crear e instanciar 2 o 3 objetos de tipo coche.
		 * 7. Dar valores a los atributos de los diferentes objetos.
		 * 8. Llamar a las funcionalidades de los objetos.
		 * 
		 */
		
		Coche audi = new Coche();
		Coche mitsubishi = new Coche();
		
		System.out.println("---MITSUBISHI---");
		
		mitsubishi.precio=5000;
		mitsubishi.kilometraje=3000;
		mitsubishi.marca="Mitsubishi";
		
		mitsubishi.vender();
		
		for(int i=0; i<163; i++) {
			mitsubishi.kmRodado();
		}
		
		mitsubishi.vender();
		
		System.out.println("\n---AUDI---");
		audi.precio=3000;
		audi.kilometraje=2500;
		audi.marca="Audi";
		
		audi.vender();
		
		for(int i=1; i<1000; i++) {
			audi.kmRodado();
		}
		
		audi.vender();

	}

}
