package day02;

public class CastingEx {
    public static void main(String[] args) {


        //long => int 8 => 4

        long longValue = 300;
        int intValue = (int)longValue;

//        System.out.println(intValue);

        //int => char   //주의
        //int타입은 char타입으로 자동변환 되지 않고, (char)강제캐스팅해야한다.  0~65535 음수 안됨

        int intValue2 = 65;
        char charValue = (char) intValue2;
//        System.out.println(charValue);

        //실수 => 정수

        double doubleValue2 = 3.14;
        int intValue3 = (int) doubleValue2;
//        System.out.println(intValue3);

        byte result = 10 + 20;      //컴파일 byte result = 30  => 바이트 코드로 생성

        int result1 = intValue2 + intValue3;
        double result2 = 1.2f + 2.4f;   // 컴파일 byte result2 = 4.6f;

        double result3 = 1.2f + 3.4;

        //예외사항 정리   자바에서 + 연산자 두가지 기능 덧셈연산, 연결연산

        int v1 = 3 + 7; //int v1= 10;
//        System.out.println(v1);

        
        // 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동변환되어 문자열 결합연산 수행
        String str1 = "3" + 7;  //String str1 = "3"+ "7"        str1 = "37"
//        System.out.println(str1);
        String str2 = 3 + "7";
//        System.out.println(str2);

        int v2 = 1 + 2 + 3; // 3 + 3    => 6    int v2 = 6'
        String str = "";    // 문자열 초기화 방법

        str = 1 + 2 + ", 3 ";      //
        System.out.println(str);

        str = 1 + ", 2, " + 3;
        System.out.println(str);

        str = "1, " + 2 + 3;      //"12" + 3 => "123"
        System.out.println(str);

        str = "1, " + (2 + 3);      //"12" + 3 => "123"
        System.out.println(str);

    }
}
