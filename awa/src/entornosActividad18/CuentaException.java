package entornosActividad18;

public class CuentaException extends Exception{
    
    private String msj;
    
    public CuentaException(String msj)
    {
        this.msj = msj;
    }
    
    @Override
    public String toString()
    {
        return "Excepcion Cuenta: " + this.msj;
    }  
    
}
