package Stream;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Reduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(2);
        list.add(4);

        int result = list.stream().reduce((o1, o2) -> o1 * o2).get();
        //       System.out.println(result);
        double result2 = list.stream().reduce((element1, element2) -> element1 / element2).get();
        System.out.println(result2);
        //5 2 8 2 4
        // o1 = 5  , 10 , 80 , 160 , (640)
        // o2 = 2  , 8  , 2  , 4   ,

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(8);
        list1.add(2);
        list1.add(4);
        int result100 = list1.stream().reduce((o1, o2) -> o1 + o2).get();
        System.out.println(result100);

    }
}
