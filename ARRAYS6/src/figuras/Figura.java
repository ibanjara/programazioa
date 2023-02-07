package figuras;

public abstract class Figura {
    private double area;
    private double perimetro;
    public static double totalArea = 0;

    public Figura() { }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
