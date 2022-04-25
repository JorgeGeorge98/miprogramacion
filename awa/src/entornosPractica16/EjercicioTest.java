package entornosPractica16;

import static org.junit.Assert.*;

import java.util.InputMismatchException;

import org.junit.Test;

public class EjercicioTest {

	@Test
	public void test() {
		assertEquals(5, Ejercicio.getParteEntera(5.6));
		assertEquals(6, Ejercicio.getParteDecimal(5.6));
		assertEquals(0, Ejercicio.getParteDecimal(15));
		
	}
	
	@Test
	public void test2() {
		assertEquals(InputMismatchException.class, Ejercicio.getParteEntera('a'));
	}
	
	@Test
	public void test3() {
		assertEquals(InputMismatchException.class, Ejercicio.getParteDecimal('a'));
	}

}
