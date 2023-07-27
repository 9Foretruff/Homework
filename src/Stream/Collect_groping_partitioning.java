package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collect_groping_partitioning {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 22, 4, 10.2);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        Map<Integer,List<Student>>integerListMap = students.stream().map(student -> {
//            student.setName(student.getName().toUpperCase());
//            return student;
//        }).collect(Collectors.groupingBy(student -> student.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>>integerEntry:integerListMap.entrySet()) {
//            System.out.println("Key of list : " + integerEntry.getKey() + " Value of list : " + integerEntry.getValue());
//        }

//        Map<Integer,List<Student>>integerListMap = students.stream().map(student -> {
//            student.setName(student.getName().toUpperCase());
//            return student;
//        })

        Map<Boolean, List<Student>> listMap = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 10.5));

        for (Map.Entry<Boolean, List<Student>> integerEntry : listMap.entrySet()) {
            System.out.println(integerEntry.getKey() + " " + integerEntry.getValue());
        }

    }
}
