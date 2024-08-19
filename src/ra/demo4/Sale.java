package ra.demo4;

import java.util.Scanner;

public class Sale implements IEmployee {
    private String code;
    private double bonusSalary;

    public Sale() {
    }

    public Sale(String code, double bonusSalary) {
        this.code = code;
        this.bonusSalary = bonusSalary;
    }

    public void callVideo() {
        System.out.println("Sale dang goi khach hang");
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien");
        this.code = sc.nextLine();
        System.out.println("Nhap vao luong thuong");
        this.bonusSalary = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void outputData() {
        System.out.println("Ma nv: " + this.code);
        this.calSalary();
    }

    @Override
    public void calSalary() {
        System.out.println("Luong nv: " + (this.bonusSalary + SALARY));

    }
}
