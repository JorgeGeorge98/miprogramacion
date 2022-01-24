package Battleship;

public class Barco {

	private int posiciones;
	private int cantidad;
	
	public Barco() {
		
	}
	
	public Barco(int posiciones, int cantidad) {
		this.posiciones=posiciones;
		this.cantidad=cantidad;
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
}