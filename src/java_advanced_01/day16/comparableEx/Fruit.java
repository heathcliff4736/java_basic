package java_advanced_01.day16.comparableEx;

import java.util.TreeSet;

// 과일이 있다, 과일을 가격 기준으로 오름차순 정렬할 수 있도록 비교기를 구현하세요.
public class Fruit implements Comparable<Fruit>{
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Fruit o) {
        if (this.price > o.price) return -1;
        else if (this.price < o.price) return 1;
        else return 0;
    }

    public static void main(String[] args) {
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
            System.out.println(fruit.name + " : " + fruit.price);
        }
    }
}
