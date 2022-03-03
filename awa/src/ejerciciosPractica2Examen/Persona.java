package ejerciciosPractica2Examen;

public class Persona {
	
	private final String dni;
	private String nombre;
	private String apellido;
	private int edad;
	static final int mayoriaEdad = 18;
	
	public Persona(String dni, String nombre, String apellido, int edad) {
		
		if(this.validarDNI(dni)) {
			this.dni = dni;
		} else {
			System.out.println("Error, DNI no se valido");
			this.dni = null;
		}
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprime() {
		System.out.println("DNI: "+this.dni+"\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nEdad: "+this.edad);
	}
	
	public boolean esMayorEdad() {
		
		boolean mayor;
		
		if(this.edad>=mayoriaEdad) {
			mayor = true;
		} else {
			mayor = false;
		}
		
		return mayor;
	}
	
	public boolean esJubilado() {
		
		boolean b;
		
		if(this.edad>=65) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}

	public int diferenciaEdad(Persona p) {
		
		int dif = this.edad - p.edad;
		
		return dif;
	}
	
	public static boolean validarDNI(String dni) {
		
		boolean b;
		
		if(dni.length()==9) {
			char c = dni.toCharArray()[8];
			if(c>=65 && c<=90) {
				b = true;
			} else {
				b = false;
			} 
		} else {
			b = false;
		}
		
		return b;
	}
	
	
	
	
	
	
}
