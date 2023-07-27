package Zoom.LambdaExpressionsAgain.UtilFunction;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String>stringArrayList = new ArrayList<>();
        stringArrayList.add("Prviet");
        stringArrayList.add("lambda");
        stringArrayList.add("in");
        stringArrayList.add("Java");
        stringArrayList.add("Okay");
        //stringArrayList.removeIf(s -> s.length() < 5);
        Predicate<String>stringPredicate = s -> s.length() < 5;
        stringArrayList.removeIf(stringPredicate);
        System.out.println(stringArrayList);
    }
}
