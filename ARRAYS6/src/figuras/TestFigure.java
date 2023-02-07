package figuras;

public class TestFigure {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        Cuadrado cuadrado = new Cuadrado(3);
        Rectangulo rectangulo = new Rectangulo(4, 5);


        System.out.println("Área del círculo: " + circulo.getArea());
        System.out.println("Área del cuadrado: " + cuadrado.getArea());
        System.out.println("Área del rectángulo: " + rectangulo.getArea());
        System.out.println("Área total: " + Figura.totalArea);


        Circulo circulo2 = new Circulo(3);
        Circulo circulo3 = new Circulo(1);


        System.out.println("Área total de los círculos: " + Circulo.totalArea);


        AreaFiguras areaFiguras = new AreaFiguras(2);


        areaFiguras.addFigure(cuadrado);
        areaFiguras.addFigure(rectangulo);
        areaFiguras.addFigure(circulo);

        areaFiguras.printTotalArea();

    }
}