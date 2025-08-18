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
        if (this.price < o.price) return -1;
        else if (this.price > o.price) return 1;
        else return 0;
    }



}
