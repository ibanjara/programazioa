import java.util.Scanner;

public class Liburutegia {

    public Liburutegia(){}

    public static boolean bikoitia(int zenbakia){
        boolean ba0te = false;
        if(zenbakia % 2 == 0){
            ba0te = true;
        }
        return ba0te;
    }

    public static int zenbatDigitu(int zenb){
        int kont = 0;
        while (zenb!=0){
            zenb=zenb/10;
            kont++;
        }
        return kont;
    }

    public static boolean bostDauzka (int zenbak){
        int zenbKopurua = zenbatDigitu(zenbak);
        boolean ba0te = false;
        if(zenbKopurua>5){
            ba0te = true;
        }
        return ba0te;
    }

    public static void multiplo10(){

        int multiploa = 0;
        Scanner sarrera = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat");
        multiploa = sarrera.nextInt();
        if(multiploa%10==0){
            System.out.println("Zuk sartutako zenbakia 10en multiplokoa da");
        }else{
            System.out.println("Zuk sartutako zenbakai ez da 10en multiplokoa");
        }
    }
}
