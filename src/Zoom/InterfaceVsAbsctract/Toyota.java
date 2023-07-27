package Zoom.InterfaceVsAbsctract;

public class Toyota extends Car{
    public Toyota(String name, int year, int maxSpeed) {
        super(name, year, maxSpeed);
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    public static void main(String[] args) {
        Car toyota = new Toyota("toyota",2017,265);
    }
}
