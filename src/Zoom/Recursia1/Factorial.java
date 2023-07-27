package Zoom.Recursia1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(-5,-2));
        // System.out.println(factorial(10));
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return number;
        }
        return number * factorial(number - 1);
    }

    public static long sum(long from, long to) {
        if (from == to) {
            return from;
        } else if (from > to) {
            return from + sum(from - 1, to);
        } else {
            return from + sum(from + 1, to);
        }
    }
}
