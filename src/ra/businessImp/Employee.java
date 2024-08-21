package ra.businessImp;

import ra.business.IEmployee;

import java.util.Scanner;

public class Employee implements IEmployee {
    private String Id;
    private String Name;
    private int Year;
    private float Rate;
    private float Commission;
    private float Salary;
    private boolean Status;

    public Employee() {
    }

    public Employee(String id, String name, int year, float commission, float rate, float salary, boolean status) {
        Id = id;
        Name = name;
        Year = year;
        Commission = commission;
        Rate = rate;
        Salary = salary;
        Status = status;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public float getRate() {
        return Rate;
    }

    public void setRate(float rate) {
        Rate = rate;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public float getCommission() {
        return Commission;
    }

    public void setCommission(float commission) {
        Commission = commission;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }


    @Override
    public void inputData(Scanner sc) {
        System.out.print("Id: ");
        this.Id = sc.nextLine();
        System.out.print("Ten: ");
        this.Name = sc.nextLine();
        System.out.print("Nam sinh: ");
        this.Year = Integer.parseInt(sc.nextLine());
        System.out.print("He so luong: ");
        this.Rate = Float.parseFloat(sc.nextLine());
        System.out.print("Hoa hong: ");
        this.Commission = Float.parseFloat(sc.nextLine());
        System.out.print("Trang thai(true hoặc false): ");
        this.Status = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Id: " + this.Id);
        System.out.println("Ten: " + this.Name);
        System.out.println("Nam sinh: " + this.Name);
        System.out.println("He so luong: " + this.Rate);
        System.out.println("Hoa hong: " + this.Commission);
        System.out.println("Luong: " + (double) this.calSalary());
        System.out.println("Trang thai: " + (this.Status ? "Dang lam viec" : "Nghi viec"));
    }

    public float calSalary() {
        this.Salary = (float) (this.Rate * BASIC_SALARY + this.Commission);
        this.Salary = Float.parseFloat(String.format("%.2f", this.Salary));
        return this.Salary;
    }
}
