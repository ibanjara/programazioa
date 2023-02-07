public class Ikaslea {

    private double nota;
    private String izena;
    private String notaletraz;
    private int[]gela = new int [20];

    Ikaslea(double nota, String izena){

        this.nota = nota;
        this.izena = izena;
    }

    public String getNotaletraz(){


        return notaletraz;

    }

    public int[] getArray(){

        return gela;

    }

    public String getIzena(){
        return izena;
    }

    public double getNota(){

        return nota;
    }

    String NotaLetraz(){

        int notaOsoa = (int)this.nota;
        String notaletraz = "";

        switch(notaOsoa){

            case 1,2,3,4: {
                notaletraz = "Gainditu gabe.";
            }

            case 5,6: {
                notaletraz = "Ongi";
            }

            case 7,8: {
                notaletraz = "Oso ongi";
            }

            case 9,10: {
                notaletraz = "Bikain";
            }

        }

        return notaletraz;
    }

}
