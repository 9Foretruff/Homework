package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("Zaur");
        string1.add("Ivan");
        string1.add("Mariya");
        string1.add("Kolya");
        string1.add("Elena");

        Iterator<String>iterator = string1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(string1);
    }
}
