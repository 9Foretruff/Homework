package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
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

        students.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        }).filter(student -> student.getSex() == 'f')
                .sorted((o1, o2) -> o1.getAge()-o2.getAge())
                .forEach(System.out::println);
        // Source -> Intermediate methods(lazy) -> terminal method (eager)

//        students = students.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
//        System.out.println(students);

//        students.stream().filter(student -> student.getSex() == 'f').forEach(System.out::println);
//        System.out.println("*********");
//        students.stream().filter(student -> student.getAge() < 20 && student.getAvdGrade() > 10).forEach(System.out::println);

    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avdGrade;

    public Student(String name, char sex, int age, int course, double avdGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avdGrade = avdGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avdGrade=" + avdGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvdGrade() {
        return avdGrade;
    }

    public void setAvdGrade(double avdGrade) {
        this.avdGrade = avdGrade;
    }
}
