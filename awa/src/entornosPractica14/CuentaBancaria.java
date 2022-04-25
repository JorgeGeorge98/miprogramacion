package entornosPractica14;

import java.util.ArrayList;

public class CuentaBancaria {

	// Atributos constantes (final)
	private final String iban;
	private final String titular;

	// Atributos variables
	private double saldo;
	private ArrayList<Double> movimientos;

	// Atributos constantes de clase (static final)
	private static final double SALDO_MINIMO = -50.0;
	private static final double AVISAR_HACIENDA = 3000.0;

	// Cuenta valida
	private boolean valida;

	// Constructor
	public CuentaBancaria(String iban, String titular) throws CuentaException {

		// Guardamos iban y titular
		
		if(comprobarIBAN(iban)) {
			this.iban = iban;
		} else {
			throw new CuentaException("El IBAN no es valido");
		}
			
		this.titular = titular;

		// Inicilizamos saldo y movimientos
		this.saldo = 0.0;
		this.movimientos = new ArrayList<Double>();

		// Registramos si es una cuenta valida o no
		this.valida = true;
	}

	public String getIban() {
		return iban;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean getValida() {
		return valida;
	}


	public boolean ingresar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception {
		
		//Aviso
		if(cantidad < 0) {
			throw new CuentaException("La cantidad de ingreso no puede ser negativa.");
		}
		
		return operar(cantidad);
	}


	public boolean retirar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception {
		
		//Avisos
		if(cantidad < 0) { 
			throw new CuentaException("La cantidad a retirar no puede ser negativa.");
		}
		
		if(saldo - cantidad < SALDO_MINIMO) {
			throw new CuentaException("Fondos insuficientes");
		}
		
		return operar(-cantidad);
	}


	private boolean operar(double cantidad) throws AvisarHaciendaException, Exception {

		// Realizamos la operacion: actualizamos saldo y movimientos
		saldo += cantidad;
		movimientos.add(cantidad);

		// Avisos
		if(cantidad > AVISAR_HACIENDA) {
			throw new AvisarHaciendaException(iban, titular, tipoOperacion(cantidad), cantidad);
		}
		
		if(saldo < 0) {
			throw new Exception("La cantidad de dinero en tu cuenta es negativa!!!");
		}
		
		// La operacion fue posible
		return true;
	}

	private String tipoOperacion(double cantidad) {
		String tipoOperacion = "";

		if (cantidad > 0) {
			tipoOperacion = "INGRESO";
		} else if (cantidad < 0) {
			tipoOperacion = "RETIRADA";
		}

		return tipoOperacion;

	}

	// Imprimir informacion de la cuenta
	public void imprimir() {
		imprimirDatos();
		imprimirMovimientos();
	}

	// Imprimir datos de la cuenta
	public void imprimirDatos() {
		System.out.println("IBAN: " + getIban() + " - Titular: " + getTitular() + " - Saldo: " + getSaldo());
	}

	// Imprimir movimientos realizados
	public void imprimirMovimientos() {
		System.out.println("Movimientos: " + movimientos.size());
		for (int i = 0; i < movimientos.size(); i++) {
			System.out.println("#" + (i + 1) + ": " + movimientos.get(i));
		}
	}
	
	public boolean comprobarIBAN(String iban) {
		
		boolean mayus = false;
		boolean	tamano = false;
		boolean guionOespacio = false;
		
		if(iban.toCharArray()[0] >= 65 && iban.toCharArray()[0] <= 90 && iban.toCharArray()[1] >= 65 && iban.toCharArray()[1] <= 90) {
			mayus = true;
		}
		
		if(iban.length()==24) {
			tamano = true;
		}
		
		for(int i=0; i<iban.length(); i++) {
			if(iban.toCharArray()[i]=='-' || iban.toCharArray()[i]==' ') {
				guionOespacio = true;
			}
		}
		
		if(mayus == true && tamano == true && guionOespacio == false) {
			return true;
		} else {
			return false;
		}
	}

}
