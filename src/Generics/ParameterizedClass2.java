package Generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String,Integer> integerPair = new Pair<>("Maks",17);
        System.out.println("Your name = " + integerPair.getName() + "\nYour id = " + integerPair.getId());

        Pair<Integer,Double> integerPair1 = new Pair<>(17,5d);
        System.out.println("Your name = " + integerPair1.getName() + "\nYour id = " + integerPair1.getId());
        OtherPair<String>name = new OtherPair<>("Maksim" , "17");
        System.out.println(name);
    }

}

class Pair<V1, V2> {
    private V1 name;
    private V2 id;

    public Pair(V1 name, V2 id) {
        this.name = name;
        this.id = id;
    }

    public V1 getName() {
        return name;
    }

    public V2 getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }
}

class OtherPair<V1> {
    private V1 name;
    private V1 id;

    public V1 abc (V1 temp){
        return temp;
    }

    public OtherPair(V1 name, V1 id) {
        this.name = name;
        this.id = id;
    }

    public V1 getName() {
        return name;
    }

    public V1 getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }
}