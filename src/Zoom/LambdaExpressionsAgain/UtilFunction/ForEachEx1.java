package Zoom.LambdaExpressionsAgain.UtilFunction;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx1 {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "kak deva?", "cool", "bye");
        list.forEach(System.out::println);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.forEach(integer -> {
            System.out.println(integer);
            integer *=2;
            System.out.println(integer);
        });
    }
}
