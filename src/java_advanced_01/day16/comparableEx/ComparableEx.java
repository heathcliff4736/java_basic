package java_advanced_01.day16.comparableEx;

import java.util.TreeSet;

public class ComparableEx {

    public static void main(String[] args) {
        Person p1 = new Person("John", 22);
        Person p2 = new Person("Adam", 21);
        Person p3 = new Person("Amy", 27);

        TreeSet<Person> treeSet = new TreeSet<Person>();
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        for (Person p : treeSet) {
//            System.out.println(p.toString());
            System.out.print(p.name + " ");
        }
        System.out.println();



        Fruit fruit1 = new Fruit("사과", 10000);
        Fruit fruit2 = new Fruit("귤", 12000);
        Fruit fruit3 = new Fruit("복숭아", 8000);
        Fruit fruit4 = new Fruit("포도", 18000);

        TreeSet<Fruit> treeSet2 = new TreeSet<Fruit>();
        treeSet2.add(fruit1);
        treeSet2.add(fruit2);
        treeSet2.add(fruit3);
        treeSet2.add(fruit4);
        for (Fruit fruit : treeSet2) {
            System.out.print(fruit.name + " ");
        }


    }
}
