package Stream;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
//        Arrays.sort(array);
//        Arrays.stream(array).forEach(System.out::println);


//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));



        int result = Arrays.stream(array).filter(s -> s % 2 == 1).map(s -> {if (s % 3 == 0) {s /= 3;}return s;}).reduce((s, s2) -> s + s2).getAsInt();
        System.out.println(result);


        // 3 1 5 9 21 81 7
        // 1 1 5 3 7 27 7 -> 24 27 = 51
    }
}
