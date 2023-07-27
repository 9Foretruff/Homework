package Zoom.LambdaExpressionsAgain.UtilFunction;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arrayList.add(carSupplier.get());
        }
        return arrayList;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = createThreeCars(() -> new Car("Toyota camry", "black", 2.5));
        changeCar(cars.get(0), car -> {
            car.color = "pierre white";
            car.engine = 3.5;
            System.out.println("upgrade");
        });
        cars.forEach(car -> System.out.println(car));
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
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
