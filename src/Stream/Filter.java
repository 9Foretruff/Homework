package Stream;

import java.util.ArrayList;
import java.util.List;

public class Filter {
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

        students.stream().map(student -> {
            student.setName(student.getName().toUpperCase());
            return student;
        }).filter(student -> student.getSex() == 'm').sorted((s1, s2) -> s1.getAge() - s2.getAge()).forEach(System.out::println);


//        students = students.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
//        System.out.println(students);
//        students = students.stream().sorted((x, y) -> x.getCourse() - y.getCourse()).collect(Collectors.toList());
//        System.out.println(students);

//        students = students.stream().filter(student -> student.getAge() >= 18 && student.getAvgGrade() < 11).collect(Collectors.toList());
//        System.out.println(students);


//        Stream<Student>myStream = Stream.of(st1 , st2  , st3 , st4 , st5);
//        myStream.filter(student -> student.getAge() >= 18 && student.getAvgGrade() < 11).collect(Collectors.toList());
//        System.out.println(students);

    }
}

class Student {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed");
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

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
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
