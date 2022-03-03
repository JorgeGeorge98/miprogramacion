package ejerciciosPractica2Examen;

public class Punto {

	private int x,y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void imprime() {
		System.out.println("("+this.x+", "+this.y+")");
	}
	
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	public int distancia(Punto p) {

		return (int) Math.sqrt((p.y - this.y) * (p.y - this.y) + (p.x - this.x) * (p.x - this.x));
	}
	
	public static Punto crearPuntoAleatorio() {
		
		Punto aleatorio = new Punto((int)(Math.random()* (100 + 100) - 100), (int)(Math.random()* ((100 + 100) - 100)));		
		
		return aleatorio;
		
	}
}
