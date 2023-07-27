package Zoom.ZaurStreamAgain;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("kak dela");
        list.add("poka");


        // Stream - это последовательность элементов ,
        // поддерживающих последовательные и параллельные операции на ними

        List<Integer> integers = list.stream().map(element -> element.length()).toList();
      //  System.out.println(integers);

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//
//        System.out.println(list);

        System.out.println("*********");
        int[] array = {5, 9, 3, 7, 1};
        int [] result = Arrays.stream(array).map(operand -> {
            if (operand % 3 == 0){
                operand = operand / 3;
            }
            return operand;
        }).toArray();
       // System.out.println(Arrays.toString(result));
        Set<String>set =new TreeSet<>();
        set.add("Privet");
        set.add("kak dela");
        set.add("poka");
        set.add("okayY");
        set.add("ooJASJDokaoy");

        System.out.println(set);

        List<Integer>integerSet = set.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(integerSet);
    }
}
