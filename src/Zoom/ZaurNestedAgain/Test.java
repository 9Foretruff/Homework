package Zoom.ZaurNestedAgain;

import java.util.Comparator;

public class Test extends Thread{

    static class A {
        // static nested class
    }

    class B {
        // Inner class
    }

    void method(){
        class C{
            //Local class
        }
    }

    // Anonymous
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
    }

}
