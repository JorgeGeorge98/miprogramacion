package entornosPractica14;

public class CuentaException extends Exception{
    
    private String msj;
    
    public CuentaException(String msj)
    {
        this.msj = msj;
    }
    
    @Override
    public String toString()
    {
        return "Excepción Cuenta: " + this.msj;
    }  
    
}
