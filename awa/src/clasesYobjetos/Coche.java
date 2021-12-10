package clasesYobjetos;

public class Coche {

	byte numRuedas;
	double kilometraje;
	String marca;
	String modelo;
	String transmision;
	String direccion;
	float cilindrada;
	String tipoSuspension;
	int precio;
	
	public void kmRodado() {
		kilometraje++;
		precio -=10;
	}
	
	public void vender() {
		if (precio < 1000 && kilometraje > 3000) {
			System.out.println("Nadie quiso comprar esta porqueria.");
		} else {
			System.out.println("Se ha vendido tu "+marca+" por: "+precio);
		}
	}

}
