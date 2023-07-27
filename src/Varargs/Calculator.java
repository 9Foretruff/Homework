package Varargs;

import java.util.Arrays;

public class Calculator {
    public static void main(String... sss) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1,10,123,234,6234,12,8);
        System.out.println(sum);
    }
    int sum(int... numbers){
        return Arrays.stream(numbers).sum();
    }
}
