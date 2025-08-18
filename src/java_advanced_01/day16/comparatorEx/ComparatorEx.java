package java_advanced_01.day16.comparatorEx;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());
        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Banana", 5));

        for (Fruit fruit : fruits) System.out.println(fruit.name + " " + fruit.price);
    }
}
