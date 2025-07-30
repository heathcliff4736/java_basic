package javabasic_01.day03;

import java.util.Scanner;

public class BlockScope {
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);

        System.out.print("이름입력: ");
        String name = sc1.nextLine();
        callName(name);

        for(int i=0; i<1; i++){
            callName(name);
        }

//        System.out.println("나의 이름은 "+ name);
    }

    private static void callName(String name){
        System.out.println("나의 이름은 "+ name);
        System.out.print("직무입력: ");
        String job = sc1.nextLine();
        System.out.println(job + "입니다.");
    }
}
