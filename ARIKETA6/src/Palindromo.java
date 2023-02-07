public class Palindromo {

    private int zenbakia;

    Palindromo(int zen) {
        this.zenbakia = zen;
    }

    int zifraKontatu(){
        int kont = 0;
        int aux = this.zenbakia;
        while(aux!=0){
            aux/=10;
            kont++;
        }
        return kont;
    }

    int digiPosN(int posi){
        int kont;
        long aux = this.zenbakia;
        for(kont=1; kont<posi; kont++){
            aux/=10;
        }
        System.out.println("Acabo");
        return (int)aux%10;
    }

    boolean paliDa(){
        int kont = 0;
        boolean pal = true;
        while (kont<zifraKontatu()/2 && pal){
            if(digiPosN(kont+1)!=digiPosN(zifraKontatu()-kont)){
                pal = false;
            }
            kont++;

        }
        return pal;
    }
}