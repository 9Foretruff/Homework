package Collections;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Maks", 2);
        Student2 st2 = new Student2("Ivan", 1);
        Student2 st3 = new Student2("Anya", 1);
        Student2 st4 = new Student2("Katya", 3);
        Student2 st5 = new Student2("Oleg", 2);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList = " + student2LinkedList);
        // LinkedList связанный спискок . каждый обект указывает друг на друга   head - tail
        System.out.println(student2LinkedList.get(2));
        //Doubly = знает и прошлую сылку и следущию
        //Singly = знает только сдедущию
        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 2);
        student2LinkedList.add(st6);
        student2LinkedList.add(1,st7);
        student2LinkedList.remove(3);
        System.out.println("LinkedList = " + student2LinkedList);


    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

}
