package Zoom.ProAbstract;

public class Tesla extends Car{
    @Override
    public void start() {
        System.out.println("Tesla start");
    }

    @Override
    public void drive() {
        System.out.println("Tesla drive");
    }
}
