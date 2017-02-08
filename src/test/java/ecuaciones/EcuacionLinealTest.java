package ecuaciones;

import static org.junit.Assert.*;

import aritmetica.ResultadoLineal;
import org.junit.Before;
import org.junit.Test;

import aritmetica.EcuacionLineal;

public class EcuacionLinealTest {

	private EcuacionLineal ecuacionLineal;
	private ResultadoLineal res;


	@Test
	public void terminoIndependienteCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		res = new ResultadoLineal (0);
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
	}

	@Test
	public void distintosDeCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		res = new ResultadoLineal (-1);
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
		
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		res = new ResultadoLineal (-1/2);
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
	}
}
