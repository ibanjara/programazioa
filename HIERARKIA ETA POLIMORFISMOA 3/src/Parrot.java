public class Parrot extends Bird{

private region lekua;
public enum region{N, S, E, W}

    private String kolorea;

    Parrot(int age, sex sexua, region lekua, String kolorea) {
        super(age, sexua);
        this.lekua = lekua;
        this.kolorea = kolorea;
    }

    public void setRegion(region a){
        this.lekua=a;
    }

    public void whereAreYouFrom(){
        switch (lekua){
            case N:
                System.out.println("North");
                break;
            case S:
                System.out.println("South");
                break;
            case E:
                System.out.println("East");
                break;
            case W:
                System.out.println("West");
                break;
        }

    }
}
