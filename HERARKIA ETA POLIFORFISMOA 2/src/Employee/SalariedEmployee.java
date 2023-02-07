package Employee;
public class SalariedEmployee extends Employee implements Payable {

    private double weeklysalary = 0;

    SalariedEmployee(double weeklysalary){
        this.weeklysalary = weeklysalary;

        if(weeklysalary < 0){
            this.weeklysalary = 0;
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
