package javabasic_02.day11.sec06.package1;

public class B {
    //메소드 선언

    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }

}