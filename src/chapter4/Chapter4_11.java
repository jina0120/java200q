package chapter4;

import java.util.Scanner;

public class Chapter4_11 {
    public static void main(String[] args) {
        // 기호 문자를 임의의 개수만큼 출력하는 프로그램 (4_7을 for문으로 작성)
        Scanner scn = new Scanner(System.in);

        System.out.println("몇 개의 *을 출력할까? : ");
        int x = scn.nextInt();

        if (x > 0) {
            for (int i = 1 ; i <= x ; i++) {
                System.out.print("*");
            }
        }
    }
}
