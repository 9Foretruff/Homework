package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Maksim");
        list1.add("Nikita");
        list1.add("Nastya");
        list1.add("Elena");

        Iterator<String>iterator = list1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
//            System.out.println(iterator.next());
        }
        System.out.println(list1);


//        Iterator<String> iterator = list1.iterator();
//        iterator.forEachRemaining(System.out::println);
    }
}
