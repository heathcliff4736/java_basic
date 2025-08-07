package javabasic_02.day11.sec07.exam03;

import javabasic_02.day11.sec06.package2.C;

public class ChildExample {
	public static void main(String[] args) {
		//부모 타입으로 자식객체 생성
		Parent parent = new Child();
		//객체 생성 및 자동 타입 변환

		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "data1111";
		parent.method1();
		parent.method2();
//		parent.field2 = "data2222";
//		parent.method3();                    타입제한
		
		//강제 타입 변환
		Child child = (Child) parent;
		child.field2 = "data22222";
		child.method3();
		
		//Child 타입으로 필드와 메소드 사용

	}
}