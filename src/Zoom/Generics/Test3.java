package Zoom.Generics;

import Zoom.Generics.TestClass.AddTenList;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.function.Supplier;

public class Test3 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        if (integerArrayList.getClass() == stringArrayList.getClass()) {
            System.out.println("Yes");
        }

        AddTenList<Rectangle> addTenList = new AddTenList<>(Rectangle::new);
    }
}


class TestClass<T extends Comparable<T>> {
    private void handle(T operand) {

    }

    private void handle(Object object) {

    }

    public static class AddTenList<T> {
        private ArrayList<T> list = new ArrayList<>();

        public AddTenList(Supplier<T> factory) {
            for (int i = 0; i < 10; i++) {
                list.add(factory.get());
            }
        }
        public ArrayList<T> getList() {
            return list;
        }
    }
}
