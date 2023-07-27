package Zoom.ZaurCollectionsAgain.mapInterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        //  В основе TreMap лежит красно-черное дерево
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        TreeMap<Student, Double> treeMap1 = new TreeMap<>(/*new Comparator*/);
        Student st1 = new Student("Maksim", "Rokitko", 3);
        Student st2 = new Student("Nikita", "Potomkin", 1);
        Student st3 = new Student("Katya", "Ivanova", 4);
        Student st4 = new Student("Oleg", "Kotov", 3);
        Student st5 = new Student("Pavel", "Pomashka", 1);
        Student st6 = new Student("Irina", "Indi", 4);
        Student st7 = new Student("Sergey", "Lolad", 4);

        treeMap1.put(st2, 10.2);
        treeMap1.put(st1, 11.2);
        treeMap1.put(st5, 8.5);
        treeMap1.put(st4, 7.9);
        treeMap1.put(st7, 10.1);
        treeMap1.put(st3, 2.3);
        treeMap1.put(st6, 4.9);

//        Student st8 = new Student("Sergey", "Lolad", 4);
//        System.out.println(treeMap1.containsKey(st8));

        treeMap.put(11.2, st1);
        treeMap.put(10.2, st2);
        treeMap.put(2.3, st3);
        treeMap.put(7.9, st4);
        treeMap.put(8.5, st5);
        treeMap.put(4.9, st6);
        treeMap.put(10.1, st7);

        System.out.println(treeMap1);

//        System.out.println(treeMap);
//        System.out.println(treeMap.tailMap(7.9));
//        System.out.println(treeMap.headMap(5.2));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());


//        System.out.println(treeMap.get(11.2));
//        treeMap.remove(10.2);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap);


    }
}
