package Collections;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("Privet");
        string1.add("kak deva?");
        string1.add("pok");
        System.out.println(string1);
//        ArrayList<String> string2 = new ArrayList<>();
//        string2.add("!!!");
//        string2.add("???");
//        string1.addAll(1,string2);
//        System.out.println(string1);
//        string1.clear();
//        System.out.println(string1.indexOf("pok"));
//        System.out.println(string1.lastIndexOf("pok"));
//
//        System.out.println("size : " + string1.size());
//        string1.clear();
//        System.out.println(string1.isEmpty());
        System.out.println(string1.contains("pok"));
    }
}
