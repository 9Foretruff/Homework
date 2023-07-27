package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("privet");
        stringList.add("kad dela?");
        stringList.add("ok");
        stringList.add("poka");
//        for (int i = 0; i < stringList.size(); i++) {
//            stringList.set(i , String.valueOf(stringList.get(i).length()));
//        }
        // 6 9 2 4
        List<Integer> integerList = stringList.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(integerList);


        int[] array = {5, 9, 3, 8, 1};
        // 5 3 1 8 1
        array = Arrays.stream(array).map(s -> {
            if (s % 3 == 0) {
                s = s / 3;
            }
            return s;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kad dela?");
        set.add("ok");
        set.add("poka");
        System.out.println(set);
        Set<Integer>integerSet = set.stream().map(s ->(s.length())).collect(Collectors.toSet());
        List<Integer>integerList1 = set.stream().map(s ->(s.length())).collect(Collectors.toList());
        System.out.println(integerSet);
    }
}
