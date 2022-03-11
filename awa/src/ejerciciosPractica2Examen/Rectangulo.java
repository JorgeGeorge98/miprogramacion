package ejerciciosPractica2Examen;

public class Rectangulo {
	
	private int x1, x2, y1, y2;
	
	private final int min = 0;

	private final int max = 100;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		
		if(x2 >= min && x2 <= max) {
			this.x2=x2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y2 >= min && y2 <= max) {
			this.y2=y2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(x1 >= min && x1 <= max && x1 < x2) {
			this.x1=x1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y1 >= min && y1 <= max && y1 < y2) {
			this.y1=y1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
				
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		if(x1 >= min && x1 <= max && x1 < x2) {
			this.x1=x1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		if(x2 >= min && x2 <= max) {
			this.x2=x2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		if(y1 >= min && y1 <= max && y1 < y2) {
			this.y1=y1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		if(y2 >= min && y2 <= max) {
			this.y2=y2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}
	
	public void setX1Y1(int x1, int y1) {
		if(x1 >= min && x1 <= max && x1 < x2) {
			this.x1=x1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y1 >= min && y1 <= max && y1 < y2) {
			this.y1=y1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}
	
	public void setX2Y2(int x2, int y2) {
		if(x2 >= min && x2 <= max) {
			this.x2=x2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y2 >= min && y2 <= max) {
			this.y2=y2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}
	
	public void setAll(int x1, int y1, int x2, int y2) {
		if(x2 >= min && x2 <= max) {
			this.x2=x2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y2 >= min && y2 <= max) {
			this.y2=y2;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(x1 >= min && x1 <= max && x1 < x2) {
			this.x1=x1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
		
		if(y1 >= min && y1 <= max && y1 < y2) {
			this.y1=y1;
		} else {
			System.err.println("ERROR VALOR INVALIDO");
		}
	}
	
	
	public int getPerimetro() {
		
		int p, a, b;
	
		b = this.x2 - this.x1;
		
		a = this.y2 - this.y1;
		
		p = (b * 2) + (a * 2);
		
		return p;
	}
	
	public int getArea() {
		
		int ar, a, b;
		
		b = this.x2 - this.x1;
		
		a = this.y2 - this.y1;
		
		ar = b * a;
		
		return ar;
	}
	
	public void comapararAr(Rectangulo r) {
		int comparar = this.getArea() - r.getArea();
		System.out.println("La diferencia entre las 2 areas es de "+comparar);
	}
	
	public void imprimir() {
		System.out.println("X2:"+this.x2+" Y2:"+this.y2+"\nX1:"+this.x1+" Y1: "+this.y1);
	}
}
