package Zoom.ProAbstract;

public class Audi extends Car{
    @Override
    public void start() {
        System.out.println("Audi start");
    }

    @Override
    public void drive() {
        System.out.println("Audi drive");
    }
}
