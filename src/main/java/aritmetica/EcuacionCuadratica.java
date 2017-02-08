package aritmetica;

/**
 * Created by al341802 on 7/02/17.
 */

public class EcuacionCuadratica implements Ecuacion {

    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public Resultado resuelveEcuacion() {
        if (a==0)
            return noCuadratica();
        double numRaiz=Math.pow(b,2)-4*a*c;
        if (numRaiz>=0) {
            return solucionesReales();
        }
        return solucionesComplejas();
    }

    public Resultado noCuadratica(){
        EcuacionLineal ecuacionlineal = new EcuacionLineal(b, c);
        return ecuacionlineal.resuelveEcuacion();
    }

    public Resultado solucionesReales(){
        double numRaiz=Math.pow(b,2)-4*a*c;
        double raiz = Math.sqrt(numRaiz);
        double resA = (-b + raiz) / (2 * a);
        double resB = (-b - raiz) / (2 * a);
        return new ResultadoCuadratico(resA, resB);
    }

    public Resultado solucionesComplejas(){
        double numRaiz=Math.pow(b,2)-4*a*c;
        Complejo resA = new Complejo(-b/(2*a),Math.sqrt(-numRaiz)/(2*a));
        Complejo resB = new Complejo(-b/(2*a),-Math.sqrt(-numRaiz)/(2*a));
        return new ResultadoCuadratico(resA, resB);
    }
}
