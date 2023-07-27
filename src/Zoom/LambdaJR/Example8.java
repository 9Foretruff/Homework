package Zoom.LambdaJR;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 54, 5, 6, 7, -1);
        List<String> stringList = integers.stream()
                .filter(integer -> integer > 5)
                .map("_"::repeat)
                .collect(Collectors.toList());
        System.out.println(stringList);
    }
}