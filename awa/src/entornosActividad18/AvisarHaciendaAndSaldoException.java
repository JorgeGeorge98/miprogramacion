package entornosActividad18;

public class AvisarHaciendaAndSaldoException extends Exception {

    private String iban;
    private String titular;
    private String tipoOperacion;
    private double cantidad;
    private String msjSaldo;
    

    public AvisarHaciendaAndSaldoException(String iban, String titular, String tipoOperacion, double cantidad, String msjSaldo) 
    {
        this.iban = iban;
        this.titular = titular;
        this.tipoOperacion = tipoOperacion;
        this.cantidad = cantidad;
        this.msjSaldo = msjSaldo;
    }
    
    @Override
    public String toString()
    {
        String msj = "Aviso: El titular " + this.titular + " de la cuenta " + this.iban + " ha realizado un/a " + this.tipoOperacion + " de " + this.cantidad + "\n";
        msj += this.msjSaldo;
        return "Excepcion Avisar Hacienda y Saldo Negativo: \n" + msj;
    }  
    
}
