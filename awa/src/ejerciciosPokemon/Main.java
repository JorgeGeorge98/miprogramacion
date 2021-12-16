package ejerciciosPokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//ATAQUES
		Ataque ascuas = new Ataque("Ascuas", "Fuego", 60);
		Ataque placaje = new Ataque("Placaje", "Normal", 40);
		Ataque coligneo = new Ataque("Colmillo Igneo", "Fuego", 70);
		Ataque cascada = new Ataque("Cascada", "Agua", 70);
		Ataque latcepa = new Ataque("Latigo Cepa", "Planta", 60);
		Ataque hoafi = new Ataque("Hoja Afilada", "Normal", 70);
		Ataque derribo = new Ataque("Derribo", "Normal", 70);
		Ataque burbuja = new Ataque("Burbuja", "Agua", 40);
		Ataque mordisco = new Ataque("Mordisco", "Siniestro", 60);
		Ataque impactrueno = new Ataque("Impactrueno", "Electrico", 40);
		Ataque rayo = new Ataque("Rayo", "Electrico", 70);
		Ataque picadura = new Ataque("Picadura", "Bicho", 40);
		Ataque tornado = new Ataque("Tornado", "Volador", 70);
		Ataque confusion = new Ataque("Confusion", "Psiquico", 55);
		Ataque picvenenoso = new Ataque("Picotazo Venenoso", "Veneno", 50);
		Ataque golpeka = new Ataque("Golpe Karate", "Lucha", 60);
		
		
		//POKEMONS
		Pokemon charmander = new Pokemon("Charmander", "Fuego", 350);
		charmander.ataques = new ArrayList<Ataque>();
		charmander.ataques.add(ascuas);
		charmander.ataques.add(placaje);
		charmander.ataques.add(coligneo);
		charmander.ataques.add(cascada);

		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 350);
		bulbasaur.ataques = new ArrayList<Ataque>();
		bulbasaur.ataques.add(placaje);
		bulbasaur.ataques.add(latcepa);
		bulbasaur.ataques.add(hoafi);
		bulbasaur.ataques.add(derribo);
		
		Pokemon squirtle = new Pokemon("Squirtle", "Agua", 350);
		squirtle.ataques = new ArrayList<Ataque>();
		squirtle.ataques.add(placaje);
		squirtle.ataques.add(cascada);
		squirtle.ataques.add(burbuja);
		squirtle.ataques.add(mordisco);
		
		Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 300);
		pikachu.ataques = new ArrayList<Ataque>();
		pikachu.ataques.add(placaje);
		pikachu.ataques.add(impactrueno);
		pikachu.ataques.add(rayo);
		pikachu.ataques.add(derribo);
		
		Pokemon caterpie = new Pokemon("Caterpie", "Bicho", 200);
		caterpie.ataques = new ArrayList<Ataque>();
		caterpie.ataques.add(placaje);
		caterpie.ataques.add(picadura);
		caterpie.ataques.add(tornado);
		caterpie.ataques.add(confusion);
		
		Pokemon ekans = new Pokemon("Ekans", "Veneno", 250);
		ekans.ataques = new ArrayList<Ataque>();
		ekans.ataques.add(placaje);
		ekans.ataques.add(picadura);
		ekans.ataques.add(mordisco);
		ekans.ataques.add(picvenenoso);
		
		Pokemon pidgey = new Pokemon("Pidgey", "Volador", 250);
		pidgey.ataques = new ArrayList<Ataque>();
		pidgey.ataques.add(placaje);
		pidgey.ataques.add(tornado);
		pidgey.ataques.add(derribo);
		pidgey.ataques.add(picvenenoso);
		
		Pokemon mankey = new Pokemon("Mankey", "Lucha", 300);
		mankey.ataques = new ArrayList<Ataque>();
		mankey.ataques.add(placaje);
		mankey.ataques.add(mordisco);
		mankey.ataques.add(derribo);
		mankey.ataques.add(golpeka);
		

		//COMBATE
		
		Pokemon pokeElegido = new Pokemon();
		Pokemon pokeOponente = new Pokemon();
		
		System.out.println("-----BIENVENIDO AL COMBATE POKEMON-----\n");
		System.out.println("Que Pokemon quieres utilizar?\n\n(1) Charmander\n(2) Bulbasaur\n(3) Squirtle\n(4) Pikachu\n(5) Caterpie\n(6) Ekans\n(7) Pidgey\n(8) Mankey\n\nElije aqui: ");
		int eleccion = scan.nextInt();
		System.out.println("\nContra que Pokemon quieres combatir?\n\n(1) Charmander\n(2) Bulbasaur\n(3) Squirtle\n(4) Pikachu\n(5) Caterpie\n(6) Ekans\n(7) Pidgey\n(8) Mankey\n\nElije aqui: ");
		int oponente = scan.nextInt();
		
		
		switch(eleccion) {
		case 1:
			pokeElegido = charmander;
			break;
		case 2:
			pokeElegido = bulbasaur;
			break;
		case 3:
			pokeElegido = squirtle;
			break;
		case 4:
			pokeElegido = pikachu;
			break;
		case 5:
			pokeElegido = caterpie;
			break;
		case 6:
			pokeElegido = ekans;
			break;
		case 7:
			pokeElegido = pidgey;
			break;
		case 8:
			pokeElegido = mankey;
			break;
		}
		
		switch(oponente) {
		case 1:
			pokeOponente = charmander;
			break;
		case 2:
			pokeOponente = bulbasaur;
			break;
		case 3:
			pokeOponente = squirtle;
			break;
		case 4:
			pokeOponente = pikachu;
			break;
		case 5:
			pokeOponente = caterpie;
			break;
		case 6:
			pokeOponente = ekans;
			break;
		case 7:
			pokeOponente = pidgey;
			break;
		case 8:
			pokeOponente = mankey;
			break;
		}
		
		System.out.println("\n------------------------------------------------------------\n\nUn "+pokeOponente.nombre+" salvaje ha aparecido entre la hierba!");
		scan.nextLine();
		
		int i = 1;
		while(pokeElegido.vida > 0 && pokeOponente.vida > 0) {
			if(i%2 != 0) {
				System.out.println("Elige un ataque (0) "+pokeElegido.ataques.get(0).nombre+" (1) "+pokeElegido.ataques.get(1).nombre+" (2) "+pokeElegido.ataques.get(2).nombre+" (3) "+pokeElegido.ataques.get(3).nombre+" : ");
				int atkEle = scan.nextInt();
				pokeOponente.checkAtk(pokeElegido, pokeElegido.ataques.get(atkEle));
			} else {
				int random = (int)(Math.random()*3+0); 
				pokeElegido.checkAtk(pokeOponente, pokeOponente.ataques.get(random));
			}
			
			if(pokeElegido.vida < 0) {
				System.out.println(pokeElegido.nombre+" se ha ido con diosito.");
			} 
			
			if(pokeOponente.vida < 0) {
				System.out.println(pokeOponente.nombre+" se ha ido con diosito.");
			}
		i++;
		}
	
		
		}
		
	}

