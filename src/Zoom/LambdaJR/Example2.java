package Zoom.LambdaJR;

public class Example2 {
    public static void main(String[] args) {
        Object o = new Object(){
            @Override
            public String toString() {
                return "********";
            }
        };
        System.out.println(o.getClass());
    }


}
