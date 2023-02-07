import java.math.*;
public class Recta {
    private int lodiera1;
    private int x1;
    private int y1;
    private int lodiera2;
    private int x2;
    private int y2;
    private int [] recta1 = {x1,y1};
    private int [] recta2 = {x2, y2};
    private int [] handiena;

    public Recta(int lodiera1, int lodiera2, int x1, int x2, int y1, int y2){
        this.lodiera1 = lodiera1;
        this.x1 = x1;
        this.y1 = y1;

        this.lodiera2 = lodiera2;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Recta (int [] recta1, int [] recta2){
        this.recta1 = recta1;
        this.recta2 = recta2;
    }

    public boolean horizontala(){
        boolean horizontala;
        if(this.y1 == this.y2){
            horizontala = true;
        } else {
            horizontala = false;
        }
        return horizontala;
    }

    public boolean bertikala(int ancho, int punto1, int punto2){
        boolean bertikala;
        if(this.x1 == this.x2){
            bertikala = true;
        } else{
            bertikala = false;
        }
            return bertikala;
    }

    public int[] Handiena(){
        if(this.lodiera1 > this.lodiera2){
            this.handiena = this.recta1;
        } else{
            this.handiena = this.recta2;
        }
        return this.handiena;
    }
}
