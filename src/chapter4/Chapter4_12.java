package chapter4;

import java.util.Scanner;

public class Chapter4_12 {
    public static void main(String[] args) {
        // 양의 정숫값을 0까지 카운트다운하는 4_5문제를 for문으로 작성.
        Scanner scn = new Scanner(System.in);

        System.out.print("몇부터 카운트다운할까? : ");
        int x = scn.nextInt();

        if (x > 0) {
            for ( ; x >= 0 ; x--) {
                System.out.println(x);
            }
        }
    }
}
