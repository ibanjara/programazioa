public class Main {
    public static void main(String[] args) throws FractionException {



        try{
            Fraccion test = new Fraccion(1,2);
            Fraccion test2 = new Fraccion(0,3);
            System.out.println("Gehiketa: " + test.sumar(test2));
            System.out.println("Kenketa: " + test.restar(test2));
            System.out.println("Biderketa: " + test.multiplicar(test2));
            System.out.println("Zatiketa: " + test.dividir(test2));
        }
        catch(FractionException e) {
            System.out.println(e);
        }
    }
}