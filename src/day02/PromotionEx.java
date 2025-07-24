package day02;

public class PromotionEx {
    public static void main(String[] args) {

        //byte<short,char<int<long<float<double

        byte byteValue = 10;
        int intValue = byteValue; //자동타입 변환
//        int intValue = (int)byteValue;
//        System.out.println(intValue);

        long longValue = 500000000L;    //long 리터럴 정의시 L, l을 뒤에 붙인다.
        long longValue1 = 500000000;

//        System.out.println(longValue);
//        System.out.println(longValue1);

        float floatValue = longValue;
        double doubleValue = longValue;

//        System.out.println(floatValue);
//        System.out.println(doubleValue);

        double d1 = 5e2; // 5.0 * 10^2
//        System.out.println(d1);
        double d2 = 0.12e-2; // 0.12 * 10^-2
//        System.out.println(d2);
        double d3 = 3.14;
//        System.out.println(d3);
        double d4 = 314e-2;
//        System.out.println(d1+" "+d2+" "+d3+" "+d4);

        float f1 = 3.14f;
        float f2 = 3E6F;
        System.out.println(f1+" "+f2);

    }
}
