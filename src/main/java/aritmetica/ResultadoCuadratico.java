package aritmetica;

/**
 * Created by user on 8/02/17.
 */
public class ResultadoCuadratico implements Resultado {

    private double x1;
    private double x2;

    public ResultadoCuadratico(double x1, double x2){
        this.x1=x1;
        this.x2=x2;
    }

    @Override
    public double getX1() {
        return x1;
    }

    @Override
    public double getX2() {
        return x2;
    }
}
