package aritmetica;

/**
 * Created by user on 8/02/17.
 */
public class ResultadoLineal implements Resultado{

    private float x;

    public ResultadoLineal(float x){
        this.x=x;
    }

    @Override
    public boolean equals(Resultado res) {
        return this.x==res.getX1();
    }

    @Override
    public float getX1() {
        return this.x;
    }

    @Override
    public float getX2() {
        return 0;
    }
}
