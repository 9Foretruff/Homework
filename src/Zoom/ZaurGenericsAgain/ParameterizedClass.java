package Zoom.ZaurGenericsAgain;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<Integer> integerInfo = new Info<>(5);
        System.out.println(integerInfo.toString());
        Integer s = integerInfo.getValue();

        Info<String> stringInfo = new Info<>("Hello !!!");
        System.out.println(stringInfo.toString());
        String s1 = stringInfo.getValue();

    }
}

class Info<T> {
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

    public T getValue() {
        return value;

    }
}
