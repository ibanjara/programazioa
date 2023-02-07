package orders;
public class Client {
    private int idNumber;
    private String name;

    Client(int idNumber, String name){
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getIdNumber(){
        return idNumber;
    }

    public String getName(){
        return name;
    }
}
