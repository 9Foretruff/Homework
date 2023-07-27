package Stream;

import java.util.Arrays;

public class ForEachEx {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(s -> System.out.println(s *= 2));
//        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(s -> Utils.myMethod(s));

    }
}

class Utils {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element = " + a);
    }
}