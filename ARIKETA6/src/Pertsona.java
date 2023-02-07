public class Pertsona {

     private String izena;
     private String sexua;
     private int adina;

    public Pertsona(String izena, String sexua, int adina) {
        this.izena = izena;
        this.sexua = sexua;
        this.adina = adina;
    }

    void erakutsi(){
        System.out.println("Izena: " + this.izena);
        System.out.println("Sexua: " + this.sexua);
        System.out.println("Adina: " + this.adina);
    }




}
