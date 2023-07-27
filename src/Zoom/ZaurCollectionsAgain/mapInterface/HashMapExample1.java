package Zoom.ZaurCollectionsAgain.mapInterface;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(2103, "Nikita Potomkin");
        map1.put(7777, "Maksim Rokitko");
        map1.put(9800, "Katya Sidorova");
//        map1.put(1234,"Katya Sidorova");
//        map1.put(null,"Sergey Sidorov");
//        map1.put(8312,null );
        map1.putIfAbsent(1000, "Oleg Sidorov");  // добавь если такого ключа еще нету
        System.out.println(map1);
        // System.out.println(map1.get(7777));
        map1.remove(7777);
//        System.out.println(map1);
//        System.out.println(map1.containsValue("Katya Sidorova"));
//        System.out.println(map1.containsKey(1000));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Maksim", "Cool");
        map2.put("Nekit", "less cool");
    }
}
