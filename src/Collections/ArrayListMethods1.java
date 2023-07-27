package Collections;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("Privet");
        string.add("kak deva?");
        string.add("pok");
        string.add(0,"bye");
        for (String s : string) {
            System.out.println(s);
        }
        string.remove("bye");
        System.out.println(string.size());
        System.out.println(string);
        System.out.println(string.get(0));
        string.set(0,"hello");

        System.out.println("-------------");

        for (int i = 0; i < string.size(); i++) {
            System.out.println(string.get(i));
        }
    }
}
