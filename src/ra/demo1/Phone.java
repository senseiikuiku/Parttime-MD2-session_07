package ra.demo1;

public abstract class Phone {
    private String name;

    // Phuong thuc abstract
    public abstract void call();

    // Phuong thuc non-abstract
    public void showInfo(){
        System.out.println("Name: " + this.name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
