package chapter3;

import java.util.Scanner;

public class Chapter3_18 {
    public static void main(String[] args) {
        // 2개의 정숫값을 입력받아 내림차순으로 정렬하는 프로그램
        Scanner scn = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = scn.nextInt();
        System.out.println("정수 b : ");
        int b = scn.nextInt();

        if (a < b) {
            int n = a;
            a = b;
            b = n;
        }
        System.out.println("a와 b의 값을 내림차순 정렬, a의 값은 " + a + ", b의 값은 " + b);
    }
}
