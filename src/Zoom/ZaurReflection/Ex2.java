package Zoom.ZaurReflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class empolyeeClass = Class.forName("Zoom.ZaurReflection.Employee");

//        Employee o = (Employee) empolyeeClass.newInstance();
//        System.out.println(o);  // устаревший

        Constructor<Employee> constructor1 = empolyeeClass.getConstructor();
        Employee obj1 = constructor1.newInstance();

        Constructor constructor2 = empolyeeClass.getConstructor(int.class, String.class, String.class);
        Object obj2 = constructor2.newInstance(12,"Maksim","it");
        System.out.println(obj2);

        Method method = empolyeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2,800.88);
        System.out.println(obj2);


    }
}
