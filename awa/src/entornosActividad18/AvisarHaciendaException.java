package entornosActividad18;

/**
 * Excepcion que saltara cuando se haga alguna transaccion mayor a {@code AVISAR_HACIENDA}.
 * @author Jorge
 * @version 1.0
 */
public class AvisarHaciendaException extends Exception {
    // Atributos
    private String iban;
    private String titular;
    private String tipoOperacion;
    private double cantidad;
    
    // Constructor
    /**
     * Constructor de clase.
     * @param iban 
     * @param titular
     * @param tipoOperacion
     * @param cantidad
     */
    public AvisarHaciendaException(String iban, String titular, String tipoOperacion, double cantidad) 
    {
        this.iban = iban;
        this.titular = titular;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
    }
    
    /**
     * Metodo {@code toString} de la excepcion.
     */
    @Override
    public String toString()
    {
        String msj = "Aviso: El titular " + this.titular + " de la cuenta " + this.iban + " ha realizado un/a " + this.tipoOperacion + " de " + this.cantidad;
        return "Excepción Avisar Hacienda: " + msj;
    }  
    
}
