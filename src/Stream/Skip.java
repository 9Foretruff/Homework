package Stream;

import java.util.ArrayList;
import java.util.List;

public class Skip {
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

        students.stream().filter(student -> student.getAge() > 19 ).forEach(System.out::println);
        System.out.println("----------------------");
        students.stream().filter(student -> student.getAge() > 19 ).limit(2).forEach(System.out::println);
        System.out.println("----------------------");
        students.stream().filter(student -> student.getAge() > 19 ).skip(1).forEach(System.out::println);
    }
}
