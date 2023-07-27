package Lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


//interface StudentCheck {
//    boolean check(Student s);
//}

public class StudentInfo {

    void testStudents(ArrayList<Student> arrayList, Predicate<Student> sc) {
        for (Student s : arrayList) {
            if (sc.test(s)) {
                System.out.println(s);
            }
        }
    }


//    void printStudentOverGrade(ArrayList<Student> arrayList, double grade) {
//        for (Student s : arrayList) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentUnderAge(ArrayList<Student> arrayList, int age) {
//        for (Student s : arrayList) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMixCondition(ArrayList<Student> arrayList, int age, double grade, char sex) {
//        for (Student s : arrayList) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex){
//                System.out.println(s);
//            }
//        }
//    }

}

class Test {
    Function<Student, Double> f = student -> student.avgGrade;

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 1, 10.3);
        Student st2 = new Student("Maks", 'm', 22, 2, 11.3);
        Student st3 = new Student("Ivan", 'm', 22, 2, 10.2);
        Student st4 = new Student("Elena", 'f', 19, 1, 4.7);
        Student st5 = new Student("Kolya", 'm', 18, 3, 8.3);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
//        Collections.sort(students, (student1, student2) -> student1.course - student2.course);
//        students.forEach(s -> System.out.println(s));


//        Predicate<Student> sc = s ->  s.age < 20;
//        Predicate<Student> sc2 = s ->  s.sex == 'f';
//
//
//        //studentInfo.testStudents(students,sc.and(sc2));
//        studentInfo.testStudents(students , sc.negate());

//        studentInfo.testStudents(students, new CheckOverGrade());
//        System.out.println("------------------");
//        studentInfo.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.age < 30 ;
//            }
//        });

//        studentInfo.testStudents(students, (Student s) -> {return s.avgGrade > 10.5;});
//        studentInfo.testStudents(students, s -> {
//            System.out.println("hello");
//            return s.avgGrade > 10.5;
//        });
//
//
//        System.out.println("------------------");
//        studentInfo.testStudents(students, (Student s) -> {
//            return s.age < 30;
//        });
//        System.out.println("------------------");
//        studentInfo.testStudents(students, (Student s) -> {
//            return s.age > 18 && s.avgGrade > 2 && s.sex == 'f';
//        });

//        studentInfo.printStudentOverGrade(students,8);
//        System.out.println("------------------");
//        studentInfo.printStudentUnderAge(students,30);
//        System.out.println("------------------");
//        studentInfo.printStudentMixCondition(students,18,11,'m');


        Function<Student , Double> f = student -> student.avgGrade;
        double byAvg = avgOfSmth(students , (s) -> s.avgGrade );
        double byCourse = avgOfSmth(students , (s) -> (double)s.course );
        double byAge = avgOfSmth(students , (s) -> (double)s.age );
        System.out.println(byAvg);
        System.out.println(byCourse);
        System.out.println(byAge);
    }

    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student student : list) {
            result += f.apply(student);
        }
        return result / list.size();
    }
}

//class CheckOverGrade implements StudentCheck {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}



