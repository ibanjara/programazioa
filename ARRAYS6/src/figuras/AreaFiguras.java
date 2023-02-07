package figuras;

public class AreaFiguras {
    private Figura[] figuras;
    private int contador;
    private double totalArea;

    public AreaFiguras(int maxFiguras) {
        figuras = new Figura[maxFiguras];
        contador = 0;
    }

    public void addFigure(Figura figura) {
        if (contador < figuras.length) {
            figuras[contador] = figura;
            contador++;
            totalArea += figura.getArea();
        } else {
            System.out.println("No se pueden agregar más figuras. La capacidad máxima de figuras ha sido alcanzada.");
        }
    }

    public double calculateTotalArea() {
       totalArea = 0;
        for (int i = 0; i < contador; i++) {
            totalArea += figuras[i].getArea();
        }
        return totalArea;
    }

    public void printTotalArea() {
        System.out.println("El área total de las figuras en el array es: " + calculateTotalArea());
    }


}
