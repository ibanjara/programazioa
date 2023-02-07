package Employee;

public class CommisionEmployee extends Employee{

    private int grosssales = 0;
    private int commisionrate;

    CommisionEmployee(int grosssales, int commisionrate){
        super();
        this.grosssales = grosssales;
        this.commisionrate = commisionrate;
        if(grosssales < 0){
            this.grosssales = 0;
        }

        if(commisionrate>1 || commisionrate<0){
            this.commisionrate= 0;
        }
    }

    @Override
    public float earning() {
        return grosssales*commisionrate;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
