package agenda;

import java.util.ArrayList;

public class Agenda {
	
	ArrayList<Contacto> agenda;
	
	public Agenda() {
		agenda=new ArrayList<Contacto>();
	}
	
	public boolean anadirContactos(Contacto c) {
		
		for(int i=0; i<agenda.size(); i++) {
			
			if(c.getNombre().equals(agenda.get(i).getNombre())) {
				return false;
			} 
		}
		agenda.add(c);
		System.out.println("Se ha añadido correctamente.");
		return true;	
	}
	
	public boolean eliminarContacto(String nombre){
		
		for(int i=0; i<agenda.size(); i++) {
			if(nombre.equals(agenda.get(i).getNombre())) {
				agenda.remove(i);
				System.out.println("Se ha eliminado correctamente");
				return true;
			}
		}
		return false;
	}
	
	public boolean existeContacto(String nombre) {
		
		for(int i=0; i<agenda.size(); i++) {
			if(nombre.equals(agenda.get(i).getNombre())) {
				return true;
			}
		}
		return false;
	}
	
	public void listarContactos() {
		
		for(Contacto c : agenda) {
			System.out.println("-"+c.getNombre()+" / "+c.getTelefono());
		}
	}
	
	public int buscaContacto(String nombre) {
		
		for(int i=0; i<agenda.size(); i++) {
			if(nombre.equals(agenda.get(i).getNombre())) {
				return i;
			}
		}
		System.out.println("No se ha encontrado el contacto");
		return -1;
	}
	
	
	
	
}
