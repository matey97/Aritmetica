package aritmetica;

/**
 * Created by user on 8/02/17.
 */
public class ResultadoCuadratico implements Resultado{

    private double x1;
    private double i1;
    private double x2;
    private double i2;

    public ResultadoCuadratico(double x1, double x2){
        this.x1=x1;
        this.x2=x2;
        i1=i2=0;
    }

    public ResultadoCuadratico(Complejo x1, Complejo x2){
        this.x1=x1.getX();
        this.i1=x1.getI();
        this.x2=x2.getX();
        this.i2=x2.getI();
    }

    @Override
    public double getX1() {
        return x1;
    }

    @Override
    public double getX2() {

        return x2;
    }

    @Override
    public double getI1(){
        return i1;
    }

    @Override
    public double getI2(){
        return i2;
    }
}
