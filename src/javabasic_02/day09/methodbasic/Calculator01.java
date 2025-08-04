package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Calculator01 {
    // 입력기능을 위한 스캐너 멤버
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // 사용자에게 한 줄로 원하는 데이터를 입력받기 5 2 1
        menu();
        String inputData = in.nextLine();
        int[] fixData = inputDataProcess(inputData);
        adder(fixData);
        minus(fixData);
        mul(fixData);
        div(fixData);
    }

    // 사용자 입력 데이터 처리 기능  : public static String[] inputDataProcess(String inputData);
    public static int[] inputDataProcess(String inputData) {
        String[] splitdata = inputData.split(" ");
        int data1 = Integer.parseInt(splitdata[0]);
        int data2 = Integer.parseInt(splitdata[1]);
        int data3 = Integer.parseInt(splitdata[2]);

//        int[] data = new int[splitdata.length];
//        for (int i = 0; i < splitdata.length; i++) {
//            data[i] = Integer.parseInt(splitdata[i]);
//        }

        int[] datas = new int[]{data1, data2, data3};

        return datas;
    }

    // menu 기능  : public static void menu();
    public static void menu() {

    }

    // 사칙연산 기능
    public static void adder(int[] datas) {
        System.out.println(datas[0] + datas[1]);
    }

    public static void minus(int[] datas) {
        System.out.println(datas[0] - datas[1]);
    }

    public static void mul(int[] datas) {
        System.out.println(datas[0] * datas[1]);
    }

    public static void div(int[] datas) {
        try{
            int result = datas[0] / datas[1];
            System.out.println(result);
        } catch (Exception e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}
