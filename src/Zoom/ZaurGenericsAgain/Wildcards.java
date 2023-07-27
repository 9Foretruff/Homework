package Zoom.ZaurGenericsAgain;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        //List<Number> list = new ArrayList<Integer>();
        //List<Object> list = new ArrayList<Integer>();
        List<?> list = new ArrayList<String>();
//        list.add("Hello");

        // bounded wildcards
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Object>();

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(2.14);
        list1.add(1.15);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ola");
        list2.add("hello");
        list2.add("Bye");
        showListInfo(list2);

        ArrayList<Double>doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(2.14);
        doubleArrayList.add(1.15);
        System.out.println(sum(doubleArrayList));

        ArrayList<Integer>integerArrayList = new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(40);
        integerArrayList.add(25);
        System.out.println(sum(integerArrayList));

    }

    static void showListInfo(List<?> list) {
        System.out.println("My list : " + list);
    }

    public static double sum(ArrayList<? extends Number>list){
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
