package javabasic_02.day11.sec10.exam01;

public class PhoneExample {
	public static void main(String[] args) {

//		Phone phone = new Phone();    Phone이 추상클래스이므로

		SmartPhone smartPhone = new SmartPhone("신세계");
		smartPhone.turnOn();
		smartPhone.internet();
		smartPhone.turnOff();
	}
}