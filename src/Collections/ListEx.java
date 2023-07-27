package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

    public static void main(String[] args) {
        ArrayList<String>stringArrayList = new ArrayList<>(30); // <- capacity
        stringArrayList.add("Privet");
        stringArrayList.add("kak deva?");
        stringArrayList.add("poka");
        stringArrayList.add("poka");
        System.out.println(stringArrayList);
        System.out.println(stringArrayList.size());

        List<String>stringArrayList2 = new ArrayList<>(2000);
        stringArrayList2.add("Privet");  // stringArrayList2 - 2 size and 200 capacity
        stringArrayList2.add("Privet");

        List<String>stringArrayList3 = new ArrayList<>(stringArrayList);
        System.out.println(stringArrayList3);

        System.out.println(stringArrayList  == stringArrayList3);
    }
}
