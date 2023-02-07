package figuras;

public class Circulo extends Figura {
    public static double totalArea = 0;
    private double radio;
    private static final double PI = 3.14;

    public Circulo(double radio) {
        super();
        this.radio = radio;
        setArea(PI * radio * radio);
        setPerimetro(2 * PI * radio);
        totalArea += getArea();
        Figura.totalArea += getArea();
    }
}
