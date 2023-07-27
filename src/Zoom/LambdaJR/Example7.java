package Zoom.LambdaJR;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, -1, 7, 6, 4, 3, 8);
        list.forEach(integer -> System.out.println(integer));
        list.forEach(System.out::println);
    }
}
