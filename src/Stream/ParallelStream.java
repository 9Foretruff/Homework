package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {

        // 1 2 3 4 ... 1000000000
        // 1 - 250 000 000
        // 250 000 001 - 500 000 000
        // 500 000 001 - 750 000 000
        // 750 000 000 - 1 000 000 000

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        double sumResult = list.parallelStream().reduce((x, y) -> x + y).get();
        System.out.println("Sum of list = " + sumResult);

        // Посмотрите что выдает калькулятор 10 / 5 = 2 / 1 = 2 / 0.25 = 8
        double divisionResult = list.parallelStream().reduce((x, y) -> x / y).get();
        System.out.println("Division of list = " + divisionResult);

    }
}
