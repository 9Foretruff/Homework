package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test3_Comparator {
    public static void main(String[] args) {
        List<Employees> employeeList1 = new ArrayList<>();
        Employees employee5 = new Employees(50, "Maks", "Rokitko", 5000);
        Employees employee6 = new Employees(10, "Maks", "Yutin", 10000);
        Employees employee7 = new Employees(25, "Vova", "Rokitko", 25000);
        employeeList1.add(employee5);
        employeeList1.add(employee6);
        employeeList1.add(employee7);
        System.out.println("List before sorting : \n" + employeeList1);
        Collections.sort(employeeList1,new SalaryComparator());
        System.out.println("List after sorting :  \n" + employeeList1);
    }
}

class Employees
        implements Comparable<Employees>
{
    int id;
    String name;
    String surname;
    int salary;

    public Employees(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employees anotherEmployee) {
       if (this.id == anotherEmployee.id){
           return 0;
       }else if (this.id > anotherEmployee.id){
           return 1;
       }else {
           return -1;
       }
//       return this.id - anotherEmployee.id;
//        return this.id.compareTo(anotherEmployee.id);
//        int result = this.name.compareTo(anotherEmployee.name);
//        if (result == 0){
//            result = this.surname.compareTo(anotherEmployee.surname);
//        }
//        return result;
    }

}

//class IdComparator implements Comparator<Employees> {
//
//    @Override
//    public int compare(Employees firstEmployee, Employees secondEmployee) {
//        if (firstEmployee.id == secondEmployee.id) {
//            return 0;
//        } else if (firstEmployee.id > secondEmployee.id) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//}

class NameComparator implements Comparator<Employees>{

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employees>{

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.salary  - o2.salary;
    }
}
