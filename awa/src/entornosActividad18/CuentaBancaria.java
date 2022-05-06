package entornosActividad18;

import java.util.ArrayList;

/**
 * Esta clase se usara para crear cuentas bancarias, incluiran el IBAN, el nombre del titular, el saldo, lo movimientos que se hagan y un boolean el cual certificara que la cuenta sea valida. 
 * @author Jorge
 * @version 1.0
 *
 */
public class CuentaBancaria {

	/**
	 * IBAN de la cuenta bancaria.
	 * @see #getIban()
	 */
	private final String iban;
	/**
	 * Nombre del titular de la cuenta bancaria.
	 * @see #getTitular()
	 */
	private final String titular;

	/**
	 * Saldo de la cuenta.
	 * @see #getSaldo()
	 */
	private double saldo;
	/**
	 * ArrayList que almacenara los movimientos que haga la cuenta.
	 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">ArrayList</a>
	 */
	private ArrayList movimientos;

	/**
	 * Esta constante corresponde al saldo minimo que puede tener la cuenta.
	 */
	private static final double SALDO_MINIMO = -50.0;
	/**
	 * Si algun movimiento es mayor al valor indicado en esta constante se lanzara la excepcion {@code AvisarHaciendaException}.
	 * @see AvisarHaciendaException
	 */
	private static final double AVISAR_HACIENDA = 3000.0;

	/**
	 * Boolean el cual certifica si la cuenta es valida o no.
	 */
	private boolean valida;

	/**
	 * Constructor de la clase CuentaBancaria, recibe por parametro el IBAN y el nombre del Titular, por defecto el saldo se coloca a 0 y crea un {@code ArrayList} para almacenar los movimientos que realize la cuenta.
	 * <br> Si el IBAN es incorrecto se lanzara un {@code CuentaException} y la cuenta no sera valida.
	 * @param iban String que contendra el IBAN de la cuenta bancaria.
	 * @param titular String que contendra el nombre del titular de la cuenta.
	 * @throws CuentaException Excepcion especificada en {@link CuentaException}.
	 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">ArrayList</a>
	 * @see <a href="https://www.bbva.com/es/salud-financiera/swift-e-iban/">Formato del IBAN</a>
	 */
	public CuentaBancaria(String iban, String titular) throws CuentaException {

		this.iban = iban;
		this.titular = titular;

		this.saldo = 0.0;
		this.movimientos = new ArrayList();

		/**
		 * Controla que el IBAN sea correcto.
		 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#matches(java.lang.String)">String.matches Function</a>
		 */
		if (!iban.matches("^[A-Z]{2}\\d{22}")) {
			this.valida = false;
			throw new CuentaException("El formato del IBAN no es correcto");
		} else {
			this.valida = true;
		}
	}

	/**
	 * 	Getter del atributo IBAN
	 * @return IBAN
	 */
	public String getIban() {
		return iban;
	}

	/**
	 * Getter del atributo titular
	 * @return Nombre del titular de la cuenta.
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @return Saldo que tiene la cuenta.
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Getter del atributo valida, el cual se encarga certificar que la cuenta sea valida o no.
	 * @return Boolean valida.
	 */
	public boolean getValida() {
		return valida;
	}

	/**
	 * Metodo intermedio que actuara cuando se quiera ingresar dinero a la cuenta. Pasara como parametro a {@link #operar(double)} un numero positivo.
	 * @param cantidad Double que representa la cantidad de dinero que se va a ingresar.
	 * @return {@link #operar(double)}
	 * @throws CuentaException Si la cantidad de dinero a ingresar es menor a 0, saltara {@link CuentaException}.
	 * @throws AvisarHaciendaException {@link AvisarHaciendaException}
	 * @throws Exception
	 */
	public boolean ingresar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception {
		if (cantidad <= 0) {
			throw new CuentaException("La cantidad a ingresar debe ser mayor que 0");
		}
		return operar(cantidad);
	}

	/**
	 * Metodo intermedio que actuara cuando se quiera retirar dinero de la cuenta. Pasara como parametro a {@link #operar(double)} un numero negativo.
	 * @param cantidad Double que representa la cantidad de dinero que se va a retirar.
	 * @return {@link #operar(double)}
	 * @throws CuentaException Si la cantidad de dinero a retirar es menor a 0, saltara {@link CuentaException}.
	 * @throws AvisarHaciendaException {@link AvisarHaciendaException}
	 * @throws Exception
	 */
	public boolean retirar(double cantidad) throws CuentaException, AvisarHaciendaException, Exception {
		if (cantidad <= 0) {
			throw new CuentaException("La cantidad a retirar debe ser mayor que 0");
		}
		return operar(-cantidad);
	}

	/**
	 * Este es el metodo que se encarga de hacer la operacion con la cantidad que se le pase por parametro, la cantidad se sumara al saldo, si la cantidad es negativa se sacara la cantidad del saldo. La transaccion se agregara al {@code ArrayList} de {@link #movimientos}. 
	 * @param cantidad La cantidad de dinero con la que se va a operar.
	 * @return True, si la transaccion se ha completado con exito.
	 * @throws CuentaException Si el saldo en la cuenta mas la cantidad a operar es menor a {@link #SALDO_MINIMO}, saltara {@link CuentaException}.
	 * @throws AvisarHaciendaException Si la cantidad se mayor a {@link #AVISAR_HACIENDA}.
	 * @throws AvisarHaciendaAndSaldoException Si la cantidad es mayor a {@link #AVISAR_HACIENDA} y el saldo es negativo.
	 * @throws Exception Si el saldo queda en negativo.
	 * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#abs(int)">Math.abs</a>
	 */
	private boolean operar(double cantidad)
			throws CuentaException, AvisarHaciendaException, AvisarHaciendaAndSaldoException, Exception {

		if (saldo + cantidad < SALDO_MINIMO) {
			throw new CuentaException(
					"La operacion no se puede realizar porque tendriamos un saldo inferior a SALDO_MINIMO");
		}

		saldo += cantidad;
		movimientos.add(cantidad);

		if ((saldo < 0.0) && (Math.abs(cantidad) > AVISAR_HACIENDA)) {
			throw new AvisarHaciendaAndSaldoException(this.getIban(), this.getTitular(), tipoOperacion(cantidad),
					Math.abs(cantidad), "Aviso: Saldo en cuenta negativo");
		} else if (saldo < 0.0) {
			throw new Exception("Aviso: Saldo en cuenta negativo");
		} else if (Math.abs(cantidad) > AVISAR_HACIENDA) {
			throw new AvisarHaciendaException(this.getIban(), this.getTitular(), tipoOperacion(cantidad),
					Math.abs(cantidad));
		}

		return true;
	}

	/**
	 * Regresara un String con el tipo de operacion que se haya realizado segun la cantidad que entra por parametro.
	 * @param cantidad Cantidad con la que se ha hecho la operacion.
	 * @return String con el tipo de operacion realizado, puede ser {@code "INGRESO"} si la cantidad es positiva o {@code "RETIRADA"} si la cantidad es negativa.
 	 */
	private String tipoOperacion(double cantidad) {
		String tipoOperacion = "";

		if (cantidad > 0) {
			tipoOperacion = "INGRESO";
		} else if (cantidad < 0) {
			tipoOperacion = "RETIRADA";
		}

		return tipoOperacion;

	}

	/**
	 * Ejecuta las funciones {@link #imprimirDatos()} e {@link #imprimirMovimientos()}.
	 */
	public void imprimir() {
		imprimirDatos();
		imprimirMovimientos();
	}

	/**
	 * Imprime el IBAN de la cuenta, nombre del titular y el saldo actual.
	 */
	public void imprimirDatos() {
		System.out.println("IBAN: " + getIban() + " - Titular: " + getTitular() + " - Saldo: " + getSaldo());
	}

	/**
	 * Imprime el {@code ArrayList} de movimientos realizados.
	 */
	public void imprimirMovimientos() {
		System.out.println("Movimientos: " + movimientos.size());
		for (int i = 0; i < movimientos.size(); i++) {
			System.out.println("#" + (i + 1) + ": " + movimientos.get(i));
		}
	}

}
