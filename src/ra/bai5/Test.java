package ra.bai5;

public class Test {
    public static void main(String[] args) {
        Employee emp1 = new PartTimeEmployee("Duc",20,5);
        System.out.println(emp1.getName()+" lam viec: "+emp1.calculateSalary());

        Employee emp2 = new FullTimeEmployee("Thuy",10);
        System.out.println(emp2.getName()+" lam viec: "+emp2.calculateSalary());
    }
}
