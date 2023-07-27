package Nested_classes.Inner_Class;

public class Car {
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine){
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

    public class Engine {
        private int horsepower;

        public Engine(int horsepower) {
            System.out.println(doorCount);
            this.horsepower = horsepower;
        }

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsepower=" + horsepower +
                    '}';
        }
    }

}

class Test{
    public static void main(String[] args) {
        Car car = new Car("Black",2);
        Car.Engine engine = car.new Engine(345);
        car.setEngine(engine);
        System.out.println(car);
        System.out.println(engine);

       // Car.Engine engine3 = new Car("yellow",2).new Engine(200);


    }

}
