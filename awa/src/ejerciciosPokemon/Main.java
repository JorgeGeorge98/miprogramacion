 package ejerciciosPokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//ATAQUES
		Ataque ascuas = new Ataque("Ascuas", Tipo.fuego, 60);
		Ataque placaje = new Ataque("Placaje", Tipo.normal, 40);
		Ataque coligneo = new Ataque("Colmillo Igneo", Tipo.fuego, 70);
		Ataque cascada = new Ataque("Cascada", Tipo.agua, 70);
		Ataque latcepa = new Ataque("Latigo Cepa", Tipo.planta, 60);
		Ataque hoafi = new Ataque("Hoja Afilada", Tipo.planta, 70);
		Ataque derribo = new Ataque("Derribo", Tipo.normal, 70);
		Ataque burbuja = new Ataque("Burbuja", Tipo.agua, 40);
		Ataque mordisco = new Ataque("Mordisco", Tipo.siniestro, 60);
		Ataque impactrueno = new Ataque("Impactrueno", Tipo.electrico, 40);
		Ataque rayo = new Ataque("Rayo", Tipo.electrico, 70);
		Ataque picadura = new Ataque("Picadura", Tipo.bicho, 40);
		Ataque tornado = new Ataque("Tornado", Tipo.volador, 70);
		Ataque confusion = new Ataque("Confusion", Tipo.psiquico, 55);
		Ataque picvenenoso = new Ataque("Picotazo Venenoso", Tipo.veneno, 50);
		Ataque golpeka = new Ataque("Golpe Karate", Tipo.lucha, 60);
		Ataque lanzrocas = new Ataque("Lanza Rocas", Tipo.roca, 55);
		Ataque terremoto = new Ataque("Terremoto", Tipo.tierra, 70);
		Ataque girobola = new Ataque("Giro Bola", Tipo.acero, 55);
		
		
		//POKEMONS
		Pokemon charmander = new Pokemon("Charmander", Tipo.fuego, 200);
		charmander.ataques = new ArrayList<Ataque>();
		charmander.ataques.add(ascuas);
		charmander.ataques.add(placaje);
		charmander.ataques.add(coligneo);
		charmander.ataques.add(cascada);

		Pokemon bulbasaur = new Pokemon("Bulbasaur", Tipo.planta, 200);
		bulbasaur.ataques = new ArrayList<Ataque>();
		bulbasaur.ataques.add(placaje);
		bulbasaur.ataques.add(latcepa);
		bulbasaur.ataques.add(hoafi);
		bulbasaur.ataques.add(derribo);
		
		Pokemon squirtle = new Pokemon("Squirtle", Tipo.agua, 200);
		squirtle.ataques = new ArrayList<Ataque>();
		squirtle.ataques.add(placaje);
		squirtle.ataques.add(cascada);
		squirtle.ataques.add(burbuja);
		squirtle.ataques.add(mordisco);
		
		Pokemon pikachu = new Pokemon("Pikachu", Tipo.electrico, 200);
		pikachu.ataques = new ArrayList<Ataque>();
		pikachu.ataques.add(placaje);
		pikachu.ataques.add(impactrueno);
		pikachu.ataques.add(rayo);
		pikachu.ataques.add(derribo);
		
		Pokemon caterpie = new Pokemon("Caterpie", Tipo.bicho, 200);
		caterpie.ataques = new ArrayList<Ataque>();
		caterpie.ataques.add(placaje);
		caterpie.ataques.add(picadura);
		caterpie.ataques.add(tornado);
		caterpie.ataques.add(confusion);
		
		Pokemon ekans = new Pokemon("Ekans", Tipo.veneno, 200);
		ekans.ataques = new ArrayList<Ataque>();
		ekans.ataques.add(placaje);
		ekans.ataques.add(picadura);
		ekans.ataques.add(mordisco);
		ekans.ataques.add(picvenenoso);
		
		Pokemon pidgey = new Pokemon("Pidgey", Tipo.volador, 200);
		pidgey.ataques = new ArrayList<Ataque>();
		pidgey.ataques.add(placaje);
		pidgey.ataques.add(tornado);
		pidgey.ataques.add(derribo);
		pidgey.ataques.add(picvenenoso);
		
		Pokemon mankey = new Pokemon("Mankey", Tipo.lucha, 200);
		mankey.ataques = new ArrayList<Ataque>();
		mankey.ataques.add(placaje);
		mankey.ataques.add(mordisco);
		mankey.ataques.add(derribo);
		mankey.ataques.add(golpeka);
		
		Pokemon onix = new Pokemon("Onix", Tipo.roca, 200);
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
				pokeElegido = new Pokemon("Charmander", Tipo.fuego, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(ascuas);
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(coligneo);
				pokeElegido.ataques.add(cascada);
				break;
			case 2:
				pokeElegido = new Pokemon("Bulbasaur", Tipo.planta, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(latcepa);
				pokeElegido.ataques.add(hoafi);
				pokeElegido.ataques.add(derribo);
				break;
			case 3:
				pokeElegido = new Pokemon("Squirtle", Tipo.agua, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(cascada);
				pokeElegido.ataques.add(burbuja);
				pokeElegido.ataques.add(mordisco);
				break;
			case 4:
				pokeElegido = new Pokemon("Pikachu", Tipo.electrico, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(impactrueno);
				pokeElegido.ataques.add(rayo);
				pokeElegido.ataques.add(derribo);
				break;
			case 5:
				pokeElegido = new Pokemon("Caterpie", Tipo.bicho, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(picadura);
				pokeElegido.ataques.add(tornado);
				pokeElegido.ataques.add(confusion);
				break;
			case 6:
				pokeElegido = new Pokemon("Ekans", Tipo.veneno, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(picadura);
				pokeElegido.ataques.add(mordisco);
				pokeElegido.ataques.add(picvenenoso);
				break;
			case 7:
				pokeElegido = new Pokemon("Pidgey", Tipo.volador, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(tornado);
				pokeElegido.ataques.add(derribo);
				pokeElegido.ataques.add(picvenenoso);
				break;
			case 8:
				pokeElegido = new Pokemon("Mankey", Tipo.lucha, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(placaje);
				pokeElegido.ataques.add(mordisco);
				pokeElegido.ataques.add(derribo);
				pokeElegido.ataques.add(golpeka);
				break;
			case 9:
				pokeElegido = new Pokemon("Onix", Tipo.roca, 200);
				pokeElegido.ataques = new ArrayList<Ataque>();
				pokeElegido.ataques.add(derribo);
				pokeElegido.ataques.add(lanzrocas);
				pokeElegido.ataques.add(terremoto);
				pokeElegido.ataques.add(girobola);
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
				pokeOponente = new Pokemon("Charmander", Tipo.fuego, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(ascuas);
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(coligneo);
				pokeOponente.ataques.add(cascada);;
				break;
			case 2:
				pokeOponente = new Pokemon("Bulbasaur", Tipo.planta, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(latcepa);
				pokeOponente.ataques.add(hoafi);
				pokeOponente.ataques.add(derribo);;
				break;
			case 3:
				pokeOponente = new Pokemon("Squirtle", Tipo.agua, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(cascada);
				pokeOponente.ataques.add(burbuja);
				pokeOponente.ataques.add(mordisco);
				break;
			case 4:
				pokeOponente = new Pokemon("Pikachu", Tipo.electrico, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(impactrueno);
				pokeOponente.ataques.add(rayo);
				pokeOponente.ataques.add(derribo);
				break;
			case 5:
				pokeOponente = new Pokemon("Caterpie", Tipo.bicho, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(picadura);
				pokeOponente.ataques.add(tornado);
				pokeOponente.ataques.add(confusion);
				break;
			case 6:
				pokeOponente = new Pokemon("Ekans", Tipo.veneno, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(picadura);
				pokeOponente.ataques.add(mordisco);
				pokeOponente.ataques.add(picvenenoso);
				break;
			case 7:
				pokeOponente = new Pokemon("Pidgey", Tipo.volador, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(tornado);
				pokeOponente.ataques.add(derribo);
				pokeOponente.ataques.add(picvenenoso);
				break;
			case 8:
				pokeOponente = new Pokemon("Mankey", Tipo.lucha, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(placaje);
				pokeOponente.ataques.add(mordisco);
				pokeOponente.ataques.add(derribo);
				pokeOponente.ataques.add(golpeka);
				break;
			case 9:
				pokeOponente = new Pokemon("Onix", Tipo.roca, 200);
				pokeOponente.ataques = new ArrayList<Ataque>();
				pokeOponente.ataques.add(derribo);
				pokeOponente.ataques.add(lanzrocas);
				pokeOponente.ataques.add(terremoto);
				pokeOponente.ataques.add(girobola);
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
					if(yo.equipo.size()!=0) {
						System.out.println(yo.equipo.get(0).nombre+" yo te elijo!");
					} else {
						System.out.println("Gary ha ganado el combate.");
						scan.nextLine();
						System.out.println("Has perdido 58 PokeDolares.");
					}
				} else if (gary.equipo.get(0).vida < 0) {
					System.out.println(gary.equipo.get(0).nombre+" se ha ido con diosito.");
					gary.equipo.remove(0);
					if(gary.equipo.size()!=0) {
						System.out.println(gary.nombre+": "+gary.equipo.get(0).nombre+" yo te elijo!");
					} else {
						System.out.println("Has ganado el combate!");
						scan.nextLine();
						System.out.println("Gary te ha dado 90 PokeDolares.");
					}
				} else {
					i++;
				}
			}
			
	}
}
			
