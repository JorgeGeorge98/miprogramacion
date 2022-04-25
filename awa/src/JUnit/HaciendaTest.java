package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HaciendaTest {

	@Test
	public void test() {
		assertEquals(73500.245, RetencionHacienda.seLlevan(300001));
	}

}
