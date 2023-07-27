package Zoom.TypeCasting;

public class Example1 {
    public static void main(String[] args) {
        // instanceOf
        Integer integer = 5;
        Object o = integer;

        System.out.println(o instanceof String);
        System.out.println(o instanceof Integer);


        System.out.println(o.getClass());
        test2 test2 = new test2();

        Example1 example1 = new test2();

    }

    void print() {

    }
}

class test2 extends Example1 {
    @Override
    void print() {
        System.out.println("print@@@");
    }
}
