 package ejerciciosPokemon;

import java.util.ArrayList;
import java.util.Arrays;
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
		Ataque lanzrocas = new Ataque("Lanza Rocas", "Roca", 55);
		Ataque terremoto = new Ataque("Terremoto", "Tierra", 70);
		Ataque girobola = new Ataque("Giro Bola", "Acero", 55);
		
		
		//POKEMONS
		Pokemon charmander = new Pokemon("Charmander", "Fuego", 200);
		charmander.ataques = new ArrayList<Ataque>();
		charmander.ataques.add(ascuas);
		charmander.ataques.add(placaje);
		charmander.ataques.add(coligneo);
		charmander.ataques.add(cascada);

		Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta", 200);
		bulbasaur.ataques = new ArrayList<Ataque>();
		bulbasaur.ataques.add(placaje);
		bulbasaur.ataques.add(latcepa);
		bulbasaur.ataques.add(hoafi);
		bulbasaur.ataques.add(derribo);
		
		Pokemon squirtle = new Pokemon("Squirtle", "Agua", 200);
		squirtle.ataques = new ArrayList<Ataque>();
		squirtle.ataques.add(placaje);
		squirtle.ataques.add(cascada);
		squirtle.ataques.add(burbuja);
		squirtle.ataques.add(mordisco);
		
		Pokemon pikachu = new Pokemon("Pikachu", "Electrico", 200);
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
		
		Pokemon ekans = new Pokemon("Ekans", "Veneno", 200);
		ekans.ataques = new ArrayList<Ataque>();
		ekans.ataques.add(placaje);
		ekans.ataques.add(picadura);
		ekans.ataques.add(mordisco);
		ekans.ataques.add(picvenenoso);
		
		Pokemon pidgey = new Pokemon("Pidgey", "Volador", 200);
		pidgey.ataques = new ArrayList<Ataque>();
		pidgey.ataques.add(placaje);
		pidgey.ataques.add(tornado);
		pidgey.ataques.add(derribo);
		pidgey.ataques.add(picvenenoso);
		
		Pokemon mankey = new Pokemon("Mankey", "Lucha", 200);
		mankey.ataques = new ArrayList<Ataque>();
		mankey.ataques.add(placaje);
		mankey.ataques.add(mordisco);
		mankey.ataques.add(derribo);
		mankey.ataques.add(golpeka);
		
		Pokemon onix = new Pokemon("Onix", "Roca", 200);
		onix.ataques = new ArrayList<Ataque>();
		onix.ataques.add(derribo);
		onix.ataques.add(lanzrocas);
		onix.ataques.add(terremoto);
		onix.ataques.add(girobola);		

		//COMBATE
		
		Entrenador gary = new Entrenador("Gary");
		gary.equipo = new ArrayList<Pokemon>();
		
		Entrenador yo = new Entrenador("Rojo");
		yo.equipo = new ArrayList<Pokemon>();
		
		Pokemon pokeElegido = new Pokemon();
		
		Pokemon pokeOponente = new Pokemon();
		
		//Selector de Pokemons
		
		for (int i=0; i<6; i++) {
			System.out.println("Crea tu equipo, elije un Pokemon\n\n(1) Charmander\n(2) Bulbasaur\n(3) Squirtle\n(4) Pikachu\n(5) Caterpie\n(6) Ekans\n(7) Pidgey\n(8) Mankey\n(9) Onix\nElije aqui: ");
			int eleccion = scan.nextInt();
			
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
			case 9:
				pokeElegido = onix;
				break;
			}
			
			yo.equipo.add(pokeElegido);
		}
		
		System.out.println("Tu equipo es:");
		for (int i=0; i<6; i++) {
			System.out.print(yo.equipo.get(i).nombre+" ");
		}
		scan.nextLine();
		
		//Set Pokemons Rivales
		
		for (int i=0; i<6; i++) {
			
			int randomPokemon = (int)(Math.random()*9+1);
			
			switch(randomPokemon) {
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
			case 9:
				pokeElegido = onix;
				break;
			}
			
			gary.equipo.add(pokeOponente);
		}
		
		System.out.println("\n\nEl equipo rival es: ");
		for (int i=0; i<6; i++) {
			System.out.print(gary.equipo.get(i).nombre+" ");
		}
		scan.nextLine();
		
		//COMBATE 6v6
		
		System.out.println("\n\n\n----------COMBATE POKEMON----------");
		System.out.println(gary.nombre+" te ha retado a un combate!\n");
	
			
		System.out.println(yo.equipo.get(0).nombre+" yo te elijo!");
		System.out.println(gary.nombre+": "+gary.equipo.get(0).nombre+" yo te elijo!");
			
		int i = 0;
		
			while(yo.equipo.size()>0 && gary.equipo.size()>0) {
				
				if(i%2 == 0) {
					System.out.println("Elige un ataque (0) "+yo.equipo.get(0).ataques.get(0).nombre+" (1) "+yo.equipo.get(0).ataques.get(1).nombre+" (2) "+yo.equipo.get(0).ataques.get(2).nombre+" (3) "+yo.equipo.get(0).ataques.get(3).nombre+" : ");
					int atkEle = scan.nextInt();
					gary.equipo.get(0).checkAtk(yo.equipo.get(0), yo.equipo.get(0).ataques.get(atkEle));
				} else {
					int random = (int)(Math.random()*3+0); 
					yo.equipo.get(0).checkAtk(gary.equipo.get(0), gary.equipo.get(0).ataques.get(random));
				}
				
				if(yo.equipo.get(0).vida < 0) {
					System.out.println(yo.equipo.get(0).nombre+" se ha ido con diosito.");
					yo.equipo.remove(0);
					System.out.println(yo.equipo.get(0).nombre+" yo te elijo!");
				} else if (gary.equipo.get(0).vida < 0) {
					System.out.println(gary.equipo.get(0).nombre+" se ha ido con diosito.");
					gary.equipo.remove(0);
					System.out.println(gary.nombre+": "+gary.equipo.get(0).nombre+" yo te elijo!");
				} else {
					i++;
				}
			}
			
			if(yo.equipo.size()==0) {
				System.out.println("Has perdido.");
			} else if (gary.equipo.size()==0) {
				System.out.println("Has ganado");
			}
		

	}
}
			
