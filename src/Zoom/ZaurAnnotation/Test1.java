package Zoom.ZaurAnnotation;

public class Test1 {
    public static void main(String[] args) {
        Parent p = new Child("Maksim");
        p.showInfo();
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
