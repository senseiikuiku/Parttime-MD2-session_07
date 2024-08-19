package ra.bai4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Den", 5, 10);
        double area = rectangle.getArea();
        System.out.println("dien hinh chu nhat: " + area);
        rectangle.display();

        Shape circle = new Circle("Do", 5);
        double circumference = circle.getArea();
        System.out.println("dien hinh tron: " + circumference);
        circle.display();
    }
}
