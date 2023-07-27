package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapToIntExample {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 22, 3, 8.3);
        Student st2 = new Student("Maksim", 'm', 17, 1, 11.3);
        Student st3 = new Student("Nikita", 'm', 17, 1, 9.3);
        Student st4 = new Student("Nastya", 'f', 21, 4, 10.3);
        Student st5 = new Student("Natalia", 'f', 18, 2, 11.2);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        List<Integer> agesOfStudents = students.stream()
                .mapToInt(value -> value.getAge())
                .boxed()  // int - to Integer !!!!!!!!!!!!!!!!!!!!!
                .collect(Collectors.toList());

        System.out.println(agesOfStudents);

        int sum = students.stream().mapToInt(value -> value.getCourse()).sum();
        System.out.println(sum);

        double average = students.stream().mapToInt(value -> value.getCourse()).average().getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(value -> value.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(value -> value.getCourse()).max().getAsInt();
        System.out.println(max);


    }
}
