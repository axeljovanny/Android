package utng.edu.mx.unidad1;

/**
 * Created by axel on 19/01/17.
 */

public class Ecuacion2 {
    private int resultado;
    private int X;

    private static Ecuacion2 ecuancion2;



    public static Ecuacion2 getEcuancion2() {
        if (ecuancion2 == null) {
            ecuancion2 = new Ecuacion2();
        }
        return ecuancion2;
    }
    public Ecuacion2() {

        this.X = 0;
        this.resultado= 0;

    }

    public int getResultado() {
        resultado = (X - 5) * (X - 5);
        return resultado;
    }


    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

}
