package metodosGenericos;

public class Mainainain {
	
	public static void main(String[] args) {
		
		SafeBox<String, String> box = new SafeBox<>("Mensaje oculto","1234");
		
		System.out.println("Mensaje: "+box.getInfo("4321"));
		System.out.println("Mensaje: "+box.getInfo("1234"));
		
	}

}
