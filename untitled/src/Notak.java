import java.util.Scanner;

public class Notak {
    public static void main(String[] args) {

        Gela proba = new Gela();

        Scanner sarrera = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("Aukeratu:");
        System.out.println("1. Ikasle baten datuak sartu.");
        System.out.println("2. Ikaslearen izena eskatu eta izena eta nota (letraz) idatzi.");
        System.out.println("3. Ikasle guztien izena eta nota (letraz) idatzi.");
        System.out.println("4. Nota guztien batazbestekoa.");
        System.out.println("5. Nota altuena duen ikaslearen izena eta nota.");
        System.out.println("6. Nota baxuena duen ikaslearen izena eta nota.");
        System.out.println("7. Programa amaitu.");
        System.out.println("---------------------------------------------------------");
        System.out.print("Zure aukera:");
        int aukera = sarrera.nextInt();

        while (aukera != 0) {
            String ize;
            if (aukera == 1) {
                sarrera.nextLine();
                System.out.println("Sartu izena");
                ize = sarrera.nextLine();
                System.out.println("Sartu nota zenbakia");
                double not = sarrera.nextDouble();
                proba.sartuIkaslea(ize, not);
                System.out.println();
            } else if (aukera == 2) {
                sarrera.nextLine();
                System.out.println("Sartu izena");
                ize = sarrera.nextLine();
                proba.idatziIkasleBat(ize);
                System.out.println();
            } else if (aukera == 3) {
                proba.idatziGuztiak();
            } else {
                System.out.println("Ez duzu zenbakia egokia sartu");
            }
            System.out.println("---------------------------------------------------------");
            System.out.println("Aukeratu:");
            System.out.println("1. Ikasle baten datuak sartu.");
            System.out.println("2. Ikaslearen izena eskatu eta izena eta nota (letraz) idatzi.");
            System.out.println("3. Ikasle guztien izena eta nota (letraz) idatzi.");
            System.out.println("4. Nota guztien batazbestekoa.");
            System.out.println("5. Nota altuena duen ikaslearen izena eta nota.");
            System.out.println("6. Nota baxuena duen ikaslearen izena eta nota.");
            System.out.println("7. Programa amaitu.");
            System.out.println("---------------------------------------------------------");
            System.out.print("Zure aukera:");
            aukera = sarrera.nextInt();
        }
    }
}
