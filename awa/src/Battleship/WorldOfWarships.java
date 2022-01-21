package Battleship;

import java.util.*;

public class WorldOfWarships {
	public static int posJugador;
	public static int posCPU;
	public static int turnos;
	public static int filas = 10;
	public static int colum = 10; 
	public static Barco lancha = new Barco(1, 5, 'L' , true);
	public static Barco buque = new Barco(3, 3, 'B', true);
	public static Barco acorazado = new Barco(4, 1, 'Z', true);
	public static Barco portaaviones = new Barco(5, 1, 'P', false);

	public static void main(String[] args) {
											
		char[][] tablaJugador = crearTabla();
		char[][] tablaCPU = crearTabla();
		char[][] tablaBatalla = crearTabla();

		setTablaJugador(tablaJugador);
		setTablaCPU(tablaCPU);
		System.out.println("Tu tabla");
		mostrarTabla(tablaJugador);
		System.out.println("\nTabla rival");
		mostrarTabla(tablaCPU);
		
		do {
			batalla(tablaJugador, tablaCPU, tablaBatalla);
		} while(posJugador!=0 && posCPU !=0 && turnos <= 50);
		
		gameOver();
	
	}
	
	//----------------------------------------------------------------------------------------------------//
	
	//Crea una tabla "vacia"//
	public static char[][] crearTabla() {
		
		char tabla[][]=new char[filas][colum];
				
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tabla[i][j] = '-';
			}
		}
		
		return tabla;
	}
	
	//Muestra la tabla que se pasa por parametro//
	public static void mostrarTabla(char[][] tabla) {
		
		char letras[]= {'A','B','C','D','E','F','G','H','I','J'};

		System.out.print("  ");
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.print("\n");
		
		for(int i=0; i<10; i++) {
			System.out.print(letras[i]+" ");
			for(int j=0; j<10; j++) {
				System.out.print(tabla[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	//------------------------SET BARCOS----------------------------//
	public static char[][] setLancha(char[][] tabla){
		
		boolean seteado;
		
		for(int i=0; i<lancha.getCantidad(); i++) {
			
			int x;
			int y;
			
			seteado = false;
			
			do {
				x = (int)(Math.random()*9+0);
				y = (int)(Math.random()*9+0);
				
				if(tabla[x][y]!='L') {
					tabla[x][y]='L';
					seteado=true;
				}
			} while(!seteado);
			
		}
		return tabla;
	}
	
	public static char[][] setBuque(char[][] tabla){
		
		boolean seteado;
		
		for(int i=0; i<buque.getCantidad(); i++) {
			
			int x;
			int y;
			
			seteado = false;
			
			do {
				x = (int)(Math.random()*9+0);
				y = (int)(Math.random()*7+0);
				
				if(tabla[x][y]!='L' && tabla[x][y+1]!='L' && tabla[x][y+2]!='L' && tabla[x][y]!='B' && tabla[x][y+1]!='B' && tabla[x][y+2]!='B' ) {
					tabla[x][y]='B';
					tabla[x][y+1]='B';
					tabla[x][y+2]='B';
					seteado=true;
				}
			} while(!seteado);
		}
		return tabla;
	}
	
	public static char[][] setAcorazado(char[][] tabla){
		
		boolean seteado;
		
		for(int i=0; i<acorazado.getCantidad(); i++) {
			
			int x;
			int y;
			
			seteado = false;
			
			do {
				x = (int)(Math.random()*9+0);
				y = (int)(Math.random()*6+0);
				
				if(tabla[x][y]!='L' && tabla[x][y+1]!='L' && tabla[x][y+2]!='L' && tabla[x][y+3]!='L' && tabla[x][y]!='B' && tabla[x][y+1]!='B' && tabla[x][y+2]!='B' && tabla[x][y+3]!='B' && tabla[x][y]!='A' && tabla[x][y+1]!='A' && tabla[x][y+2]!='A' && tabla[x][y+3]!='A' ) {
					tabla[x][y]='A';
					tabla[x][y+1]='A';
					tabla[x][y+2]='A';
					tabla[x][y+3]='A';
					seteado=true;
				}
			} while(!seteado);
		}
		return tabla;
	}
	
	public static char[][] setPortaaviones(char[][] tabla){
		
		boolean seteado;
		
		for(int i=0; i<portaaviones.getCantidad(); i++) {
			
			int x;
			int y;
			
			seteado = false;
			
			do {
				x = (int)(Math.random()*5+0);
				y = (int)(Math.random()*9+0);
				
				if(tabla[x][y]!='L' && tabla[x+1][y]!='L' && tabla[x+2][y]!='L' && tabla[x+3][y]!='L' && tabla[x+4][y]!='L' && tabla[x][y]!='B' && tabla[x+1][y]!='B' && tabla[x+2][y]!='B' && tabla[x+3][y]!='B' && tabla[x+4][y]!='B' && tabla[x][y]!='A' && tabla[x+1][y]!='A' && tabla[x+2][y]!='A' && tabla[x+3][y]!='A'  && tabla[x+4][y]!='A' && tabla[x][y]!='P' && tabla[x+1][y]!='P' && tabla[x+2][y]!='P' && tabla[x+3][y]!='P' && tabla[x+4][y]!='P') {
					tabla[x][y]='P';
					tabla[x+1][y]='P';
					tabla[x+2][y]='P';
					tabla[x+3][y]='P';
					tabla[x+4][y]='P';
					seteado=true;
				}
			} while(!seteado);
		}
		return tabla;
	}
	
	//------------------------------------------------------------//
	
	//Setea la tabla del jugador con barcos//
	public static char[][] setTablaJugador(char[][] tabla) {
		
		setLancha(tabla);
		posJugador = lancha.getCantidad() * lancha.getPosiciones();
		setBuque(tabla);
		posJugador = buque.getCantidad() * buque.getPosiciones();
		setAcorazado(tabla);
		posJugador = acorazado.getCantidad() * acorazado.getPosiciones();
		setPortaaviones(tabla);
		posJugador = portaaviones.getCantidad() * portaaviones.getPosiciones();
		return tabla;
	}
	
	//Setea la tabla del CPU con barcos//
	public static char[][] setTablaCPU(char[][] tabla) {
		
		setLancha(tabla);
		posCPU = lancha.getCantidad() * lancha.getPosiciones();
		setBuque(tabla);
		posCPU = buque.getCantidad() * buque.getPosiciones();
		setAcorazado(tabla);
		posCPU = acorazado.getCantidad() * acorazado.getPosiciones();
		setPortaaviones(tabla);
		posCPU = portaaviones.getCantidad() * portaaviones.getPosiciones();
		return tabla;
	}
	
	//Se encarga de ejecutar la batalla//
	public static void batalla(char[][] tablaJugador, char[][] tablaCPU, char[][]tablaBatalla) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-----BATALLA NAVAL-----");
		
		turnoJugador(tablaCPU, tablaBatalla);
		scan.nextLine();
		turnoCPU(tablaJugador);
		scan.nextLine();
		
		System.out.println("Tabla rival");
		mostrarTabla(tablaBatalla);
		
	}
	
	//Muestra el mensaje final cuando acaba la batalla//
	public static void gameOver() {
		
		if(posJugador>0 && posCPU<=0) {
			System.out.println("HAS GANADO!!!");
		} else if (posJugador>posCPU && turnos==50) {
			System.out.println("HAS GANADO!!!");
		} else {
			System.out.println("Has perdido :(((");
		}
	}
	
	//Maneja el turno del jugador//
	public static void turnoJugador(char[][] tablaCPU, char[][] tablaBatalla) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Es tu turno!");
		int x = 0,y = 0;
		char letraX;
		
		System.out.println("Introduce coordenada X (0-9): ");
		y = scan.nextInt();
		if(y<0 || y>9) {
			System.out.println("Fatal Error, no has introducido un valor aceptable.");
		}
		
		System.out.println("Introduce coordenada Y (A-J): ");
		letraX = scan.next().charAt(0);
		
		switch(letraX) {
		case 'A':
			x=0;
			break;
		case 'B':
			x=1;
			break;
		case 'C':
			x=2;
			break;
		case 'D':
			x=3;
			break;
		case 'E':
			x=4;
			break;
		case 'F':
			x=5;
			break;
		case 'G':
			x=6;
			break;
		case 'H':
			x=7;
			break;
		case 'I':
			x=8;
			break;
		case 'J':
			x=9;
			break;
		case 'a':
			x=0;
			break;
		case 'b':
			x=1;
			break;
		case 'c':
			x=2;
			break;
		case 'd':
			x=3;
			break;
		case 'e':
			x=4;
			break;
		case 'f':
			x=5;
			break;
		case 'g':
			x=6;
			break;
		case 'h':
			x=7;
			break;
		case 'i':
			x=8;
			break;
		case 'j':
			x=9;
			break;
		default:
			System.out.println("Fatal Error, no has introducido un valor aceptable.");
			break;
		}
		
		if(tablaCPU[x][y] == 'L' || tablaCPU[x][y] == 'B' || tablaCPU[x][y] == 'A' || tablaCPU[x][y] == 'P') {
			System.out.println("BOOM! Has acertado!");
			tablaBatalla[x][y] = 'X';
			tablaCPU[x][y] = '-';
			System.out.println("Tabla rival");
			mostrarTabla(tablaBatalla);
			posCPU--;
			turnos++;
		} else {
			System.out.println("Has fallado :(");
			tablaBatalla[x][y] = '@';
			System.out.println("Tabla rival");
			mostrarTabla(tablaBatalla);
			turnos++;
		}
	}
	
	//Maneja el turno de la computadora//
	public static void turnoCPU(char[][]tablaJugador) {
		
		int x = (int)(Math.random()*9+0);
		int y = (int)(Math.random()*9+0);
		
		if(tablaJugador[x][y] == 'L' || tablaJugador[x][y] == 'B' || tablaJugador[x][y] == 'A' || tablaJugador[x][y] == 'P') {
			System.out.println("Tu rival ha acertado!");
			tablaJugador[x][y]='X';
			System.out.println("Tu tabla");
			mostrarTabla(tablaJugador);
			posJugador--;
		} else {
			System.out.println("Tu rival ha fallado!");
			tablaJugador[x][y]='@';
			System.out.println("Tu tabla");
			mostrarTabla(tablaJugador);
		}
	}
}

