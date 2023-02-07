public class Gela {

    Ikaslea array[];

    public Gela(){
        this.array = new Ikaslea [20];
    }


    public void sartuIkaslea(String izena, double Nota) {
        Ikaslea bat = new Ikaslea(izena, Nota);
        array[zenbatObjetu()]= bat;
    }

    public int zenbatObjetu(){
        int kont = 0;
        for (int i = 0; i <array.length; i++){
            if (array[i]!=null){
                kont++;
            }
        }
        return kont;
    }


    void idatziIkasleBat(String izen){
        boolean bilatugabe=true;
        for (int i = 0; i<array.length; i++){
            if ((array[i]!=null) && (bilatugabe)) {
                if(array[i].getIzena().equals(izen)){
                    System.out.println(array[i].getIzena()+ " izena duen ikasleak atera duen nota: " + array[i].getNotaLetraz());
                    bilatugabe = false;
                } else{
                    System.out.println("Ez dago izen hortako ikasle bat.");
                }

            }
        }
    }

    public void idatziGuztiak (){
        for (int i = 0; i< array.length; i++){
            if ((array[i]!=null)){
                System.out.println(array[i].getIzena()+ " izena duen ikasleak atera duen nota: " + array[i].getNotaLetraz());
            }
        }
    }

}
