package ra.bai5;

public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.workingHours * super.getPaymentPerHour();
    }
}
