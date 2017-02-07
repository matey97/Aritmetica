package aritmetica;

/**
 * Created by al341802 on 7/02/17.
 */
public class EcuacionLineal implements Ecuacion {
    private float a;
    private float b;

    public EcuacionLineal(float a,float b){
        this.a=a;
        this.b=b;
    }
    @Override
    public float resuelveEcuacion() {
        return -b/a;
    }
}
