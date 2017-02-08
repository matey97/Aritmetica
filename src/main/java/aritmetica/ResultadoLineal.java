package aritmetica;

/**
 * Created by user on 8/02/17.
 */
public class ResultadoLineal implements Resultado{

    private double x;

    public ResultadoLineal(double x){
        this.x=x;
    }

    @Override
    public double getX1() {
        return this.x;
    }

    @Override
    public double getX2() {
        return 0;
    }

    @Override
    public double getI1() {
        return 0;
    }

    @Override
    public double getI2() {
        return 0;
    }
}
