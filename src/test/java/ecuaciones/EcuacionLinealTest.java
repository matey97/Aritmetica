package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aritmetica.EcuacionLineal;

public class EcuacionLinealTest {

	private EcuacionLineal ecuacionLineal;
	double[] res;
	@Before
	public void init(){
		res = new double[1];
	}
	@Test
	public void terminoIndependienteCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		res[0]=0;
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
	}

	@Test
	public void distintosDeCeroTest() {
		ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		res[0]=-1;
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
		
		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		res[0]=-1/2.0;
		assertEquals(res,ecuacionLineal.resuelveEcuacion());
	}
}
