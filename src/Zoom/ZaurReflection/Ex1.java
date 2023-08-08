package Zoom.ZaurReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employee1 = Class.forName("Zoom.ZaurReflection.Employee");
//        Class employee2 = Employee.class;
//        Employee employee = new Employee();
//        Class employee3 = employee.getClass();
        Field someField = employee1.getField("id");
        System.out.println("Type of id field = " + someField.getType());
        System.out.println("___________________");

        Field[] fields = employee1.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("___________________");

        Field[] allFields = employee1.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }

        System.out.println("___________________");

        Method someMethod1 = employee1.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType()
                + " , parameter types " + Arrays.toString(someMethod1.getParameterTypes()));


        System.out.println("___________________");

        Method someMethod2 = employee1.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType()
                + " , parameter types " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("___________________");

        Method[] allMethods = employee1.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method = " + method.getName() +
                    " , return type = " + method.getReturnType() + " , parameter types = "
                    + Arrays.toString(method.getParameterTypes()));
        }


        System.out.println("___________________");

        Method[] allMethods2 = employee1.getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method = " + method.getName() +
                        " , return type = " + method.getReturnType() + " , parameter types = "
                        + Arrays.toString(method.getParameterTypes()));
            }
        }

        System.out.println("___________________");

        Constructor constructor1 = employee1.getConstructor();
        System.out.println("Constructor has " + constructor1.getParameterCount() +
                " parameters , their types are : " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("___________________");

        Constructor constructor2 = employee1.getConstructor(int.class, String.class, String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() +
                " parameters , their types are : " + Arrays.toString(constructor2.getParameterTypes()));

        System.out.println("___________________");

        Constructor[] allConstructors = employee1.getConstructors();
        for (Constructor constructor : allConstructors) {
            System.out.println("Constructor name = " + constructor.getName() + " , has " + constructor.getParameterCount() +
                    " parameters , their types are : " + Arrays.toString(constructor.getParameterTypes()));
        }

        System.out.println("___________________");

        Constructor[] allConstructors2 = employee1.getDeclaredConstructors();
        for (Constructor constructor : allConstructors2) {
            System.out.println("Constructor name = " + constructor.getName() + " , has " + constructor.getParameterCount() +
                    " parameters , their types are : " + Arrays.toString(constructor.getParameterTypes()));
        }
    }
}
