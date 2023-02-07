import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sarrera = new Scanner(System.in);
        double gehiketa = 0;
        double totala = 0;

        System.out.println("Zenbat ikasle daude klasean? ");
        int ikasleKop = sarrera.nextInt();

        double[] ikasleak = new double[ikasleKop];

        for(int i = 0; i< ikasleak.length; i++){
            System.out.println("Eman nota bat: ");
            double nota = sarrera.nextDouble();
            ikasleak[i] = nota;
        }

        for (int i = 0; i < ikasleak.length; i++){
            gehiketa = gehiketa + ikasleak[i];
            totala = gehiketa/ikasleak.length;
        }

        for (int i = 0; i < ikasleak.length; i++){
            if(ikasleak[i] > totala){
                System.out.println(ikasleak[i]);
            }
        }
    }
}