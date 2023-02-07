public class Tweety extends Canary{

    private int movies;


    Tweety(int age, sex sexua, float size, int movies) {
        super(age, sexua, size);

        this.movies = movies;

    }



    public static void main(String[] args) {
        Tweety tweety1 = new Tweety(6, sex.M, 1.5F,4);
        Parrot parrot1 = new Parrot(12,sex.F, Parrot.region.N,"Berdea");

        tweety1.whoAmI();
        parrot1.whoAmI();
        tweety1.height();
        parrot1.whereAreYouFrom();

        tweety1.setSize(17);
        tweety1.height();
        parrot1.setRegion(Parrot.region.W);

        System.out.println(parrot1.getBirds());


    }
}



