package empresa;

public class Main {
    public static void main(String[] args) {
        MobilePhone movil = new MobilePhone("684333686",69);
        Empleado ivan = new Empleado("ivan","12345678A", 180,65,40000,movil);

        System.out.println(ivan.toString());
        ivan.trabajo();
        ivan.trabajo();
        System.out.println(ivan.toString());
    }
}
