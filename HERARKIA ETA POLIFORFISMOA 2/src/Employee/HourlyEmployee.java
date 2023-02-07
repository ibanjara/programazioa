package Employee;

public class HourlyEmployee extends Employee implements Payable{

    private int wagehour;
    private int hours;

    HourlyEmployee(int wagehour, int hours){

        this.wagehour = wagehour;
        this.hours = hours;

        if(wagehour<0){
            this.wagehour= 0;
        }

        if(hours<0){
            this.hours = 0;
        }
    }
    @Override
    float earning() {

        float totala = 0;

        if (hours>40){
            totala = (float) (wagehour+(wagehour*0.5));
        }

        return totala;
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
