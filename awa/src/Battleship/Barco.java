package Battleship;

public class Barco {

	private int posiciones;
	private int cantidad;
	private char letra;
	private boolean horiz;
	
	public Barco(int posiciones, int cantidad, char letra, boolean horiz) {
		this.posiciones=posiciones;
		this.cantidad=cantidad;
		this.letra=letra;
		this.horiz=horiz;
		
	
	}

	public int getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(int posiciones) {
		this.posiciones = posiciones;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public boolean isHoriz() {
		return horiz;
	}

	public void setHoriz(boolean horiz) {
		this.horiz = horiz;
	}
	
	
}
