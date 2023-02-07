public class Main {
    public static void main(String[] args) {

        StringContainer proba = new StringContainer("Kaixo");

        StringContainer a = new StringContainer("aa bb ccc");
        StringContainer b = new StringContainer("xx yyy");


        System.out.println(a.mixWords(a,b));



        //proba.rotate(2,'R');
        //proba.shiftLeft(3);
        //proba.shiftRight(4);
        //System.out.println(proba.codificar(3));

    }
}