package java_advanced_01.day14.collection;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack_int = new Stack<>();

        for(int i=1; i<=5 ; i++) {
            stack_int.push(i);
            System.out.println(stack_int.peek());
        }
        stack_int.pop();
        System.out.println("Pop()");
        System.out.println(stack_int.peek());    //4출력
        System.out.println(stack_int.search(3));    //2출력
        System.out.println(stack_int.empty());

    }
}
