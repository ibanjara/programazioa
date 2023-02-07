public class Circunferencia {
    int erradio;
    String kolorea;
    final double PI = 3.1416;

    Circunferencia(int r, String k){
        this.erradio = r;
        this.kolorea = k;
    }

    double area(){
        return PI*this.erradio*this.erradio;
    }

    void printPerimeter(){
        System.out.println("Zuk sartutako borobila da: " + this.erradio + "eta perimetroa da: " + 2*PI*erradio);
    }

    boolean isBig(){
        return this.area()>20;
    }

    boolean isEqualTo(Circunferencia k){
        return this.erradio==k.erradio && this.kolorea.equals(k.kolorea);
    }

    void show(){
        System.out.println("Kolorea: " + kolorea + ", erradioa: " + erradio);
    }
}
