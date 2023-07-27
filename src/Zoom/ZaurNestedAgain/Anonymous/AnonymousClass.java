package Zoom.ZaurNestedAgain.Anonymous;

class Math2 {
    int doOperation(int a, int b) {
        return a / b;
    }

}

public class AnonymousClass {
    private int c = 5;
    public static void main(String[] args) {
        int ccc = 10;
        ccc = 5;
        Math2 math1 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
          //      System.out.println(ccc); НЕЛЬЗЯЯ !!!!!!!
                AnonymousClass anonymousClass = new AnonymousClass();
                System.out.println(anonymousClass.c);
                return a + b;
            }
        };
        Math2 math2 = new Math2() {
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        Math2 math  = new Math2(){
            @Override
            int doOperation(int a, int b) {
                return a / b ;
            }
        };
        System.out.println(math1.doOperation(10, 5));
        System.out.println(math2.doOperation(10, 5));
    }
}
