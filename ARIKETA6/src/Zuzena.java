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
        if (p1.getY() == p2.getY()){
            return true;
        }
        return false;
    }
    boolean bertikalaDa(){
        return p1.getX()==p2.getX();
    }

    Punto punturikAltuena(){

        if(p1.getY() > p2.getY()){
            return p1;
        }
        return p2;
    }
    public double luzera(){
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2));
    }

    Zuzena zuzenLuzeena(Zuzena zuzenBat){
        if(this.luzera() > zuzenBat.luzera()){
            return this;
        }else{
            return zuzenBat;
        }
    }
    void erakutsi(){
        System.out.println("Grosor: " + grosor);
        System.out.println("x1: " + p1.getX());
        System.out.println("y1: " + p1.getY());
        System.out.println("x2: " + p2.getX());
        System.out.println("y2: " + p2.getY());
    }
    void erakutsiPuntua(Punto p1){
        System.out.println("x1: " + p1.getX());
        System.out.println("y1: " + p1.getY());
    }
}