package Zoom;

import java.util.Date;
import java.util.function.Consumer;

public class LambdaIntro {
    public static void main(String[] args) {
        ISum sum = ((a, b) -> a + b);
        System.out.println(sum.sum(3, 5));
        Iqsrt iqsrt = x -> Math.sqrt(x);
        Iqsrt iqsrt1 = System.out::println;
        iqsrt1.sqrt(5);
        //System.out.println(iqsrt.sqrt(5));
    }

    @FunctionalInterface
    public interface ISum {
        public int sum(int a, int b);
    }

    @FunctionalInterface
    public interface Iqsrt {
        public void sqrt(int x);
    }
}

