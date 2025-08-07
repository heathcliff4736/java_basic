package javabasic_02.day11.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();
//		child.method1();

		//자동 타입 변환
		Parent parent = child;

		//메소드 호출
		parent.method1();
		System.out.println(parent.name);
//		System.out.println(parent.childName);      >> 데이터 제한으로 오류
		
//		parent.method2();
//		parent.method3();     부모타입. 메모리 공간 제한  (자식의 메모공간이 더 크다)
		Child child1 = (Child) parent;
//		child1.method3();
		System.out.println(child1.childName);

	}
}