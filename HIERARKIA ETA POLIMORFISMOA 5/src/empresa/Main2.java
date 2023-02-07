package empresa;

public class Main2 {

    public static void main(String[] args) {
        MobilePhone movil = new MobilePhone("684333686",69);
        Empleado ivan = new Empleado("ivan","12345678A", 180,65,40000,movil);

        MobilePhone movil2 = new MobilePhone("666666666",69);
        Empleado iker = new Empleado("iker","87654321A", 180,65,40000,movil2);

        Empresa juegos = new Empresa("Webplay",5531, ivan);

        juegos.hireManager(iker);
        System.out.println(juegos.toString());

        juegos.trabajo();
        juegos.trabajo();

        System.out.println(juegos.toString());
    }
}
