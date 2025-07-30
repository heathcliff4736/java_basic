package javabasic_01.day03;

public class OperatorEx03 {
    public static void main(String[] args) {

        int charCode = 'A';
        if((65<= charCode) && ( charCode <=90)){
            System.out.println("알파벳 대문자 입니다.");
        }

        if((97<= charCode) && (charCode <= 122)){
            System.out.println("알파벳 소문자 입니다.");
        }

        charCode = '5';
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9 사이의 숫자입니다.");
        }
        // 현재 value의 값이 2의 배수 또는 3의 배수인지를 검사하는 수식을 구하세요
        int value = 6;
        if ((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수이네요");
        }

        value = 7;
        boolean result = (value % 2 == 0) || (value% 3 == 0);
        System.out.println(result);
        if(!result){
            System.out.println("2또는 3의 배수가 아닙니다.");
        }
    }
}
