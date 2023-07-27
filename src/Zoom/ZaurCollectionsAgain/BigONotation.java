package Zoom.ZaurCollectionsAgain;

public class BigONotation {
    public static void main(String[] args) {

        int[] array = new int[4];
        array[0] = 3;
        array[1] = 8;
        array[2] = 6;      // array[2] = 102 + 2 * 4 = 100
        array[3] = -6;     // {  3  ,  8  ,  5  ,  -6  }
                           //   102   106   110   114
        // O(1) , O(n) , O(log n);


        String[] m = new String[4];
        m[0] = "a";
        m[1] = "b";
        m[2] = "c";
        m[3] = "d";
        
    }
}
