package Zoom.ZaurNestedAgain;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int A ;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car : {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public final static class Engine {
        int horsePower;
        static int countOfObjects;


        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine : {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}

class TestForCar{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(50);
        Car car = new Car("Black",4,engine);
        System.out.println(car);
    }
}

class X{

}
