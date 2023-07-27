package Zoom.ZaurStreamAgain;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        // collect - terminated ( groupingBy , partitioningBy)
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
//        Map<Integer, List<Student>> collect = students.stream().map(student -> {
//            student.setName(student.getName().toUpperCase());
//            return student;
//        }).collect(Collectors.groupingBy(student -> student.getCourse()));
//        for (Map.Entry<Integer,List<Student>>listEntry : collect.entrySet()) {
//            System.out.println(listEntry.getKey() + " : " + listEntry.getValue().toString());
//        }

        Map<Boolean, List<Student>> collect = students.stream().collect(Collectors.partitioningBy(student -> student.getAge() < 20));
        for (Map.Entry<Boolean,List<Student>>listEntry : collect.entrySet()) {
            System.out.println(listEntry.getKey() + " : " + listEntry.getValue().toString());
        }


    }
}
