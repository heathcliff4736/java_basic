package project;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 7;

    public static void main(String[] args) {
        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];

        Scanner sc = new Scanner(System.in);
        String userName;
        String userMobile;

        System.out.print("당신의 이름을 입력하세요 : ");
        userName = sc.nextLine();

        System.out.print("연락처를 입력하세요 : ");
        userMobile = sc.nextLine();
        Boolean quit = false;

        while (!quit) {

            System.out.println("*****************************************************************");
            System.out.println("                Welcome to Shopping Mall");
            System.out.println("                Welcome to Book Market!");
            /*
            System.out.println("*****************************************************************");
            System.out.println("1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기 ");
            System.out.println("3. 장바구니 비우기          6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기          8. 종료");
            System.out.println("*****************************************************************");
            */
            menuIntroduction();
            System.out.print("메뉴 번호를 선택해주세요 ");

            int menuNumber = sc.nextInt();

            switch (menuNumber) {
                case 1:
//                    System.out.println("현재 고객 정보 :");
//                    System.out.printf("이름 %s   연락처 %s\n", userName, userMobile);
                    menuGuestInfo(userName, userMobile);
                    break;
                case 2:
//                    System.out.println("장바구니 상품 목록입니다.");
                    menuCartItemList();
                    break;
                case 3:
//                    System.out.println("장바구니를 비웁니다.");
                    menuCartClear();
                    break;
                case 4:
//                    System.out.println("장바구니에 추가할 항목을 입력해주세요. ");
//                    menuCartAddItem();
                    break;
                case 5:
//                    System.out.println("장바구니의 항목 수량 줄이기를 선택하셨습니다. ");
                    menuCartRemoveItemCount();
                    break;
                case 6:
//                    System.out.println("장바구니의 항목을 삭제합니다. ");
                    menuCartRemoveItem();
                    break;
                case 7:
//                    System.out.println("영수증을 표시합니다.");
                    menuCartBill();
                    break;
                case 8:
//                    System.out.println("시스템이 종료됩니다. ");
                    menuExit();
                    quit = true;
                    break;
                default:
                    System.out.println("1~8의 숫자만 입력해주세요. ");
                    break;
            }
        }
    }   // main

    public static void menuIntroduction(){
        System.out.println("*****************************************************************");
        System.out.println(" 1. 고객 정보 확인하기            4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기        5. 장바구니의 항목 수량 줄이기 ");
        System.out.println(" 3. 장바구니 비우기               6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기               8. 종료");
        System.out.println("*****************************************************************");
    }

    public static void menuGuestInfo(String name, String userMobile){
        System.out.println("현재 고객  정보 : ");
        System.out.println("이름 " + name + " 연락처 " + userMobile);
    }
    
    public static void menuCartItemList() {
        System.out.println("2. 장바구니 상품 목록 :");
    }
    public static void menuCartClear() {
        System.out.println("3. 장바구니 비우기");
    }
    public static void menuCartAddItem(String[][] book) {
//        System.out.println("4. 장바구니에 항목 추가하기");

        BookList(book);
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.println(book[i][j]+"|");
            }
            System.out.println("");
        }

        Boolean quit = false;

        while (!quit) {
            System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            boolean flag = false;
            int numId = -1;

            for (int i = 0; i < NUM_BOOK; i++) {
                if (str.equals(book[i][0])) {
                    numId = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")){
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");
                }
                    quit = true;
            } else System.out.println("다시 입력해 주세요");
        }
    }
    public static void menuCartRemoveItemCount() {
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }
    public static void menuCartRemoveItem() {
        System.out.println("6. 장바구니의 항목 삭제하기");
    }
    public static void menuCartBill() {
        System.out.println("7. 영수증 표시하기");
    }
    public static void menuExit() {
        System.out.println("8. 종료");
    }
    public static void BookList(String[][] book) {

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }
}
