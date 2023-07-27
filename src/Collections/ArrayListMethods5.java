package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("Zaur");
        string1.add("Ivan");
        string1.add("Mariya");
        string1.add("Kolya");
        string1.add("Elena");
//        System.out.println(string1);
//        List<String>sub = string1.subList(0,3);
//        sub.add("hello");
//        System.out.println("string1 elements of sub list : " + sub);
        String[] elements = string1.toArray(new String[0]);
        for (String s : elements) {
            System.out.println(s);
        }

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        System.out.println(list1);
        //list1.add(2); --- нельзя изменять лист если юзаешь ListOf

        List<String> list2 = List.copyOf(string1);
        System.out.println(list2);
       //  list2.remove(0); --- Тоже нельзя изменять

//        ArrayList<String> string2 = new ArrayList<>();
//        string2.add("Ivan");
//        string2.add("Mariya");
        //  string2.add("Igor");

        //string1.removeAll(string2);
//        string1.retainAll(string2);
//        System.out.println(string1);
//        boolean result  = string1.containsAll(string2);
//        System.out.println(result);

    }
}
