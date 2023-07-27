package Zoom.Recursia1;

public interface Test {
    public final int B = 5;
    default void sayHello(){
        System.out.println("hello");
    }
}
