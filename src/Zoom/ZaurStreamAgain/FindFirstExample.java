package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {
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

        Student studentFirst = students.stream().map(student -> {
                    student.setName(student.getName().toUpperCase());
                    return student;
                }).filter(student -> student.getSex() == 'f')
                .sorted((o1, o2) -> o1.getAge()-o2.getAge())
                .findFirst().get();
        System.out.println(studentFirst);

    }
}
