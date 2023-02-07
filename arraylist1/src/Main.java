import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int aux = 1;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Eman zenbaki bat: ");
        int n = sarrera.nextInt();

        List<Integer> aldagaia = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            if (n % aux == 0) {
                aldagaia.add(aux);
            }
            aux++;
        }

        mostrar(aldagaia);
        aldagaia.removeAll(aldagaia);
        System.out.println();

        generador(aldagaia);
        mostrar(aldagaia);
        aldagaia.removeAll(aldagaia);
        System.out.println();

        generadorSinRepetir(aldagaia);
        mostrar(aldagaia);
    }

    public static void mostrar(List<Integer> aldagaia) {
        for (int i = 0; i < aldagaia.size(); i++) {
            System.out.println(aldagaia.get(i));
        }
    }
    public static void generador(List<Integer> aldagaia) {
        for (int i = 0; i < 20; i++) {
            aldagaia.add((int) (Math.random() * (100 - -100) - 100));
        }
    }
    public static void generadorSinRepetir(List<Integer> aldagaia) {
        int kont = 0;
        while(kont !=20) {
            int zenbakia = (int) (Math.random() * (20 - -20) - 20);
            if (!aldagaia.contains(zenbakia)){
                aldagaia.add(zenbakia);
                kont++;
            }
        }
    }
}