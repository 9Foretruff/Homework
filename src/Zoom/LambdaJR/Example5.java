package Zoom.LambdaJR;

interface C {
    int sum(int a, int b);
}

public class Example5 {
    public static void main(String[] args) {
        C c = (a, b) -> (a + b);
        int sum = c.sum(1,200);
        System.out.println(sum);
        int [] array = new int[]{5,4,124,12,41,241,24,124,12};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}