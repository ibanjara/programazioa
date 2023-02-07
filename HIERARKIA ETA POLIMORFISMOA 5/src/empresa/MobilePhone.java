package empresa;

public class MobilePhone {

    private String numero;
    private int bateria;

    MobilePhone(String numero, int bateria){
        this.numero = numero;
        this.bateria = bateria;
    }

    public void use(){
        this.bateria -= 1;
    }

    public String getNumero(){
        return numero;
    }
    public int getBateria(){
        return bateria;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setBateria(int bateria){
        this.bateria = bateria;
    }
}
