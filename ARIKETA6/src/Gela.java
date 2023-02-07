public class Gela {


    private Ikaslea [] gela;



    Gela (){

        this.gela = new Ikaslea [20];

    }

    public void gelaBete (Ikaslea [] gela){
        for(int i = 0; i<this.gela.length; i++) {
            this.gela[i] = gela[i];
        }

    }

    //https://es.stackoverflow.com/questions/185652/llenar-un-array-con-objetos-de-otras-clases
    public void idatziGela() {
        for (int i = 0; i < gela.length; i++) {
            System.out.println(gela[i]);
        }
    }

    public void idatzibat(){
        System.out.println("Ikaslearen nota: " + gela);
        System.out.println("Ikaslearen izena: " + ikasle.getIzena());
    }
}
