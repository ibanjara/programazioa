public class Bird {

    public enum sex {M, F}
    private int age;
    private static int kont = 0;

    private sex sexua;

    Bird(int age, sex sexua){
        this.age=age;
        this.sexua = sexua;
        kont++;
    }

    public int getBirds(){
        return kont;
    }

    public void whoAmI(){
        System.out.println("Sexua: " + sexua);
        System.out.println("Adina: " + age);
    }
}
