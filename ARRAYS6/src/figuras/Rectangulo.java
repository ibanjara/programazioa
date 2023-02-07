package figuras;

public class Rectangulo extends Figura {
    public static double totalArea = 0;
    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        setArea(lado1 * lado2);
        setPerimetro(2 * (lado1 + lado2));
        totalArea += getArea();
        Figura.totalArea += getArea();
    }
}
