package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Maksim");
        list1.add("Nikita");
        list1.add("Nastya");
        list1.add("Elena");
        System.out.println("ArrayList = " + list1);

        List<Integer> list = List.of(3, 8, 13); // Нельзя менять!!!!!!
        // list.add(5);
        System.out.println(list);

        List<String> list2 = List.copyOf(list1);
        System.out.println(list2);
        list1.add("sda");

//        Object[] array = list1.toArray();
//        String[] array2 = list1.toArray(new String[0]);
//        for (String s : array2) {
//            System.out.println(s);
//        }

//        List<String> myList = list1.subList(1, list1.size());
//        System.out.println("myList = " + myList);
//        myList.add("Fedor");
//        System.out.println("myList = " + myList);
//        System.out.println("ArrayList = " + list1);
//        list1.add("Sveta");
//        System.out.println("ArrayList = " + list1);
//        System.out.println("myList = " + myList);

//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Zaur");
//        list2.add("Maksim");
//        list2.add("Ihor");

        // list1.removeAll(list2);
        // list1.retainAll(list2);
        // System.out.println(list1);

//        boolean result = list1.containsAll(list2);
//        System.out.println(result);

        // removeAll удалит повторы . retainAll наоборот , если нету пары удаляет
    }
}
