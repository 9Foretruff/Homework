package Zoom.ProAbstract;

public class User {
    public String name;
    public Car car;

    public void goToWork(){
        System.out.println("Go to work on: ");
        car.drive();
    }

}
