package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static ArrayList<Car> createTheeCars(Supplier<Car> carSupplier, int count) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> outCars = createTheeCars(() -> new Car("Toyota Camry", "Black", 2.5), 3);
        System.out.println(outCars);
        Car car = new Car("Toyota Camry", "Black", 3.5);
        changeCar(car, (s) -> {
            s.color = "yellow";
            s.engine = s.engine + 1;
            System.out.println("Updated " + s.model + " " + s);
        });

    }
}


class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }


}