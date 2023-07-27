package Zoom.Generics;

import java.lang.reflect.Constructor;

public class Test1 {

}

class Box<T> {

    private T t;

    public static void main(String[] args) throws ClassNotFoundException {

        Box<String> stringBox = new Box<>();

        stringBox.set("Старая строка");
        System.out.println(stringBox.get());
        stringBox.set("Новая строка");

        System.out.println(stringBox.get());

        //stringBox.set(12345);//ошибка компиляции!
    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
