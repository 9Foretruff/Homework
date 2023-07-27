package Zoom.Recursia1;

public class Main1 {
    public static int counter = 0;

    public static void main(String[] args) {
        while (true) {
            new Person();
        }
        //r();
    }

    public static void r() {
        if (counter == 10000) {
            return;
        }
        System.out.println(counter++);
        r();
    }

}

class Person {

}
