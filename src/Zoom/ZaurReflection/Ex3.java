package Zoom.ZaurReflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(12,"Maksim","it");
        Class employeeClass = employee.getClass();
        Field filed = employeeClass.getDeclaredField("salary");

        filed.setAccessible(true);
        double salary = (double) filed.get(employee);
        System.out.println(salary);

        filed.setDouble(employee,9.2);
        System.out.println(employee);
    }
}
