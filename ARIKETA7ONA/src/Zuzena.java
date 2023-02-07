public class Zuzena {

    private int grosor;
    private Punto p1, p2;

    Zuzena (int grosor, Punto p1, Punto p2){

        this.grosor = grosor;
        this.p1=p1;
        this.p2 =p2;
    }

    Zuzena(int grosor, int x1, int y1, int x2, int y2){
        this.grosor = grosor;
        this.p1 = new Punto (x1, y1);
        this.p2 = new Punto (x2, y2);
    }

    boolean horizontalaDa(){
        if (p1.y == p2.y){
            return true;
        }
        return false;
    }

    boolean bertikalaDa(){
        return p1.x==p2.x;
    }

    Punto punturikAltuena(){

        if(p1.y > p2.y){
            return p1;
        }
        return p2;
    }
}


