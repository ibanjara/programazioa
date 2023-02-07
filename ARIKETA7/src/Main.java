import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sarrera = new Scanner(System.in);

        System.out.print("Sartu rektaren lodiera: ");
        int lodiera1 = sarrera.nextInt();

        System.out.print("Sartu rektaren X: ");
        int x1 = sarrera.nextInt();

        System.out.print("Sartu rektaren Y: ");
        int y1 = sarrera.nextInt();

        System.out.print("Sartu rektaren lodiera: ");
        int lodiera2 = sarrera.nextInt();

        System.out.print("Sartu rektaren X: ");
        int x2 = sarrera.nextInt();

        System.out.print("Sartu rektaren Y: ");
        int y2 = sarrera.nextInt();

        Recta datuak = new Recta(lodiera1,lodiera2,x1,x2,y1,y2);


        datuak.horizontala();
    }
}