package Nested_classes.Static_Nested_Classes;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int year;

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

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(500);
        System.out.println(engine1.horsepower);
    }

    public static class Engine {
        int horsepower;
        static int countOfObjects;


        public Engine(int horsepower) {
//            System.out.println(year);
            this.horsepower = horsepower;
            countOfObjects ++;
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
        Car.Engine engine = new Car.Engine(300);
        System.out.println(engine);
        Car car = new Car("Black", 2 , engine);
        System.out.println(car);

    }

}

class A extends Car.Engine{

    A(){
        super(6500);
    }
}

