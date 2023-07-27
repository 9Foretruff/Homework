package Varargs;

import java.util.Arrays;

public class Test1 {
    public static void main(String... sss) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        sum(a);
        sum(1,2,3,4,5,6,7,8,9,10);
    }

    static void sum(int... numbers){
        final int length = numbers.length;
        final int sum = Arrays.stream(numbers).sum();
        final String lineSeparator = System.lineSeparator();


        System.out.printf("Кол-во элементов для сложения - %d, сумма - %d%s", length, sum, lineSeparator);
    }
}
