package chapter4;

import java.util.Scanner;

public class Chapter4_9 {
    public static void main(String[] args) {
        // 양의 정숫값을 읽어 자릿수를 출력하는 프로그램
        Scanner scn = new Scanner(System.in);

        int x;

        do {
            System.out.println("양의 정수 입력 : ");
            x = scn.nextInt();
        } while (x <= 0);

        int digit = 0;
        while (x > 0) {
            digit++;
            x /= 10;
        }
        System.out.println("입력한 숫자의 자릿수는 " + digit + " 자릿수");
    }
}
