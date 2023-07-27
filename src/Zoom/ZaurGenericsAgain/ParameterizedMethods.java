package Zoom.ZaurGenericsAgain;

import java.util.ArrayList;
import java.util.Arrays;

public class ParameterizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer>integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        ArrayList<String>stringArrayList = new ArrayList<>();
        stringArrayList.add("Hello");
        stringArrayList.add("Ok");
        stringArrayList.add("Bye");
        int a1 = GenMethod.getSecondElement(integerArrayList);
        String a2 = GenMethod.getSecondElement(stringArrayList);
        System.out.println(a1);
        System.out.println(a2);
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
