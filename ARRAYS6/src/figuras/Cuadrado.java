package figuras;

public class Cuadrado extends Figura {
    public static double totalArea = 0;
    private double lado;

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
        setArea(lado * lado);
        setPerimetro(4 * lado);
        totalArea += getArea();
        Figura.totalArea += getArea();
    }
}
