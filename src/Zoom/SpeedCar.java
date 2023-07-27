package Zoom;

public class SpeedCar extends Decorator{
    private Decorator decorator;

    public SpeedCar(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    int getSpeed() {
        return 300;
    }

    @Override
    int getBaggageWeight() {
        return 150;
    }
}
