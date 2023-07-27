package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;

public class SkipExample {
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

        students.stream().filter(student -> student.getAge() < 22).forEach(System.out::println);
        System.out.println("*************");
        students.stream().filter(student -> student.getAge() < 22).limit(3).forEach(System.out::println);
        System.out.println("*************");
        students.stream().filter(student -> student.getAge() < 22).skip(3).forEach(System.out::println);
    }
}
