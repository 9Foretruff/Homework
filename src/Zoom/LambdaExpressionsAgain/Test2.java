package Zoom.LambdaExpressionsAgain;

interface I {
    int abc(String s);
}

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Hello!"));
    }

    public static void main(String[] args) {
        int i = 5;
        // i = 2; // только final or effective final
        def(s -> {
            System.out.println(i);
            return i + s.length();
        });
    }
}
