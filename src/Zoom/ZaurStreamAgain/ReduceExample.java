package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(12);

        int result = list.stream().reduce((integer, integer2) -> integer * integer2).get();
        System.out.println(result);
        // integer1 = 5 5 15 60 720
        // integer2 = 1 3 4  12

        int result2 = list.stream().reduce(1, (integer, integer2) -> integer * integer2);
        System.out.println(result2);
        // integer1 = 1 5 5 15 60 720
        // integer2 = 5 1 3 4  12

        List<String> list1 = new ArrayList<>();
        list1.add("Privet");
        list1.add("ok");
        list1.add("poka");
        String result3 = list1.stream().reduce((s, s2) -> s + s2).get();
        System.out.println(result3);

//        List<Integer> list100 = new ArrayList<>();
//        list100.add(100);
//        list100.add(100);
//        list100.add(100);
//        Optional<Integer> o  = list100.stream().reduce((integer, integer2) -> integer * integer2);
//        if (o.isPresent()){  // Проверяет что в optional нету null !!!!
//            System.out.println(o.get());
//        }else {
//            System.out.println("Null!");
//        }
//        //        System.out.println(result100);
    }
}
