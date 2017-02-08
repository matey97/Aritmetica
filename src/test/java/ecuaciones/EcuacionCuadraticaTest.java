package ecuaciones;

import aritmetica.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by al341802 on 7/02/17.
 */

public class EcuacionCuadraticaTest {

    private EcuacionCuadratica ecuacioncuadratica;
    private Resultado res;

    @Test
    public void noCuadraticaTest(){
        ecuacioncuadratica = new EcuacionCuadratica(0,1,1);
        assertEquals(-1,ecuacioncuadratica.resuelveEcuacion().getX1(),0);

        ecuacioncuadratica = new EcuacionCuadratica(0,1,0);
        assertEquals(-0,ecuacioncuadratica.resuelveEcuacion().getX1(),0);
    }

    @Test
    public void solucionesReales(){
        ecuacioncuadratica = new EcuacionCuadratica(1,-5,6);
        res = new ResultadoCuadratico(3,2);
        assertEquals(res.getX1(),ecuacioncuadratica.resuelveEcuacion().getX1(),0);
        assertEquals(res.getX2(),ecuacioncuadratica.resuelveEcuacion().getX2(),0);

        ecuacioncuadratica = new EcuacionCuadratica(1,-2,1);
        res = new ResultadoCuadratico(1,1);
        assertEquals(res.getX1(),ecuacioncuadratica.resuelveEcuacion().getX1(),0);
        assertEquals(res.getX2(),ecuacioncuadratica.resuelveEcuacion().getX2(),0);
    }

    @Test
    public void solucionesComplejas(){
        ecuacioncuadratica = new EcuacionCuadratica(1,-2,5);
        res = new ResultadoCuadratico(new Complejo(1,2),new Complejo(1,-2));
        assertEquals(res.getX1(),ecuacioncuadratica.resuelveEcuacion().getX1(),0);
        assertEquals(res.getX2(),ecuacioncuadratica.resuelveEcuacion().getX2(),0);
        assertEquals(res.getI1(),ecuacioncuadratica.resuelveEcuacion().getI1(),0);
        assertEquals(res.getI2(),ecuacioncuadratica.resuelveEcuacion().getI2(),0);

    }


}
