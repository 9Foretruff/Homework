package Zoom;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Truck extends Decorator{
    private Decorator decorator;

    public Truck(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    int getSpeed() {
        return super.getSpeed();
    }

    @Override
    int getBaggageWeight() {
        return super.getBaggageWeight();
    }
    
}
