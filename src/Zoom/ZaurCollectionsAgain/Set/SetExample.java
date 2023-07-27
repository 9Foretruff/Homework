package Zoom.ZaurCollectionsAgain.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Maksim");
        set.add("Katya");
        set.add("Ihor");
        //set.add(null);
        set.remove("Ihor");
        //System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.contains("Maksim"));
        System.out.println(set.isEmpty());


    }
}
