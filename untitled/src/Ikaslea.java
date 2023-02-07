public class Ikaslea {

    private double Nota;
    private String izena;
    private String notaLetraz;


    public Ikaslea(String izena, double Nota){

        this.Nota = Nota;
        this.izena = izena;
        setNotaLetraz();

    }
    public String getIzena(){
        return this.izena;
    }

    public String getNotaLetraz(){
        return this.notaLetraz;
    }

    public void setIzena(String izena){
        this.izena = izena;
    }

    public void setNotaLetraz(){

        int not = (int) (this.Nota);

        switch (not) {
            case 1, 2, 3, 4:
                this.notaLetraz = "Gainditu gabe";
                break;
            case 5, 6:
                this.notaLetraz = "Ongi";
                break;
            case 7, 8:
                this.notaLetraz = "Oso ongi";
                break;
            case 9, 10:
                this.notaLetraz = "Bikain";
                break;
        }
    }


}
