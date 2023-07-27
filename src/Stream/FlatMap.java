package Stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 22, 2, 10.2);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);

        Faculty f1 = new Faculty("Ipz-21k-2");
        Faculty f2 = new Faculty("Kn-21k-2");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);
        List<Faculty>faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);
        faculties.stream().flatMap(faculty -> faculty.getStudentList().stream()).forEach(student -> System.out.println(student.getName()));


    }
}

class Faculty {
    String name;
    List<Student> studentList;

    public Faculty(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentToFaculty(Student student){
        studentList.add(student);
    }

}
