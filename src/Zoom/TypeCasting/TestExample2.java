package Zoom.TypeCasting;

import java.util.ArrayList;
import java.util.List;

public class TestExample2 {
    public void hello() {
        System.out.println("9999999");
    }
}

class b extends TestExample2 {
    String name = "Hello";

    public void hello() {
        System.out.println("!!!!!!!!");
    }
}

class Main {
    public static void main(String[] args) {
//        b b = new b();
//        TestExample2 testExample2 = b;
//        testExample2.hello();
//        String chosen = "Pineapple";
//        String answer;
//        answer = switch (chosen) {
//            case "Pineapple" -> {
//                System.out.println("hello");
//                System.out.println(2);
//                yield "Hello";
//            }
//            case "Hello" -> {
//                System.out.println("error");
//                yield "Ola";
//            }
//            default -> "Ok";
//        };
//
//        System.out.println(answer);
        b  b  = new b();
        List<TestExample2>testExample2s = new ArrayList<>();
        testExample2s.add(b);
        System.out.println(testExample2s);
    }
}
