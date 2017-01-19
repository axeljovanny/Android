package utng.edu.mx.unidad1;

/**
 * Created by axel on 19/01/17.
 */

public class Ecuancion1 {
    private int resultado;
    private int Y;

    private static Ecuancion1 ecuancion1;



    public static Ecuancion1 getEcuancion1() {
        if (ecuancion1 == null) {
            ecuancion1 = new Ecuancion1();
        }
        return ecuancion1;
    }
    public Ecuancion1() {

        this.Y = 0;
        this.resultado= 0;

    }

    public int getResultado() {
        resultado = (Y + 6) * (Y+ 6);
        return resultado;
    }


    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public static void setEcuancion1(Ecuancion1 ecuancion1) {
        Ecuancion1.ecuancion1 = ecuancion1;
    }
}
