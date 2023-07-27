package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Maksim");
        list1.add("Nikita");
        list1.add("Zaur");
        System.out.println(list1);
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("!!!");
//        list2.add("???");
//        list1.addAll(1,list2);
//        System.out.println(list1);
//        list1.clear();
        System.out.println(list1.indexOf("Zaur"));
        System.out.println(list1.lastIndexOf("Zaur"));

        System.out.println(list1.size());

        System.out.println(list1.isEmpty());

        System.out.println(list1.contains("Zaur"));


    }
}
