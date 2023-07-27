package Zoom;

public class Main {
    public static void main(String[] args) {
        Decorator decorator = new Car();
        SpeedCar speedCar = new SpeedCar(decorator);
        System.out.println(speedCar.getSpeed());
        
    }
}
