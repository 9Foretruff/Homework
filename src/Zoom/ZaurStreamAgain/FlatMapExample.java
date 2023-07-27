package Zoom.ZaurStreamAgain;

import java.util.ArrayList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 22, 3, 8.3);
        Student st2 = new Student("Maksim", 'm', 17, 1, 11.3);
        Student st3 = new Student("Nikita", 'm', 17, 1, 9.3);
        Student st4 = new Student("Nastya", 'f', 21, 4, 10.3);
        Student st5 = new Student("Natalia", 'f', 18, 2, 11.2);

        Faculty f1 = new Faculty("Ipz-21k-2");
        Faculty f2 = new Faculty("Ipz-21k-1");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);
        List<Faculty>faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);
        faculties.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream()).forEach(student -> System.out.println(student.getName()));
        
    }
}

class Faculty{
    String name;
    List<Student>studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student){
        studentsOnFaculty.add(student);
    }

}
