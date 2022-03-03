package ejerciciosPractica2Examen;

public class Almacen {

	private String nombre;
	
	private double precio, iva;
	
	private int cantidad;
	
	public Almacen(String nombre, double precio, double iva, int cantidad) {
		
		if(iva > 1 || precio < 0 || cantidad < 0) {
			System.err.println("Error, alguno de los valores no es valido");
		} else {
			this.nombre = nombre;
			this.precio = precio;
			this.iva = iva;
			this.cantidad = cantidad;
		}	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio < 0) {
			System.err.println("Error");
		} else {
			this.precio = precio;
		}
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		if(iva > 1) {
			System.err.println("Error");
		} else {
			this.iva = iva;
		}	
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		if(cantidad < 0) {
			System.err.println("Error");
		} else {
			this.cantidad = cantidad;
		}	
	}
	
	
	
	
	
	
}
