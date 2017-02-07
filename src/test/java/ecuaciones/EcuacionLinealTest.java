package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aritmetica.EcuacionLineal;

public class EcuacionLinealTest {

	private EcuacionLineal ecuacionLineal;

	@Test
	public void terminoIndependienteCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		assertEquals(0,ecuacionLineal.resuelveEcuacion(),0);
	}

	@Test
	public void distintosDeCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		assertEquals(-1,ecuacionLineal.resuelveEcuacion(),0);
		
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		assertEquals(-1/2.0,ecuacionLineal.resuelveEcuacion(),0);
	}
}
