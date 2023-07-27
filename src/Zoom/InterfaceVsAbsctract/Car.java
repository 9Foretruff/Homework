package Zoom.InterfaceVsAbsctract;

public abstract class Car {

    private String name;

    public Car() {

    }

    public Car(String name, int year, int maxSpeed) {
        this.name = name;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    private int year;
    private int maxSpeed;

    public abstract void run();

    public abstract void stop();

}
