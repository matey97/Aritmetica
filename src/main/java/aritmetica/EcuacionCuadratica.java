package aritmetica;

/**
 * Created by al341802 on 7/02/17.
 */
public class EcuacionCuadratica implements Ecuacion {

    private float a;
    private float b;
    private float c;

    @Override
    public double[] resuelveEcuacion() {
        if (a==0){
            EcuacionLineal ecuacionlineal=new EcuacionLineal(b,c);
            ecuacionlineal.resuelveEcuacion();
        }else{
            double numRaiz=Math.pow(b,2)-4*a*c;
            if (numRaiz<0){

            }else{

            }
        }
        return null;
    }
}
