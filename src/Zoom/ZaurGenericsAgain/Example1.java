package Zoom.ZaurGenericsAgain;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
//        list.add("hello");
//        list.add(5);
//        list.add(new StringBuilder("fsdfsd"));
        list.add("Privet");
        list.add("ladno");
        list.add("opk");
        list.add("poka");

        for (Object s : list) {
            System.out.println(s + " dlina " + ((String) s).length());
        }

        //TypeSafe && Reusable Code !!!!!!!!
    }
}
