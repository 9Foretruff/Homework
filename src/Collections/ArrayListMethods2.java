package Collections;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Tanya",'f',18,1,10.5);
        Student st3 = new Student("Nikita",'m',17,2,6.3);
        Student st4 = new Student("Katya",'f',19,4,10.2);
        Student st5 = new Student("Maks",'m',17,2,11.2);
        ArrayList<Student>students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        Student st6 = new Student("Ivan",'m',22,3,8.3);
     //   System.out.println(students.remove(st6));
        System.out.println(students.indexOf(st6));

    }

}

class Student{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }

    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
