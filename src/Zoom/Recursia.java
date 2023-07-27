package Zoom;

public class Recursia {
    public static void main(String[] args) {
        // Factorial  5! = 1 * 2 * 3 * 4 * 5
        System.out.println(fact(50));
        System.out.println(fibonachi(9));
    }


    public static long fact(long factorial) {
        if (factorial <= 1) {
            return factorial;
        }
        return factorial * fact(factorial - 1);
    }

    public static int fibonachi(int i) {
        if (i < 2){
            return i;
        }
        return fibonachi(i-1)+fibonachi(i-2);
    }
}
