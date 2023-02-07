public class Punto {
    private int x,y;
    int koadrantea;

    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void koadrante (){

        if(this.x>0 && this.y>0){
            System.out.println("1 kuadrantea");
        }
        if(this.x<0 && this.y>0){
            System.out.println("2 kuadrantea");
        }

        if(this.x<0 && this.y<0){
            System.out.println("3 kuadrantea");
        }

        if(this.x>0 && this.y<0){
            System.out.println("4 kuadrantea");
        }
    }

    public void idatzi(){
        System.out.println("Koordenatuak: X= " + x + ", Y= "+ y);
    }

    public void setY(int y){
        this.y=y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
