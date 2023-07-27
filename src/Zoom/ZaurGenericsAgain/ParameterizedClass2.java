package Zoom.ZaurGenericsAgain;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(5, "Hello");
        System.out.println(pair.getValue1() + pair.getValue2());

        OtherPair<Integer> integerOtherPair = new OtherPair<>(5, 5);
        System.out.println(integerOtherPair.getValue1() + integerOtherPair.getValue2());
    }
}


class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

class OtherPair<V1> {
    private V1 value1;
    private V1 value2;

    public V1 hello(){
        return value1;
    }

    public OtherPair(V1 value1, V1 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V1 getValue2() {
        return value2;
    }
}