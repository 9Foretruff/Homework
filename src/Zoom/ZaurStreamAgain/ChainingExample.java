package Zoom.ZaurStreamAgain;

import java.util.Arrays;

public class ChainingExample {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        //3 1 5 9 21 81 7 -> 1 1 5 3 7 27 7 -> 51
        int b = Arrays.stream(array).filter(value -> value % 2 != 0).map(operand -> {
            if (operand % 3 == 0){
                operand = operand / 3;
            }
            return operand;
        }).reduce( (left, right) -> left + right).getAsInt();
        System.out.println(b);

        // Source -> Intermediate methods(lazy) -> terminal method (eager)


    }
}
