package Zoom.BigInteger_BigDecemical;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test1 {
    public static void main(String[] args) {
        BigDecimal fifthValue = new BigDecimal(new BigInteger("44554"), 3);//44.554
        System.out.println(fifthValue);

        char[] arr = new String("455656.545").toCharArray();
        BigDecimal fourthValue = new BigDecimal(arr, 2, 6);//5656.5
        System.out.println(fourthValue);

        BigDecimal secondValue = new BigDecimal(3445.54);//3445.5399999999999636202119290828704833984375  ДАБЛ ТОТ ЕЩЕ ДУРАК . ДЕЛАЙ ВСЕ В СТРИГЕЕЕЕ!!!
        System.out.println(secondValue);

        BigDecimal firstValue = new BigDecimal("455656.545");//455656.545
        System.out.println(firstValue.add(secondValue));
        System.out.println(firstValue);

        System.out.println("19 %  12 = " + 19 % 12);
        System.out.println("19 % -12 = " + 19 % (-12));
    }
}
