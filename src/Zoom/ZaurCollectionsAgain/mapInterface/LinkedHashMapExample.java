package Zoom.ZaurCollectionsAgain.mapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> hashMap = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Maksim", "Rokitko", 3);
        Student st2 = new Student("Nikita", "Potomkin", 1);
        Student st3 = new Student("Katya", "Ivanova", 4);
        Student st4 = new Student("Oleg", "Kotov", 3);

        hashMap.put(11.2, st1);
        hashMap.put(10.2, st2);
        hashMap.put(2.3, st3);
        hashMap.put(7.9, st4);

        System.out.println(hashMap);

        System.out.println(hashMap.get(11.2));
        System.out.println(hashMap.get(10.2));
        System.out.println(hashMap.get(2.3));
        System.out.println(hashMap.get(7.9));

        System.out.println(hashMap);
    }
}
