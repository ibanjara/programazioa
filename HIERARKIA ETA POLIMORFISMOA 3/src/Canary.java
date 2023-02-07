public class Canary extends Bird{

    private int age;
    private static int kont = 0;

    float size;


    Canary(int age, sex sexua, float size){
        super(age,sexua);
        this.size = size;

    }
    public void setSize(float size){
        this.size= size;
    }


    Canary(int age, sex sexua){
        super(age,sexua);
    }

    public void height(){

        if(size>30){
            System.out.println("High");
        }
        if(size>= 15 && size <=30){
            System.out.println("Middle");
        }
        if(size<15){
            System.out.println("Little");
        }

    }
}