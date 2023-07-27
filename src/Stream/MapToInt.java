package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 29, 2, 10.7);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);//
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);//
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> list = students.stream()
                .mapToInt(el->el.getCourse())
                .boxed()         //int to Integer
                .collect(Collectors.toList());
        System.out.println(list);

        List<Double> listDouble = students.stream()
                .sorted((s1,s2)-> (int) (s1.getAvgGrade()-s2.getAvgGrade()))
                .mapToDouble(el->el.getAvgGrade())
                .boxed()         //double to Double
                .collect(Collectors.toList());
        System.out.println(listDouble);


        //   Sum
        int sum = students.stream().mapToInt(value -> value.getCourse()).sum();
        System.out.println(sum);

        //   AverageGrade
        double averageGrade = students.stream().mapToInt(value -> value.getCourse()).average().getAsDouble();
        System.out.println(averageGrade);

        //Min
        int min = students.stream().mapToInt(value -> value.getCourse()).min().getAsInt();
        System.out.println(min);

        //Max
        int max = students.stream().mapToInt(value -> value.getCourse()).max().getAsInt();
        System.out.println(max);

    }
}
