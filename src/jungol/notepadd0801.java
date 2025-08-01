package jungol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class notepadd0801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] outputArray = new Integer[10];
        for (int i = 0; i < outputArray.length; i++) {
            char ch1 = sc.next().charAt(0);
            outputArray[i] = (int)ch1;

        }
        Arrays.sort(outputArray, Collections.reverseOrder());
        for (int i = 0; i < outputArray.length; i++) {
//            System.out.print(outputArray[i]+" ");
            int in = outputArray[i];
            char ch = (char) in;
            System.out.print(ch+" ");
        }


    }
}
