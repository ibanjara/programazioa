package Employee;

public class BasePlusCommisionEmployee extends CommisionEmployee implements Payable{

    private int baseSalary;

    BasePlusCommisionEmployee(int grosssales, int commisionrate, int baseSalary) {
        super(grosssales, commisionrate);
        this.baseSalary = baseSalary;
        if(baseSalary <0){
            this.baseSalary = 0;
        }
    }


    @Override
    public float earning() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
