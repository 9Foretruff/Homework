package Zoom.ZaurGenericsAgain;

public class TypeErasure {
    public static void main(String[] args) {

    }

//    public void abc(Info1<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info1<Integer> info) {
//        Integer integer = info.getValue();
//    }
    // abc (Info info)
}

class Info1<T> {
    private T value;

    public Info1(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

//class Parent {
//    public void abc(Info1<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent {
//    public void abc(Info1<Integer> info) {
//        Integer integer = info.getValue();
//    }
//}

