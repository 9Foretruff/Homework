package Zoom.ZaurStreamAgain;

import java.util.stream.Stream;

public class CountExample {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
       stream = stream.map(integer -> integer + 5);
        System.out.println(stream.distinct().count());
        // Terminal!!!
    }
}
