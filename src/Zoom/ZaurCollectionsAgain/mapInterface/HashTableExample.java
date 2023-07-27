package Zoom.ZaurCollectionsAgain.mapInterface;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // HashTable - то же самое что и HashMap но synchronized.
        // HashTable ни ключ ни значение не могут быть null;
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Maksim", "Rokitko", 3);
        Student st2 = new Student("Nikita", "Potomkin", 1);
        Student st3 = new Student("Katya", "Ivanova", 4);
        Student st4 = new Student("Oleg", "Kotov", 3);

        ht.put(10.2, st1);
        ht.put(8.2, st2);
        ht.put(9.5, st3);
        ht.put(7.2, st4);

        System.out.println(ht);
    }
}
