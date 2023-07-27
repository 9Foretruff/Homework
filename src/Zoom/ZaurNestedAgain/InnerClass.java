package Zoom.ZaurNestedAgain;

public class InnerClass {
    String color;
    int doorCount;
    Engine engine;

    public InnerClass(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //       this.engine = new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
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
        public static int a = 5;
        private int horsePower;
        static void hello(){
            System.out.println("hh");
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine : {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class TestForCar1 {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("black", 4);
        InnerClass.Engine engine = innerClass.new Engine(150);
        System.out.println(engine.a);
        System.out.println(engine);
        innerClass.setEngine(engine);
        System.out.println(engine);
        System.out.println(innerClass);

        InnerClass.Engine engine1 = new InnerClass("yellow", 4).new Engine(200);

    }
}