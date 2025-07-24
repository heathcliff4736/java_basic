package day02;

public class BooleanEx {
    public static void main(String[] args) {

        /*//boolean stop = true;
        boolean stop = false;
        if(stop){
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }*/

        //boolean result = true;

        int x = 30;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (0 < x && x < 30);
        boolean result4 = (x < 0 || x >= 30);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}
