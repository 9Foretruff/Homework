package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        // list.add("hello");

        //bounded wildcards
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list35 = new ArrayList<Number>();


        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(5.12);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("Bye");
        showListInfo(list2);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(5.12);
        doubleArrayList.add(3.16);
        System.out.println(sumOfAllElements(doubleArrayList));

        ArrayList<Integer> integersArrayList = new ArrayList<>();
        integersArrayList.add(3);
        integersArrayList.add(5);
        integersArrayList.add(3);
        System.out.println(sumOfAllElements(integersArrayList));

//        ArrayList<String> stringArrayList = new ArrayList<>();
//        System.out.println(sumOfAllElements(stringArrayList));
    }

    public static void showListInfo(List<?> list) {
        System.out.println("My list contains : " + list);
    }

    public static double sumOfAllElements(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n : arrayList) {
            sum += n.doubleValue();
        }
        return sum;
    }



}


