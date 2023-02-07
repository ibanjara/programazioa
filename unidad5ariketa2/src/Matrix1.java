import java.util.Scanner;

public class Matrix1 {

    Scanner sarrera = new Scanner(System.in);

    private int[][] matriz;

    private final static int NR = 10;
    private final static int NC = 15;

    public Matrix1() {
        this.matriz = new int[NC][NC];
    }

    public Matrix1(int zenbaki1, int zenbaki2) {
        this.matriz = new int[zenbaki1][zenbaki2];
    }

    public void loadByRows() {


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Eman zenbaki bat horizontalki sartzeko: ");
                int zenbakia = sarrera.nextInt();
                matriz[i][j] = zenbakia;
            }
        }
    }

    public void loadByColums() {


        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Eman zenbaki bat bertikalki sartzeko: ");
                int zenbakia = sarrera.nextInt();
                matriz[j][i] = zenbakia;
            }
        }
    }

    public void display() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void reverseRows() {
        for (int i = 0; i < matriz.length; i++) {
            int start = 0;
            int end = matriz[i].length - 1;
            while (start < end) {
                int temp = matriz[i][start];
                matriz[i][start] = matriz[i][end];
                matriz[i][end] = temp;
                start++;
                end--;

            }
        }
    }

    public void swapRows(int fila1, int fila2) {
        fila1--;
        fila2--;

        int[] temp = matriz[fila1];
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;

        if (matriz[fila2] == temp) {
            System.out.println("La operación ha sido exitosa");
        } else {
            System.out.println("La operación no ha sido exitosa");
        }

    }

    public void swapColumns(int columna1, int columna2){
        columna1--;
        columna2--;

        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][columna1];
            matriz[i][columna1] = matriz[i][columna2];
            matriz[i][columna2] = temp;

        }
            System.out.println("La operación ha sido exitosa");


    }

    public void greatestAvgRow(){
        int sum = 0;
        for (int i = 0; i < this.matriz.length; i++){
            for ( int j = 0; j < this.matriz[i].length; j++){
                System.out.print(this.matriz[i][j] + " ");
                sum += this.matriz[i][j];
            }
            System.out.print("Lerroaren bataz bestekoa: " + sum/this.matriz[i].length);
            System.out.println();
        }
    }

    public int[] negatives(){
        int negativeKont = 0;

        for (int i = 0; i< matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    negativeKont++;
                }
            }
        }

        int [] negatiboak = new int[negativeKont];
        int f = 0;
        for (int i = 0; i< this.matriz.length; i++){
            for (int j = 0; i< this.matriz[i].length; j++){
                if (this.matriz[i][j] <0 ){
                    negatiboak[f] = this.matriz[i][j];
                    i++;
                }
            }
        }
        return negatiboak;
    }
}