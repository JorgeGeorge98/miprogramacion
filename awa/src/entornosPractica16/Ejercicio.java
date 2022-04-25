package entornosPractica16;

public class Ejercicio {

    // Para ejecutar el código con Ejercicio.NombreDelMetodo() puedes tirarlo adelante.

    public static int getParteEntera(double d){
        String [] a = Double.toString(d).replace('.','-').split("-");
        return Integer.parseInt(a[0]);
    }
    public static int getParteDecimal(double d){
        String [] a = Double.toString(d).replace('.','-').split("-");
        return Integer.parseInt(a[1]);

    }
}