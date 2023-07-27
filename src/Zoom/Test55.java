package Zoom;

import java.util.Arrays;
import java.util.Scanner;

public class Test55 {
    public static String[] strings;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String type = strings[i];
            for (int j = 0; j < strings.length; j++) {
                if (type!=null){
                    if (type.equals(strings[j])) {
                        strings[j] = null;
                        strings[i] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(strings));
    }
}
