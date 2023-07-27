package Zoom.ZaurStreamAgain;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChainingExample2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream.filter(integer -> {
            System.out.println("!!!");
            return integer % 2 == 0;
        }).collect(Collectors.toList());

        
    }
}
