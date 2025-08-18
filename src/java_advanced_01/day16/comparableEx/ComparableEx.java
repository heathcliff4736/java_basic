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

    }
}
