package Zoom.ZaurGenericsAgain;

import java.util.ArrayList;

public class Subtyping {
    public static void main(String[] args) {
//        X x = new Y();
//        List<X>list = new ArrayList<>();

//        List<Number>list = new ArrayList<Integer>();
//        list.add(18);
//        list.add(3.14);

        Info5<Integer> integerInfo5 = new Info5<>(5);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        Info5.getSecond(arrayList);
    }
}

class Info5<T extends Number > { // & для интерфейсов

    private T value;

    public Info5(T value) {
        this.value = value;
    }

    public static <T extends Integer> void getSecond(ArrayList<T> list) {
        System.out.println(list.get(1));
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


class X {

}

class Y extends X {

}

