package practicaTema14;

public class Ejer4 {
	
	public static void imprimePositivo(int p) throws Exception{
		if(p < 0) {
			throw new Exception("El numero debe ser positivo");
			}
	}
	
	public static void imprimeNegativo(int n) throws Exception {
		if(n >= 0) {
			throw new Exception("El numero debe ser negativo");
		}
	}
}
