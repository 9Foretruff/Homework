package Zoom.ZaurCollectionsAgain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);

        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);


//        System.out.println(arrayList);
//        int index1 = Collections.binarySearch(arrayList,12);
//        System.out.println(index1);  // если число отрицательное то такого числа не нашли

//        Employee emp1 = new Employee(77, "Zaur", 20000);
//        Employee emp2 = new Employee(87, "Bulka", 10000);
//        Employee emp3 = new Employee(23, "Oleg", 1000);
//        Employee emp4 = new Employee(77, "Maksim", 120000);
//        Employee emp5 = new Employee(31, "Ihor", 50000);
//        Employee emp6 = new Employee(7, "Vladimir", 80000);
//        Employee emp7 = new Employee(12, "Nikita", 35000);
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//        System.out.println(employeeList);
//        Collections.sort(employeeList);
//        System.out.println(employeeList);
//        int index2 = Collections.binarySearch(employeeList
//                ,new Employee(77, "Maksim", 120000));
//        System.out.println(index2);
//        System.out.println(employeeList.indexOf(new Employee(77, "Maksim", 120000)));

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println(index3);

    }

}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(anotherEmp.name);
        }
        return result;
    }
}
