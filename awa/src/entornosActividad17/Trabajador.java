package entornosActividad17;

import java.util.ArrayList;

public class Trabajador {

	public static int CAT_EMPLEADO = 0;
	public static int CAT_ENCARGADO = 1;
	public static int CAT_DIRECTIVO = 2;
	public static int ANT_NOVATO = 0;
	public static int ANT_MADURO = 1;
	public static int ANT_EXPERTO = 2;

	private String nombre;
	private int edad;
	private int categoria;
	private int antiguedad;


	public Trabajador(String nombre, int edad, int categoria, int antiguedad) throws IllegalArgumentException {
		
		if (categoria < 0 || categoria > 2) {
			System.out.println("Categoria incorrecta");
			throw new IllegalArgumentException("Categoría o antigüedad incorrectos");
		}
		if (antiguedad < 0 || antiguedad > 2) {
			System.out.println("Antigüedad incorrecta");
			throw new IllegalArgumentException("Categoría o antigüedad incorrectos");
		}

		this.nombre = nombre;
		this.edad = edad;
		this.categoria = categoria;
		this.antiguedad = antiguedad;

	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) throws IllegalArgumentException {
		if (categoria < 0 || categoria > 2) {
			System.out.println("Categoria incorrecta");
			throw new IllegalArgumentException("Categoría o antigüedad incorrectos");
		}
		
		this.edad = edad;
	}



	public int getCategoria() {
		return categoria;
	}



	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}



	public int getAntiguedad() {
		return antiguedad;
	}



	public void setAntiguedad(int antiguedad) throws IllegalArgumentException{
		if (antiguedad < 0 || antiguedad > 2) {
			System.out.println("Antigüedad incorrecta");
			throw new IllegalArgumentException("Categoría o antigüedad incorrectos");
		}
		
		this.antiguedad = antiguedad;
	}

	public double calcularSueldo() {
		double sueldoBase = 607;

		if (this.categoria == 0) {
			sueldoBase += sueldoBase * 0.15;
		}
		if (this.categoria == 1) {
			sueldoBase += sueldoBase * 0.35;
		}
		if (this.categoria == 2) {
			sueldoBase += sueldoBase * 0.60;
		}

		switch (this.antiguedad) {
		case 0:
			sueldoBase += 150;
			break;
		case 1:
			sueldoBase += 300;
			break;
		case 2:
			sueldoBase += 600;
			break;
		}
		return sueldoBase;
	}
}
