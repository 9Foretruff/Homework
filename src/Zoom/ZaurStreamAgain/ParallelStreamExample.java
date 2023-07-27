package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {

        // 1 , 2 , 3 , 4 ... 1.000.000.000
        // 1 - 250.000.000
        // 250.000.001 - 500.000.000
        // 500.000.001 - 750.000.000
        // 750.000.001 - 1.000.000.0000

        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        // (10/5) = 2
        // 1/0.25) = 4
        // 2/4 = 0.5
        double sumResult = list.parallelStream()
                .reduce((aDouble, aDouble2) -> aDouble + aDouble2).get();
        System.out.println(sumResult);

        double divisionResult = list.parallelStream()  // Тут паралель все ломает!!
                .reduce((aDouble, aDouble2) -> aDouble / aDouble2).get();
        System.out.println(divisionResult);
        
    }
}
