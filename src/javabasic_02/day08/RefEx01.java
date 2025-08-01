package javabasic_02.day08;

public class RefEx01 {
    public static void main(String[] args) {
        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");         // Heap 메모리
        refVar2 = "자바";                            // literal pool
        String refVar3 = "자바";                     // Heap 메모리
        String refVar4 = null;

        System.out.println(refVar1 == refVar2);     // 주솟값 비교
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("=======================");
        System.out.println(refVar1.equals(refVar2));                        // 문자열 비교

        System.out.println("======NullPointException");
        System.out.println(refVar4);
        System.out.println(refVar4.length());


    }
}
