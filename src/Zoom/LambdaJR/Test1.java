package Zoom.LambdaJR;

interface A {
    void method();
}

public class Test1 {
    public static void main(String[] args) {
        A a = new AImp();

        A a1 = new A() {
            @Override
            public void method() {
                System.out.println("option 2");
            }
        };

        a.method();
        a1.method();

        System.out.println(a.getClass());
        System.out.println(a1.getClass());
    }
}

class AImp implements A {

    @Override
    public void method() {
        System.out.println("method implementation");
    }
}
