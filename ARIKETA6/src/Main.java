import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Punto puntuBat = new Punto(4, 6);
        Punto puntuBi = new Punto(5, 3);
        Zuzena zuzenBat = new Zuzena(2, puntuBat, puntuBi);
        Zuzena zuzenBi = new Zuzena(2, 1, 2, 2, 3);

        if (zuzenBat.horizontalaDa()) {
            System.out.println("Zuzena da");
        } else {
            System.out.println("Ez da zuzena");
        }

        if (zuzenBat.bertikalaDa()) {
            System.out.println("Bertikala da");
        } else {
            System.out.println("Ez da bertikala");
        }

        System.out.println("Zuzen hortako punturik altuena da: ");
        zuzenBat.erakutsiPuntua(zuzenBat.punturikAltuena());
        System.out.println("Zuzen horren luzeroa da: " + zuzenBat.luzera());
        System.out.println("Bietan zuzenik luzeena da: ");
        zuzenBat.erakutsi();
    }
}







        Scanner sarrera = new Scanner(System.in);

        System.out.print("Sartu X koordenatua: ");
        int x = sarrera.nextInt();

        System.out.print("Sartu Y koordenatua: ");
        int y = sarrera.nextInt();
        Punto datuak = new Punto(x,y);

        datuak.idatzi();
        datuak.koadrante();







        /*

        Circunferencia borobil = new Circunferencia(2, "gorria");
        System.out.println("Zuk sartutako borobilaren area da: " + borobil.area());
        borobil.printPerimeter();

        if(borobil.isBig()){
            System.out.println("Zuk sartutako borobila handia da");
        } else{
            System.out.println("Zuk sartutako borobila ez da handia");
        }

        Circunferencia borobil2 = new Circunferencia(2, "gorria");
        Circunferencia borobil3 = new Circunferencia(3, "gorria");
        if(borobil.isEqualTo(borobil2)){
            System.out.println("Zuk sartutako bi borobilak berdinak dira");
        } else{
            System.out.println("Zuk sartutako borobilak ez dira berdinak");
        }

        if(borobil.isEqualTo(borobil3)){
            System.out.println("Zuk sartutako borobilak berdinak dira");
        } else{
            System.out.println("Zuk sartutako borobilak ez dira berdinak");
        }

        borobil.show();

        */



        /*
        if(Liburutegia.bikoitia(10)){
            System.out.println("Sartutako zenbakia bikoitia da");
        }else{
            System.out.println("Sartutako zenbakia ez da bikoitia");
        }
        System.out.println("Sartutako zenbakiaren digito kopurua da: " + Liburutegia.zenbatDigitu(2345));
        if(Liburutegia.bostDauzka(2345)){
            System.out.println("Zuk sartutako zenbakiak 5 digito edo gehiago ditu");
        }else{
            System.out.println("Zuk sartutako zenbakiak 5 digito baino gutxiago ditu");
        }
        Liburutegia.multiplo10();

        */

        Pertsona datuak = new Pertsona("Ivan", "Gizona", 18);
        Cuenta kontua = new Cuenta(datuak, 1000);



        kontua.deposito(576.4);
        kontua.erakutsi();
        kontua.retiro(32.8);
        kontua.erakutsi();
        kontua.retiro(544);
        kontua.erakutsi();
        kontua.deposito(1);

        datuak.erakutsi();
        kontua.erakutsi();










/*
                Scanner sarrera = new Scanner(System.in);
                String hitzak;
                Palindromo hitza =new Palindromo();
                System.out.print("Sartu hitz bat: ");
                hitzak = sarrera.nextLine();

                if(hitza.espalindromo(hitzak)){
                    System.out.println("Palindromoa da");
                }
                else
                {
                    System.out.println("Ez da palindromo");
                }

                Palindromo p = new Palindromoa(12344321);
                System.out.println(p.zifrakKontatu());
                System.out.println(p.);
                */


                Scanner sarrera = new Scanner(System.in);

                System.out.print("Eman ikaslearen nota: ");
                double nota =sarrera.nextInt();

                System.out.print("Eman ikaslearen izena: ");
                String izena = sarrera.next();

                Ikaslea ikasle = new Ikaslea(nota, izena);
            }

        }



