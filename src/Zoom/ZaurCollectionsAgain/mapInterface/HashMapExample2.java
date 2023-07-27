package Zoom.ZaurCollectionsAgain.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    // Initial capacity - начальный размер массива;
    // Load factor - коэффициент того , насколько массив должен быть заполнен .
    // после чего его размер будет увеличен вдвое .
    //  O(1) - константное время
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Maksim","Rokitko",3);
        Student st2 = new Student("Nikita","Potomkin",1);
        Student st3 = new Student("Katya","Ivanova",4);
        map.put(st1,9.2);
        map.put(st2,8.1);
        map.put(st3,11.2);
        System.out.println(map);
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());
        // st1.course = 4;
        System.out.println(map.containsKey(st1));
        System.out.println(st1.hashCode());
        System.out.println(map);
        //Map<Integer, String> map = new HashMap<>(16,0.75f);
    }

}
