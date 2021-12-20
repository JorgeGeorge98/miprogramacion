package ejerciciosPokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
	
	Scanner scan = new Scanner(System.in);

	//ATRIBUTOS
	
	String nombre;
	String lore;
	String tipo;
	int fuerza;
	int vida;
	ArrayList<Ataque> ataques;
	
	//CONSTRUCTOR
	
	public Pokemon(String nombre, String tipo, int vida) {
		
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
		System.out.println(this.nombre+" ha perdido "+(atk.cantdanio*1.5)+" de HP.");
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
		if(atk.tipo == "Fuego" | atk.tipo == "Hielo" | atk.tipo == "Veneno" | atk.tipo == "Volador" | atk.tipo == "Bicho") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Agua" | atk.tipo == "Electrico" | atk.tipo == "Planta" | atk.tipo == "Tierra") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void fuego (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Agua" | atk.tipo == "Roca" | atk.tipo == "Tierra") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Acero" | atk.tipo == "Bicho" | atk.tipo == "Roca" | atk.tipo == "Tierra" | atk.tipo == "Fuego" | atk.tipo == "Hada" | atk.tipo == "Hielo" | atk.tipo == "Planta") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void bicho (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Fuego" | atk.tipo == "Roca" | atk.tipo == "Volador") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Lucha" | atk.tipo == "Planta" | atk.tipo == "Tierra") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void volador (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Electrico" | atk.tipo == "Hielo" | atk.tipo == "Roca") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Bicho" | atk.tipo == "Lucha" | atk.tipo == "Planta") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void agua (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Electrico" | atk.tipo == "Planta") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Agua" | atk.tipo == "Acero" | atk.tipo == "Fuego" | atk.tipo == "Hielo") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void electrico (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Tierra") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Volador" | atk.tipo == "Electrico" | atk.tipo == "Acero") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void veneno (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Psiquico" | atk.tipo == "Tierra") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Bicho" | atk.tipo == "Hada" | atk.tipo == "Lucha" | atk.tipo == "Planta" | atk.tipo == "Veneno") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void normal (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Lucha") {	
			this.recibeAtkEficaz(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void lucha (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Hada" | atk.tipo == "Psiquico" | atk.tipo == "Volador") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Bicho" | atk.tipo == "Roca" | atk.tipo == "Siniestro") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	public void roca (Pokemon poke, Ataque atk) {
		if(atk.tipo == "Acero" | atk.tipo == "Agua" | atk.tipo == "Lucha"| atk.tipo == "Planta" | atk.tipo == "Tierra") {	
			this.recibeAtkEficaz(poke, atk);
		} else if (atk.tipo == "Fuego" | atk.tipo == "Normal" | atk.tipo == "Veneno" | atk.tipo == "Volador") {
			this.recibeAtkPoco(poke, atk);
		} else {
			this.recibeAtk(poke, atk);
		}
	}
	
	
	
	//METODO CHECK ATAQUE
	
	public void checkAtk (Pokemon poke, Ataque atk) {
		if (this.tipo == "Planta") {
			this.planta(poke, atk);
		} else if (this.tipo == "Fuego") {
			this.fuego(poke, atk);
		} else if (this.tipo == "Bicho") {
			this.bicho(poke, atk);
		} else if (this.tipo == "Volador") {
			this.volador(poke, atk);
		} else if (this.tipo == "Agua") {
			this.agua(poke, atk);
		} else if (this.tipo == "Electrico") {
			this.electrico(poke, atk);
		} else if (this.tipo == "Veneno") {
			this.veneno(poke, atk);
		} else if (this.tipo == "Normal") {
			this.normal(poke, atk);
		} else if (this.tipo == "Lucha") {
			this.lucha(poke, atk);
		} else if (this.tipo == "Roca") {
			this.roca(poke, atk);
		}
	}
	
		
}
	