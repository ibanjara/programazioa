import java.util.Scanner;

public class OpArray {

    Scanner sarrera = new Scanner(System.in);

    int[] array;

    OpArray(int[] array){
        this.array = array;
    }

    public void cargaArray(int zenbakia){
        boolean sartuta = false;
        for (int i = 0; i< array.length && !sartuta; i++){
                array[i] = zenbakia;
                sartuta = true;
            }
            if(zenbakia == 0){
                System.out.println("0 sartu duzu. Zenbakiak eskatzen gelditu.");
                break;
            }
        }
    }
   public void mostrar(){
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i]);
        }
   }

   public void reemplazar(int zenbakia){
    int kont = 0;


       for (int i = 0; i< array.length; i++){
           if (array[i] == zenbakia){
               kont++;
               for(int j = 0; j<kont; j++) {
                   System.out.println("Eman zenbaki berria: ");
                   int zenbakiaberria = sarrera.nextInt();
                   array[i] = zenbakiaberria;
               }
           }
       }
   }


}
