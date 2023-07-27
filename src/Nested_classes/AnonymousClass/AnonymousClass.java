package Nested_classes.AnonymousClass;

interface Math {
    int doOperation(int a, int b);
}

public class AnonymousClass {
    private int i = 5;
    public static void main(String[] args) {
        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                AnonymousClass anonymousClass = new AnonymousClass();
                return a + b + anonymousClass.i;
            }
        };
        System.out.println(math.doOperation(5, 12));

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(math2.doOperation(3, 5));

        Math2 math21 = new Math2(){
            @Override
            int doOperation(int a, int b) {
                return super.doOperation(a, b);
            }
        };
        System.out.println(math21.doOperation(21,5));

    }
}

class Math2 {
    int doOperation(int a, int b) {
        return a % b;
    }
}
