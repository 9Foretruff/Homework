package Zoom.StaticBlocks;

import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("hello from main");
    }
    static {
        System.out.println("hello");
    }
}