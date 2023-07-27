package Stream;

import java.util.ArrayList;
import java.util.List;

public class Limit {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 29, 2, 10.7);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);//
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);//
        List<Student>students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().filter(student -> student.getAge() > 19).sorted((o1, o2) -> Double.compare(o2.getAvgGrade(), o1.getAvgGrade())).limit(2).forEach(System.out::println);
        // students.stream().filter(student -> student.getAge() > 19).sorted((x,y)-> (int) (x.getAvgGrade()- y.getAvgGrade())).limit(2).forEach(System.out::println);

        long sum = (long) (5.7 * 100000000000L);
        System.out.println(sum);
        System.out.println(1.0 * sum / 100000000000L);

    }
}
