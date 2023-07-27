package Zoom.ZaurNestedAgain;

public class OuterClass {
    private static int staticField = 10;
    private int instanceField = 20;

    public class InnerClass {
        // Невозможно объявить статическое поле здесь
         private static int innerStaticField = 30;

        private int innerInstanceField = 40;

        public void printFields() {
            System.out.println(staticField);
            System.out.println(instanceField);
            System.out.println(innerInstanceField);
        }
    }

    public static class StaticInnerClass {
        private static int innerStaticField = 30;
        private int innerInstanceField = 40;

        public void printFields() {
            System.out.println(staticField);
            // Невозможно обратиться к instanceField здесь
            StaticInnerClass staticInnerClass = new StaticInnerClass();
            System.out.println(staticInnerClass.innerInstanceField);
            // System.out.println(instanceField);
            System.out.println(innerStaticField);
            System.out.println(innerInstanceField);
        }
    }
}
