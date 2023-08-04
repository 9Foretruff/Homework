package Zoom.CovarianceContravariance;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { // Инвариантный
        Fruit fruit = new Fruit();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

        citrus = orange;
        fruit = citrus;
        fruit = orange;

//        citrus = fruit;
//        orange = citrus;

        ArrayList<Citrus> citrusArrayList = new ArrayList<>();

        fruit = citrusArrayList.get(0);
        citrus = citrusArrayList.get(0);
//        orange = citrusArrayList.get(0);

        ArrayList<Orange> orangeArrayList = new ArrayList<>();

//        citrusArrayList = orangeArrayList;

        totalWeight(citrusArrayList);
        totalWeight(orangeArrayList);

        addOrange(citrusArrayList);
        addOrange(orangeArrayList);

        //citrusArrayList.add(new Orange());

    }

    private static int totalWeight(ArrayList<? extends Citrus> oranges) { // ковариантность
        int weight = 0;
        for (int i = 0; i < oranges.size(); i++) {
            weight += oranges.get(i).weight;
        }
        Fruit fruit = oranges.get(0);
//        oranges.add(new Citrus());
        return weight;
    }

    private static void addOrange(ArrayList<? super Orange> oranges) { // контравариантность
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
            oranges.add(new BigRoundOrange());
        }
    }

    static class Fruit {
        int weight;
    }

    static class Citrus extends Fruit {
        int weight;
    }

    static class Orange extends Citrus {
        int color;
    }

    static class BigRoundOrange extends Orange {
        int size = 100;
    }
}
