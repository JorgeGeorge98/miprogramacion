package ejerciciosPokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
	
	Scanner scan = new Scanner(System.in);

	//ATRIBUTOS
	
	String nombre;
	String lore;
	Tipo tipo;
	int fuerza;
	int vida;
	ArrayList<Ataque> ataques;

	//CONSTRUCTOR
	
	public Pokemon(String nombre, Tipo tipo, int vida) {
		
		this.nombre = nombre;
		this.tipo = tipo;
		this.vida = vida;
	}
	
	public Pokemon() {
		
	}
	
	//METODOS recibeAtk
	
	public void recibeAtk(Pokemon poke, Ataque atk){
		this.vida -= atk.cantdanio;
		System.out.println(poke.nombre+" ha usado "+atk.nombre+".");
		scan.nextLine();
		System.out.println(this.nombre+" ha perdido "+atk.cantdanio+" de HP.");
		scan.nextLine();
		System.out.println(this.nombre+" ahora tiene "+this.vida+" HP.");
	}
	
	public void recibeAtkEficaz(Pokemon poke, Ataque atk) {
		this.vida -= (atk.cantdanio * 1.5);
		System.out.println(poke.nombre+" ha usado "+atk.nombre+".");
		scan.nextLine();
		System.out.println("Ha sido muy efectivo!");
		scan.nextLine();
		System.out.println(this.nombre+" ha perdido "+(atk.cantdanio*1.5)+" HP.");
		scan.nextLine();
		System.out.println(this.nombre+" ahora tiene "+this.vida+" HP.");
	}
	
	public void recibeAtkPoco(Pokemon poke, Ataque atk) {
		this.vida -= (atk.cantdanio * 0.5);
		System.out.println(poke.nombre+" ha usado "+atk.nombre+".");
		scan.nextLine();
		System.out.println("No ha sido muy eficaz...");
		scan.nextLine();
		System.out.println(this.nombre+" ha perdido "+(atk.cantdanio*0.5)+" de HP.");
		scan.nextLine();
		System.out.println(this.nombre+" ahora tiene "+this.vida+" HP.");
		
	}
	
	//METODOS EFECTIVIDAD
	
	public void planta (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.fuego | atk.tipo == Tipo.hielo | atk.tipo == Tipo.veneno | atk.tipo == Tipo.volador | atk.tipo == Tipo.bicho) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.agua | atk.tipo == Tipo.electrico | atk.tipo == Tipo.planta | atk.tipo == Tipo.tierra) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void fuego (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.agua | atk.tipo == Tipo.roca | atk.tipo == Tipo.tierra) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.acero | atk.tipo == Tipo.bicho | atk.tipo == Tipo.roca | atk.tipo == Tipo.tierra | atk.tipo == Tipo.fuego | atk.tipo == Tipo.hada | atk.tipo == Tipo.hielo | atk.tipo == Tipo.planta) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void bicho (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.fuego | atk.tipo == Tipo.roca | atk.tipo == Tipo.volador) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.lucha | atk.tipo == Tipo.planta | atk.tipo == Tipo.tierra) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void volador (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.electrico | atk.tipo == Tipo.hielo | atk.tipo == Tipo.roca) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.bicho | atk.tipo == Tipo.lucha | atk.tipo == Tipo.planta) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void agua (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.electrico | atk.tipo == Tipo.planta) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.agua | atk.tipo == Tipo.acero | atk.tipo == Tipo.fuego | atk.tipo == Tipo.hielo) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void electrico (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.tierra) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.volador | atk.tipo == Tipo.electrico | atk.tipo == Tipo.acero) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void veneno (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.psiquico | atk.tipo == Tipo.tierra) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.bicho | atk.tipo == Tipo.hada | atk.tipo == Tipo.lucha | atk.tipo == Tipo.planta | atk.tipo == Tipo.veneno) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void normal (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.lucha) {	
			this.recibeAtkEficaz(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void lucha (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.hada | atk.tipo == Tipo.psiquico | atk.tipo == Tipo.volador) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.bicho | atk.tipo == Tipo.roca | atk.tipo == Tipo.siniestro) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void roca (Pokemon poke, Ataque atk) {
		if(atk.tipo == Tipo.acero | atk.tipo == Tipo.agua | atk.tipo == Tipo.lucha| atk.tipo == Tipo.planta | atk.tipo == Tipo.tierra) {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == Tipo.fuego | atk.tipo == Tipo.normal | atk.tipo == Tipo.veneno | atk.tipo == Tipo.volador) {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	
	
	//METODO CHECK ATAQUE
	
	public void checkAtk (Pokemon poke, Ataque atk) {
		if (this.tipo == Tipo.planta) {
			this.planta(poke, atk);
		} else if (this.tipo == Tipo.fuego) {
			this.fuego(poke, atk);
		} else if (this.tipo == Tipo.bicho) {
			this.bicho(poke, atk);
		} else if (this.tipo == Tipo.volador) {
			this.volador(poke, atk);
		} else if (this.tipo == Tipo.agua) {
			this.agua(poke, atk);
		} else if (this.tipo == Tipo.electrico) {
			this.electrico(poke, atk);
		} else if (this.tipo == Tipo.veneno) {
			this.veneno(poke, atk);
		} else if (this.tipo == Tipo.normal) {
			this.normal(poke, atk);
		} else if (this.tipo == Tipo.lucha) {
			this.lucha(poke, atk);
		} else if (this.tipo == Tipo.roca) {
			this.roca(poke, atk);
		}
	}
	
		
}
	