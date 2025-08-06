package javabasic_02.day11.inheritance.familyEx.family02;

public class SubSon extends SubFather {

    private String name = "홍길동";

    void printSon() {
        System.out.println("나는 아들입니다");
        System.out.println("나는 아버지로부터 상속받습니다.");
        System.out.println("나의 아버지는 " + this.getFamilyName());
        System.out.println("나의 집은 " + this.gethouseAddress());
    }


}
