package practicaTema14;

public class Gato {

	private String nombre;
	private int edad;
	
	public Gato(String nombre, int edad) throws Exception {
			
		if(nombre.length() < 3) {
			throw new Exception("El nombre no puede ser menor de 3 caracteres");
		} else {
			this.nombre=nombre;
		}
		
		if(edad < 0) {
			throw new Exception("La edad no puede ser menor que 0!");
		} else {
			this.edad=edad;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws Exception {
		if(nombre.length() < 3) {
			throw new Exception("El nombre no puede ser menor de 3 caracteres");
		} else {
			this.nombre=nombre;
		}
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if(edad < 0) {
			throw new Exception("La edad no puede ser menor que 0!");
		} else {
			this.edad=edad;
		}
	}
	
	public void imprimir() {
		System.out.println("Hola, soy "+this.nombre+" y tengo "+this.edad+" años.");
	}
	
}
