package Zoom.ZaurAnnotation;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Maksim");
        p.showInfo();
        Integer i1 = -127;
        Integer i2 = -127; // Просто пример . если сравнивать Integer от -128 до 127
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
    }
}

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated
    void showInfo() {
        System.out.println("It's Parent class . name = " + name);
    }
}

class Child extends Parent {

    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo() {
        System.out.println("It's Child class . name = " + name);
    }

}
