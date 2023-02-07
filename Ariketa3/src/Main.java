import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sarrera = new Scanner(System.in);
        NumberStatistics datoak = new NumberStatistics(100);

        System.out.println("Sartu zenbakia (amaitzeko 0 sartu): ");
        double zenbakia = sarrera.nextDouble();
        datoak.addNumber(zenbakia);

        while(zenbakia !=0){
            System.out.println("Sartu zenbakia (amaitzeko 0 sartu): ");
            zenbakia=sarrera.nextDouble();
            datoak.addNumber(zenbakia);
        }

            System.out.println("Zenbaki kopurua: " + datoak.amountOfNumbers());
            System.out.println("Sartutako zenbakien media: " + datoak.showStatistics());
        }
    }
