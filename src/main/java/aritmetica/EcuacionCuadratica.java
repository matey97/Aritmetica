package aritmetica;

/**
 * Created by al341802 on 7/02/17.
 */
public class EcuacionCuadratica implements Ecuacion {

    private float a;
    private float b;
    private float c;

    @Override
    public float resuelveEcuacion() {
        if (a==0)
            EcuacionLineal ecuacionlineal=new EcuacionLineal(b,c);
        else
    }
}
