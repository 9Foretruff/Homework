package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Maksim");
        list.add("Nikita");
        list.add(1,"Misha");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        //System.out.println(list.get(2));
        list.remove(0);
        System.out.println(list.remove("Zaur"));
        list.set(1,"Oleg");
        System.out.println(list);
    }
}
