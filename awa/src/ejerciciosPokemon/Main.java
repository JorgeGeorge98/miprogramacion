package ejerciciosPokemon;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Pokemon charmander = new Pokemon("Charmander", "Fuego", 500);
		
		Ataque atk1 = new Ataque("Ascuas", "Fuego", 100);
		Ataque atk2 = new Ataque("Placaje", "Normal", 60);
		Ataque atk3 = new Ataque("Llamarada", "Fuego", 150);
		
		charmander.ataques = new ArrayList<Ataque>();
		charmander.ataques.add(atk1);
		charmander.ataques.add(atk2);
		charmander.ataques.add(atk3);
		
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 500);
		
		Ataque atk4 = new Ataque("Placaje", "Normal", 60);
		Ataque atk5 = new Ataque("Latigo Cepa", "Planta", 100);
		Ataque atk6 = new Ataque("Hoja Afilada", "Normal", 150);
		
		bulbasaur.ataques = new ArrayList<Ataque>();
		bulbasaur.ataques.add(atk4);
		bulbasaur.ataques.add(atk5);
		bulbasaur.ataques.add(atk6);
		
		
	}
}
