package Zoom;

public class Car extends Decorator{
    @Override
    int getSpeed() {
        return 200;
    }

    @Override
    int getBaggageWeight() {
        return 150;
    }

}
