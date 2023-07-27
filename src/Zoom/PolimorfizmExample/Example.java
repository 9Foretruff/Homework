package Zoom.PolimorfizmExample;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);// восходящее преобразование к базовому типу
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу

        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer);
        for (Dancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }
    }
}

class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void dance() {
        System.out.println(toString() + "Я танцую как все.");
    }

    @Override
    public String toString() {
        return "Я " + name + ", мне " + age + " лет. " ;
    }
}

class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println( toString() + "Я танцую электрик буги!");
    }
}

class BreakDankDancer extends Dancer{

    public BreakDankDancer(String name, int age) {
        super(name, age);
    }
    // переопределение метода базового класса
    @Override
    public void dance(){
        System.out.println(toString() + "Я танцую брейк-данс!");
    }
}

