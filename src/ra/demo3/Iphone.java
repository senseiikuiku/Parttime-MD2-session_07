package ra.demo3;

public class Iphone implements Demo3,Camera {

    @Override
    public void call() {
        System.out.println("In ra iphone");
    }

    @Override
    public void moveCamera(){
        System.out.println("Camera move");
    }

    public void game(){
        System.out.println("choi game");
    }
}
