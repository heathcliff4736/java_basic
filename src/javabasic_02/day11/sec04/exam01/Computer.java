package javabasic_02.day11.sec04.exam01;

public class Computer extends Calculator {

    //메소드 오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircl() 실행");
//        return Math.PI * r * r;

        double rr = super.areaCircle(r);
        return Math.PI * rr * rr;
    }
}