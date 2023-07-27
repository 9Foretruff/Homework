package Lambda_Expression;

interface I {
    int abc(String s);
}

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Privet"));
    }

    public static void main(String[] args) {
        int i = 10;

        def((s) -> {
            System.out.println(i);
            return s.length() + i;
        });
        System.out.println();
    }

}