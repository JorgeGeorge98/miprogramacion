package entornosActividad18;

/**
 * Excepcion que saltara si en algun momento la cuenta o operacion a realizar son invalidos.
 * @author Jorge
 * @version 1.0
 */
public class CuentaException extends Exception{
    
	/**
	 * 	Mensaje que saldra a saltar la excepcion.
	 */
    private String msj;
    
    /**
     * Constructor de clase.
     * @param msj Mensaje que saldra por pantalla.
     */
    public CuentaException(String msj)
    {
        this.msj = msj;
    }
    
    /**
     * Metodo {@code toString} de la excepcion.
     */
    @Override
    public String toString()
    {
        return "Excepcion Cuenta: " + this.msj;
    }  
    
}
