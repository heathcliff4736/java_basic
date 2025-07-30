package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[100];
        while (true){
            int i=0;
            if (sc.nextInt()==-1){
                for (int j = outputArray.length-3; j < outputArray.length; j++) {
                    System.out.print(outputArray[j]+" ");
                }
                break;
            }
            else outputArray[i] = sc.nextInt();
            i++;
            if (i>99) break;
        }
    }
}
