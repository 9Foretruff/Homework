package Zoom.ZaurCollectionsAgain;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Zaur", 4);
        Student2 st2 = new Student2("Maksim", 2);
        Student2 st3 = new Student2("Nikita", 2);
        Student2 st4 = new Student2("Nastya", 3);
        Student2 st5 = new Student2("Natalia", 1);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinedList : " + student2LinkedList);
        System.out.println(student2LinkedList.get(2));
        Student2 st6 = new Student2("Oleg", 3);
        Student2 st7 = new Student2("Ihor", 1);
        student2LinkedList.add(st6);
        student2LinkedList.add(1, st7);
        System.out.println("LinedList : " + student2LinkedList);
        student2LinkedList.remove(2);
        System.out.println("LinedList : " + student2LinkedList);

        // Doubly
        // Singly

        // МИМО ХОДОМ . КАК ПЕРЕВОДИТЬ В ЛУБУЮ СИСТЕМУ ИЗЧИСЛЕНИЯ!!!
        int a = 290;
        System.out.println(Integer.toString(a, 16));
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
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
