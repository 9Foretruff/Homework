package Zoom.Interface;

public class Duck implements FlyingBird, WaterFowl {


    @Override
    public void fly() {

    }

    public static void main(String[] args) {
        WaterFowl waterFowl = null;
        waterFowl.fly();
    }
}
