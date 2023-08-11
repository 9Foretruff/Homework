package Zoom.ZaurAnnotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String os() default "Android";

    int yearOfCompanyCreation() default 2010;
}

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomi = Class.forName("Zoom.ZaurAnnotation.Xiaomi");
        Annotation annotation = xiaomi.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation;
        System.out.println("Annotation info from Xiaomi class: " + sm1.os() + " , " + sm1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("Zoom.ZaurAnnotation.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class: " + sm2.os() + " , " + sm2.yearOfCompanyCreation());
    }
}

@SmartPhone()
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(os = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
