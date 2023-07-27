package Lambda_Expression;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf2 {
    public static void main(String[] args) {
        ArrayList<String>arrayList  = new ArrayList<>();
        arrayList.add("priveet");
        arrayList.add("poka");
        arrayList.add("ky");
        arrayList.add("okay");
        arrayList.add("java");
        Predicate<String> p = element2 -> element2.length() < 2;
//        arrayList.removeIf(element -> element.length() < 5);
        arrayList.removeIf(p);
        System.out.println(arrayList);
        
    }
}
