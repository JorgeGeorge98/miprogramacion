package entornosActividad18;

/**
 * Excepcion que saltara si se realiza alguna transaccion mayor a {@code AVISAR_HACIENDA} y el saldo de la cuenta queda en negativo.
 * @author Jorge
 * @version 1.0
 */
public class AvisarHaciendaAndSaldoException extends Exception {

    private String iban;
    private String titular;
    private String tipoOperacion;
    private double cantidad;
    private String msjSaldo;
    
    /**
     * Constructor de clae.
     * @param iban
     * @param titular
     * @param tipoOperacion
     * @param cantidad
     * @param msjSaldo
     */
    public AvisarHaciendaAndSaldoException(String iban, String titular, String tipoOperacion, double cantidad, String msjSaldo) 
    {
        this.iban = iban;
        this.titular = titular;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
        this.msjSaldo = msjSaldo;
    }
    
    /**
     * Metodo {@code toString} de la excepcion.
     */
    @Override
    public String toString()
    {
        String msj = "Aviso: El titular " + this.titular + " de la cuenta " + this.iban + " ha realizado un/a " + this.tipoOperacion + " de " + this.cantidad + "\n";
        msj += this.msjSaldo;
        return "Excepcion Avisar Hacienda y Saldo Negativo: \n" + msj;
    }  
    
}
