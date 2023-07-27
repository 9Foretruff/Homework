package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;

public class MinMaxExample {
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

        //Min and Max
        Student student = students.stream().min((o1, o2) -> {
            if (o1.getAge() - o2.getAge()==0){
                return (int) (o1.getAvdGrade() - o2.getAvdGrade());
            }
            return o1.getAge() - o2.getAge();
        }).get();
        Student student1 = students.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get();
        System.out.println(student1);
        System.out.println(student);


    }
}
