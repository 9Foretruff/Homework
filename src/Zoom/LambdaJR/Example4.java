package Zoom.LambdaJR;

interface B {
    void print(String message);
}

public class Example4 {
    public static void main(String[] args) {
        B b = (message -> System.out.println(message));
        b.print("Hello");

    }
}
