package invoice;

import Employee.Payable;

public class Invoice implements Payable {
    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
