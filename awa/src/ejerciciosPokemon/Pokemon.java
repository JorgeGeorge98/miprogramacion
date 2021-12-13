package ejerciciosPokemon;

import java.util.ArrayList;

public class Pokemon {

	String nombre;
	String lore;
	String tipo;
	int fuerza;
	int vida;
	ArrayList<Ataque> ataques;
	
	public Pokemon(String nombre, String tipo, int vida) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
	}
	
	public void RecibeAtk() {
		
		
	}
	
}