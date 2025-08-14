package java_advanced_01.day15.linkedlistEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx01 {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        node1.next = node2;     // 노드 인스턴스간 연결
        Node<Integer> head = node1;

    }
}
