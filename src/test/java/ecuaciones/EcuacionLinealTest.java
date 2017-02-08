package ecuaciones;

import static org.junit.Assert.*;

import aritmetica.Resultado;
import aritmetica.ResultadoLineal;
import org.junit.Test;

import aritmetica.EcuacionLineal;

public class EcuacionLinealTest {

	private EcuacionLineal ecuacionLineal;
	private Resultado res;


	@Test
	public void terminoIndependienteCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		res = new ResultadoLineal (-0);
		assertEquals(res.getX1(),ecuacionLineal.resuelveEcuacion().getX1(),0);
	}

	@Test
	public void distintosDeCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		res = new ResultadoLineal (-1/1.0);
		assertEquals(res.getX1(),ecuacionLineal.resuelveEcuacion().getX1(),0);

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		res = new ResultadoLineal (-1/2.0);
		assertEquals(res.getX1(),ecuacionLineal.resuelveEcuacion().getX1(),0);
	}
}
