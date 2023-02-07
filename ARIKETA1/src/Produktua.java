public class Produktua {
    private String izena;
    private double balioa;
    private int zenbat;

    public Produktua(String prodIzena, double prodBalioa, int zenbatProd){

        izena=prodIzena;
        balioa=prodBalioa;
        zenbat=zenbatProd;

    }

    public void idatzi(){
        System.out.println(izena + ", balioa = " + balioa + ", " + "Kopurua = " + zenbat);
    }
}
