package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("A");
        StringBuilder stringBuilder2 = new StringBuilder("B");
        StringBuilder stringBuilder3 = new StringBuilder("C");
        StringBuilder stringBuilder4 = new StringBuilder("D");
        StringBuilder[]array = {stringBuilder1,stringBuilder2,stringBuilder3,stringBuilder4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
//        array[0].append("!!!");
        array[0] = new StringBuilder("f");
        System.out.println(list);







//        stringBuilder1.append(5);
//        System.out.println(stringBuilder1);
//        stringBuilder1.delete(0,1);
//        System.out.println(stringBuilder1);
//        stringBuilder1.replace(0,1,"Hello");
//        System.out.println(stringBuilder1);
    }
}
