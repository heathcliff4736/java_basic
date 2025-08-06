package javabasic_02.day11.inheritance.familyEx.family01;

public class Son extends Father {

    private String name = "홍길동";

    void printDetails() {
        System.out.println("나의 이름은 " + this.name);
        System.out.println("나의 아버지는 " + this.getFamilyName());
        System.out.println("나의 집은 " + this.gethouseAddress());
    }


}
