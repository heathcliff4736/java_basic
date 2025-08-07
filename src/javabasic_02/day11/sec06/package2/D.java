package javabasic_02.day11.sec06.package2;


import javabasic_02.day11.sec06.package1.A;

public class D extends A {

    //생성자 선언
    public D(){
        super();    // extends A 의 기본생성자를 호출하여라
    }

	//메소드 선언
    public void method1(){      // extends로 A를 상속받아서 사용 가능해짐
        this.field = "value";
        this.method();
    }


	//메소드 선언
    // 직접 객체 생성해서 사용할수 없음  >> super를 통해서 간접적으로 사용 가능
    public void method2(){
//        A a.f = new A();
//        a.field = "value";
//        a.method();
    }


}