package Stream;

import java.util.ArrayList;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 22, 2, 10.2);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Student first = students.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        }).filter(student -> student.getSex() == 'm').sorted((s1, s2) -> s1.getAge() - s2.getAge()).findFirst().get();
        System.out.println(first);

    }
}
