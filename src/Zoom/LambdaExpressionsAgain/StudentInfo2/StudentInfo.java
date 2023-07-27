package Zoom.LambdaExpressionsAgain.StudentInfo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Function;

//interface StudentChecks {
//    boolean check(Student s);
//}

public class StudentInfo {
    void testStudents(ArrayList<Student> arrayList, Predicate<Student> studentChecks) {
        for (Student student : arrayList) {
            if (studentChecks.test(student)) {
                System.out.println(student);
            }
        }

    }
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


        //Predicate<T> -------- boolean test(T t);
        //   removeif

        //Supplier<T> ----------- T get();

        //Consumer<T> ----------- void accept(T t);
        // forEach

        //Function<T,R> ------------ R apply(T t);


////        Comparator<Student> comparatorOfAge = (o1, o2) -> o1.age - o2.age;
////        Collections.sort(students, comparatorOfAge);
////        System.out.println(students);
//
//        Predicate<Student>p1 = student -> student.avdGrade > 10;
//        Predicate<Student>p2 = student -> student.sex == 'm';
//
//        //studentInfo.testStudents(students,p1.and(p2));// Есть еще .or
//        studentInfo.testStudents(students,p1.negate());
//
//       // studentInfo.testStudents(students , student -> student.age > 20);

        Function<Student , Double> f = student -> student.avdGrade;
        double result = avgOfSmth(students , student -> (double) student.age);
        System.out.println(result);
    }
    private static double avgOfSmth(List<Student>students , Function<Student,Double>function){
        double result = 0;
        for (Student student : students) {
            result += function.apply(student);
        }
        return result / students.size();
    }
}

//class CheckOverGrade implements StudentChecks {
//    @Override
//    public boolean check(Student s) {
//        return s.avdGrade > 8;
//    }
//}
