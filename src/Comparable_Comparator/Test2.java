package Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee(50,"Maks","Rokitko",5000);
        Employee employee1 = new Employee(10,"Maks","Yutin",10000);
        Employee employee2 = new Employee(25,"Vova","Rokitko",25000);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        System.out.println("List before sorting : \n" + employeeList);
        Collections.sort(employeeList);
        System.out.println("List after sorting :  \n" + employeeList);
    }
}


class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
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
    public int compareTo(Employee anotherEmployee) {
//       if (this.id == anotherEmployee.id){
//           return 0;
//       }else if (this.id > anotherEmployee.id){
//           return 1;
//       }else {
//           return -1;
//       }
//       return this.id - anotherEmployee.id;
//        return this.id.compareTo(anotherEmployee.id);
        int result = this.name.compareTo(anotherEmployee.name);
        if (result == 0){
            result = this.surname.compareTo(anotherEmployee.surname);
        }
        return result;
    }

}