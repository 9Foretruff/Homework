package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>(100); // сразу в стратовом массиве будет 100
        List<String>list3 = new ArrayList<>();
        list2.add("Zaur");
        list2.add("Maksim");
        list2.add("Nikita");
        ArrayList<String>list4 = new ArrayList<>(list2);
        System.out.println(list4);
        list2.add("sjaddsa");
        System.out.println(list2);

        list.add("Zaur");
        list.add("Maksim");
        list.add("Nikita");



       // System.out.println(list);
    }
}
