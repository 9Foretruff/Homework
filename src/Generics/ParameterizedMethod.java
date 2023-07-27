package Generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        //
        int i = arrayList.get(0);
        // int i = (Integer)arrayList.get(0);


        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);

        ArrayList<String>arrayList2 = new ArrayList<>();
        arrayList2.add("hi");
        arrayList2.add("bye");
        arrayList2.add("Maks");
        String a2 = GenMethod.getSecondElement(arrayList2);
        System.out.println(a2);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T>arrayList){
        return arrayList.get(1);
    }
}