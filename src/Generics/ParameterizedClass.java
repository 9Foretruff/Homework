package Generics;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info <String> stringInfo = new Info<>("hello");
//        System.out.println(stringInfo);
//        String s = stringInfo.getValue();

        Info<Integer>integerInfo = new Info<>(5);
        System.out.println(integerInfo);
        Integer s1 = integerInfo.getValue();

        Info<Double>integerInfo2 = new Info<>(5.66);
        System.out.println(integerInfo2);
        Double s2 = integerInfo2.getValue();
    }

//    public void abc (Info<String> info){
//        String s = info.getValue();
//    }
//
//    public void abc2 (Info<Integer> info){
//        Integer s = info.getValue();
//    }

}

class Info <T extends Number  > { // IMPLEMNETS &I1 &I2
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue(){
        return value;
    }
}

interface I1{}
interface I2{}


//class Parent{
//        public void abc (Info<String> info){
//        String s = info.getValue();
//    }
//
//}

//class Child extends Parent{
//    public void abc (Info<Integer> info){
//        Integer s = info.getValue();
//    }
//
//}

class Bus{
    @Override
    public String toString() {
        return "Bus{}";
    }
}
