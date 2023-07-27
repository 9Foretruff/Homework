package Zoom.ZaurCollectionsAgain.mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Maksim","Rokitko",3);
        Student st2 = new Student("Nikita","Potomkin",1);
        Student st3 = new Student("Katya","Ivanova",4);
        map.put(st1,9.2);
        map.put(st2,8.1);
        map.put(st3,11.2);
        System.out.println(map);

        Student st4 = new Student("Maksim","Rokitko",3);
        Student st5 = new Student("Ihor","Utin",4);
//        boolean result = map.containsKey(st4);
//        System.out.println(result);
//        System.out.println(st1.equals(st4));

        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());

        for (Map.Entry<Student,Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

final class Student implements Comparable<Student>{
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surname = surName;
        this.course = course;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", surName='" + surname + '\'' +
                ", course=" + course +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }


//    @Override
//    public int hashCode() {
//        return name.length() * 7  + surname.length() * 11 + course * 53;
//    }

}
