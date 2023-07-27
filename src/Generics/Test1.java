package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");

        for (String x:list){
            System.out.println(x + "dlina " + x.length());
        }

    }
}
