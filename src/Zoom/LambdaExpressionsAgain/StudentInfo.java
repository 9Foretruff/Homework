package Zoom.LambdaExpressionsAgain;

import java.util.ArrayList;

interface StudentChecks {
    boolean check(Student s);
}

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, StudentChecks studentChecks) {
        for (Student student : arrayList) {
            if (studentChecks.check(student)) {
                System.out.println(student);
            }
        }
    }

//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//        for (Student student : al) {
//            if (student.avdGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for (Student student : al) {
//            if (student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student student : al) {
//            if (student.age > age && student.avdGrade < grade && student.sex == sex) {
//                System.out.println(student);
//            }
//        }
//    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm', 22, 3, 8.3);
        Student st2 = new Student("Maksim", 'm', 17, 1, 11.3);
        Student st3 = new Student("Nikita", 'm', 17, 1, 9.3);
        Student st4 = new Student("Nastya", 'f', 21, 4, 10.3);
        Student st5 = new Student("Natalia", 'f', 18, 2, 11.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(students, new CheckOverGrade());
//        System.out.println("---------------------------");
//        studentInfo.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 20;
//            }
//        });
        studentInfo.testStudents(students, s -> s.avdGrade > 8);

        StudentChecks studentChecks = s -> s.avdGrade > 8;

        System.out.println("---------------------------");

        studentInfo.testStudents(students,studentChecks);

        System.out.println("---------------------------");

        studentInfo.testStudents(students, s -> s.age < 18);
        System.out.println("---------------------------");
        studentInfo.testStudents(students, s ->
                s.age > 15 && s.avdGrade > 10 && s.sex == 'm');
//        studentInfo.printStudentOverGrade(students, 9);
//        System.out.println("---------------------------");
//        studentInfo.printStudentUnderAge(students, 18);
//        System.out.println("---------------------------");
//        studentInfo.printStudentMixCondition(students, 18, 9, 'm');
//        System.out.println("---------------------------");
    }
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avdGrade > 8;
    }
}
