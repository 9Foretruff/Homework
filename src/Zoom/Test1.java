package Zoom;

public class Test1 {
//    public static void main(String[] args)
//    {
//        print(3);
//    }
//
//    public static void print(int x)
//    {
//        if (x <=0)
//            System.out.println("Boom!");
//        else
//        {
//            System.out.println(x);
//            print(x - 1);
//            System.out.println(x);
//        }
//    }

    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        printFibonacciWithCondition(0, 1);
    }

    private static void printFibonacciWithCondition(long penultimate, long previous) {
        long current = penultimate + previous;
        if (current > Integer.MAX_VALUE) {
            return;
        }
        echo(true, penultimate, previous);
        System.out.println(current);
        printFibonacciWithCondition(previous, current);
        echo(false, penultimate, previous);
    }

    private static void echo(boolean isBeforeRecursiveCall, long penultimate, long previous) {
        if (isBeforeRecursiveCall) {
            System.out.printf("Before method call with args: %d, %d. Current number = ", penultimate, previous);
        } else {
            System.out.printf("After  method call with args: %d, %d\n", penultimate, previous);
        }

    }

}
