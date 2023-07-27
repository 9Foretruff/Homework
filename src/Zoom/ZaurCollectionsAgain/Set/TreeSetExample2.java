package Zoom.ZaurCollectionsAgain.Set;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student>treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Maksim",3);
        Student st3 = new Student("Nikita",4);
        Student st4 = new Student("Ihor",2);
        Student st5 = new Student("Oleg",1);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        Student st6 = new Student("Ivan",1);
        Student st7 = new Student("Katya",3);


        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st7));
        System.out.println(treeSet.tailSet(st6));
        System.out.println(treeSet.subSet(st6,st7));

        System.out.println(st2.equals(st7));
        System.out.println(st2.hashCode() == st7.hashCode());
    }
}

class Student implements Comparable<Student>{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
      return this.course - o.course;
    }
}
