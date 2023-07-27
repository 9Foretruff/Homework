package Zoom.ProAbstract;

public abstract class Car {
    private String name;
    private int year;

    public Car() {

    }

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract void start();

    public abstract void drive();

    public void openWindow() {
        System.out.println("Opening the window");
    }

}
