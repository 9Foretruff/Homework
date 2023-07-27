package Zoom.ZaurStreamAgain;

import java.util.Arrays;
import java.util.stream.Stream;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(value -> { value *= 2;
//            System.out.println(value);});
       // Arrays.stream(array).forEach(value -> System.out.println(value));
        Arrays.stream(array).forEach(Utils::myMethod); // method референс
        System.out.println("*********");
        Arrays.stream(array).forEach(value -> Utils.myMethod(value));

        Stream<Double> doubleStream = Stream.of(3.1,3.2,4.1,5.1);
        doubleStream.filter(aDouble -> aDouble > 3.5).forEach(System.out::println);


    }
}

class Utils{
    public static void myMethod(int a){
        a += 5;
        System.out.println("Element = " + a);
    }
}
