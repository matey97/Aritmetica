package aritmetica;

/**
 * Created by al341802 on 7/02/17.
 */
public class EcuacionLineal implements Ecuacion {
    private double a;
    private double b;

    public EcuacionLineal(double a,double b){
        this.a=a;
        this.b=b;
    }
    @Override
    public Resultado resuelveEcuacion() {
        Resultado res = new ResultadoLineal(-b/a);
        return res;
    }
}
