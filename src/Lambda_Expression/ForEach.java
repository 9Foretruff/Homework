package Lambda_Expression;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
//        List<String> list = List.of("privet", " kak dela ", " normalno ", " poka ");
//        list.forEach((s) -> System.out.print(s));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(50);
        integerList.add(1);
        integerList.add(2);
        integerList.add(37);
        integerList.forEach(s -> {
            System.out.println(s);
            s *= 2;
            System.out.println(s);
        });
    }
}
